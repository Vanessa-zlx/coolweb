package cn.sakuraxiafan.coolweb.controller;

import cn.sakuraxiafan.coolweb.entity.Order;
import cn.sakuraxiafan.coolweb.service.OrderService;
import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.config.AlipayConfig;
import com.alipay.easysdk.factory.Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@RestController
@RequestMapping("/alipay")
public class AliPayController {

    @Autowired
    OrderService orderService;

    @Autowired
    AlipayConfig alipayConfig;

//    @GetMapping("/pay") // &subject=xxx&traceNo=xxx&totalAmount=xxx
//    public void pay(@RequestParam("tradeNo") String tradeNo, HttpServletResponse httpResponse) throws Exception {
//        Order order = orderService.selectByTradeNo(tradeNo);
//        if (order == null) {
//            return;
//        }
//        System.out.println(tradeNo);
//        //获得初始化的AlipayClient
//        AlipayClient alipayClient = new DefaultAlipayClient(alipayConfig.getGatewayUrl(),
//                alipayConfig.getAppId(), alipayConfig.getAppPrivateKey(), "json",
//                alipayConfig.getCharset(), alipayConfig.getAlipayPublicKey(),
//                alipayConfig.getSign_type());
//        //设置请求参数
//        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
//        request.setNotifyUrl(alipayConfig.getNotifyUrl());
//        request.setReturnUrl(alipayConfig.getReturn_url());
////        JSONObject bizContent = new JSONObject();
////        bizContent.put("out_trade_no", order.getTradeNo());
////        bizContent.put("total_amount", order.getTotalAmount());
////        bizContent.put("subject", order.getSubject());
////        bizContent.put("product_code", order.getAlipayTradeNo());
////        request.setBizContent(bizContent.toString());
//        request.setBizContent("{\"out_trade_no\":\"" + order.getTradeNo() + "\","
//                + "\"total_amount\":\"" + order.getTotalAmount() + "\","
//                + "\"subject\":\"" + order.getSubject() + "\","
//                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
//        String form = "";
//        try {
//            form = alipayClient.pageExecute(request).getBody();
//        } catch (AlipayApiException e) {
//            e.printStackTrace();
//        }
//        System.out.println(form.toString());
//        httpResponse.setContentType("text/html;charset=utf-8");
//        // 直接将完整的表单html输出到页面
//        httpResponse.getWriter().write(form);
//        httpResponse.getWriter().flush();
//        httpResponse.getWriter().close();
//        System.out.println("done");
//
////        OutputStream outputStream = httpResponse.getOutputStream();
////        outputStream.write(form.getBytes());
////        outputStream.flush();
////        outputStream.close();
////
//    }

    private static final String FORMAT ="JSON";
    private static final String CHARSET ="utf-8";
    private static final String SIGN_TYPE ="RSA2";
    @GetMapping("/pay") // &subject=xxx&traceNo=xxx&totalAmount=xxx
    public void pay(Order aliPay, HttpServletResponse httpResponse) throws Exception {
        if (orderService.selectByTradeNo(aliPay.getTradeNo())==null){
            return;
        }
        System.out.println(alipayConfig);
        AlipayClient alipayClient = new DefaultAlipayClient(alipayConfig.getGatewayUrl(), "",
                alipayConfig.getAppPrivateKey(), FORMAT, CHARSET, alipayConfig.getAlipayPublicKey(), SIGN_TYPE);
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        request.setNotifyUrl("http://2a935m.natappfree.cc/alipay/notify");
        request.setReturnUrl("http://2a935m.natappfree.cc/orders.html");
        request.setBizContent("{\"out_trade_no\":\"" + aliPay.getTradeNo() + "\","
                + "\"total_amount\":\"" + aliPay.getTotalAmount() + "\","
                + "\"subject\":\"" + aliPay.getSubject() + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        String form = "";
        try {
            // 调用SDK生成表单
            form = alipayClient.pageExecute(request, "post").getBody().
                    replaceAll("action=\"\"(.*?)\"(.*?)\"", "action=\"$1$2\"");
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        httpResponse.setContentType("text/html;charset=" + CHARSET);
        // 直接将完整的表单html输出到页面
        httpResponse.getWriter().write(form);
        httpResponse.getWriter().flush();
        httpResponse.getWriter().close();
        System.out.println("done");
    }

    @PostMapping("/notify")  // 注意这里必须是POST接口
    public String payNotify(HttpServletRequest request) throws Exception {
        if (request.getParameter("trade_status").equals("TRADE_SUCCESS")) {
            System.out.println("=========支付宝异步回调========");

            Map<String, String> params = new HashMap<>();
            Map<String, String[]> requestParams = request.getParameterMap();
            for (String name : requestParams.keySet()) {
                params.put(name, request.getParameter(name));
                 System.out.println(name + " = " + request.getParameter(name));
            }

            String tradeNo = params.get("out_trade_no");
            String gmtPayment = params.get("gmt_payment");
            String alipayTradeNo = params.get("trade_no");
            String sign = params.get("sign");

            String context = AlipaySignature.getSignCheckContentV1(params);
            boolean checkSignature = AlipaySignature.rsa256CheckContent(context, sign, alipayConfig.getAlipayPublicKey(), "UTF-8");


            // 支付宝验签
            if (checkSignature) {
                // 验签通过
                System.out.println("交易名称: " + params.get("subject"));
                System.out.println("交易状态: " + params.get("trade_status"));
                System.out.println("支付宝交易凭证号: " + params.get("trade_no"));
                System.out.println("商户订单号: " + params.get("out_trade_no"));
                System.out.println("交易金额: " + params.get("total_amount"));
                System.out.println("买家在支付宝唯一id: " + params.get("buyer_id"));
                System.out.println("买家付款时间: " + params.get("gmt_payment"));
                System.out.println("买家付款金额: " + params.get("buyer_pay_amount"));

                // 更新订单未已支付
                System.out.println("交易名称: " + params.get("subject"));
                System.out.println("交易状态: " + params.get("trade_status"));
                System.out.println("支付宝交易凭证号: " + params.get("trade_no"));
                System.out.println("商户订单号: " + params.get("out_trade_no"));
                System.out.println("交易金额: " + params.get("total_amount"));
                System.out.println("买家在支付宝唯一id: " + params.get("buyer_id"));
                System.out.println("买家付款时间: " + params.get("gmt_payment"));
                System.out.println("买家付款金额: " + params.get("buyer_pay_amount"));
                // 更新订单未已支付
                System.out.println("支付成功");
                Order order = orderService.selectByTradeNo(tradeNo);
                order.setAlipayTradeNo(alipayTradeNo);
                orderService.updateOrder(order);
            }
        }
        return "success";
    }
}