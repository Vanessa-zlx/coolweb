package cn.sakuraxiafan.coolweb.controller;

import cn.sakuraxiafan.coolweb.entity.Post;
import cn.sakuraxiafan.coolweb.entity.Product;
import cn.sakuraxiafan.coolweb.entity.User;
import cn.sakuraxiafan.coolweb.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductController {
    @Autowired
    ProductServiceImpl productService;

//    // 添加新评论
//    @PostMapping("/{postId}/comments")
//    public ResponseEntity<Integer> addComment(@RequestBody PostComment postComment, HttpSession session) {
//        return ResponseEntity.ok(productService.addComment(postComment));
//    }


    @GetMapping("/product/select")
    List<Product> selectProducts() {
        return  productService.selectProducts();
    }

    @GetMapping("/product/select/id")
    Product selectById(Integer id) {
        return productService.selectById(id);
    }

    @RequestMapping("/product/delete/id")
    int deleteProduct(Integer id) {
        return  productService.deleteProduct(id);
    }

    @PostMapping("/product")
    public int insert(@RequestBody Product product) {
        return productService.insertProduct(product);
//        return -1;
    }
//    @GetMapping("/product/pay")
//    public void pay(HttpSession session, HttpServletResponse httpResponse) throws Exception{
//        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi-sandbox.dl.alipaydev.com/gateway.do",
//                "9021000138652520",
//                "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCBqbY3XNriRcRDGC0jMBu9idwxdzx4lDJ3P8olMCLyBHmc9g8SurvMiUTCkVw/J4RXneH5/v+fTe38ujs7irUOms1To0EkYbm9yYgLmYmyMbOuAa76yA8+BRkg/tuhJhK0/WghiFA15MZdm+8WPdSMTisX/iTyw2VnI5OZsgPrWxueeOhyOtF2K1nhA5Zgr+nQXPUdmKFtDtJ2Zm8e+CKdF/audonU4o1zD4IA2ExAMxaONuYPdDpvrgwH/1ju/iQVYTHsfSxTu+Luy2fyWa06BZLS7HgTvwYh7wQ2PcVnNMKI/xDf/HpHO53J0Dlbq0S0gJWA5IIgQR4i6f9KcXwxAgMBAAECggEAPJ7LwjZ3XzKe/39eGwVy8rpxZ+8HJpiiv33jVF+c9umAshGYGnmTM505uH2dUyl2hkAaVncRq7kTewTWjI/c9mcJeADrg8bsv/5ozIOMDPOPvdqrpDPEbIqVpQeCR2U1eci/1m2Ukp3S4BD3Rr7BkJc7LoxzWcxgrEfFyiWgD3hujvOhMtdcYU4KwBqA4eI+bF9FArw15yThYh9AvtVYxSjUD3SKoDGX7PFgWw9wdJb9J2jDbxXeWdHjtlu5T0iOSaKLuDfh1Hm3xTiASBI+D5WKPYEMGGRARWl5+WT0oJqHeiWlZWwhNXsQFF/thgVxFw9zDcHePgyhw1Usg1gAwQKBgQC8GRf+N+2QkWQX/FQgmnT3dJlB7A//rBDNi7Oh4yeUcJg8W2JWmd7ge/mZS9ZeWBAvF8jyPHUqciBHpHVLjtFffXLyONW4sUK2TVtum8yiguBWPy1heRe1RPuOHSt18rmqMvWBpLgoUB4rb8OB8S34nBWGoL8ECBQmUZh8AE2fDwKBgQCweGSoIpGSO7fIhqnWUpHWTAJikRsTFnVTVE0uCPb9+jiqexyJrtBoZhjfYQ6qoZ+/gVeJe1t1MJ47B2/8tQwJSZYbpspkbOd+L2ejxvS6OVI0h+NelF4epty9l/G1aFKn3vOBgOb0gizGCoJXHZkLJ8l8hIiVfUgbYJElgfswvwKBgGKGYmLuuKk4/szxhr9tKEdV89Dr7ZVmc4a23mi1q029jIBQ/bmO74d2aM87QhY42oFQXBlGQbjx/qaIJkhljpYOB9+Ilaogb2k+K95MDWwyUX/bp9GetCRm9b0C2nj1ovrbpm058pxrGuJ1sFqoEgRe/Yd/O47JDITlyJFrNz1RAoGANglnqSSMtt6adEjoELzP83Lq+Au+4qVp385co9AS8cqBN5LjNjXVk2JQE3bA6vb618VfbLXdV5E/oouwew1lViK2WFlGeGHwsO8LKVdu8OdEiNljgj6kY3Zs+ZFhbk83oDfhELLMBesmkq39I3fouUXBqONcf4oRXnC/gWC/7jkCgYEAngN/eFqkxwS7QmrrXPeJ0O0ettX2Q0w26zQ3180Qk9Gh9b/f2jd0FgXALAPuEP/k0th+gqoR9pNBt3U5AE0lBcJPOYw6xve/OZYdE9pQVdBgywOHgZZN2qZlJGSJUk2RSROIWKulkUrJy1WRf7mMHwDue4m1XmJI8HNWDa4p9FY=",
//                "json","utf-8",
//                "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtbva/XQXDVRgtUTYdlD5LbsGQK3EE2Ycf8xv8CRe89uchU7WFi2nIuBZY/Hy74v9or6BTPRMbzI3rqBFH0h6xsW8314JdvNRJjN6Xnd3swpcANuI+em854Lpcjya4OtbhRWBdFL9Y7hGR2VWvkYByGAL6WC8zqGKsUcQV4xd5bJazQ9+pL/x+FFnQjoC5VpHrkrR9bjV7W0F+W7kyplOEJSG/jgCz3WjKnz5JKLy5YfQHuoXxRtwdKWdGccKxXtwgkMaBRXvwgLdPNpZETNetig2zeUx+WyfbP0ZvySeIT4+jj3GQaxCTfkBPEHRLJMWMkSJzAaFlDbRDUqL7EaKCwIDAQAB",
//                "RSA2");
//        AlipayTradePrecreateRequest request = new AlipayTradePrecreateRequest();
//        AlipayTradePrecreateModel model = new AlipayTradePrecreateModel();
//        request.setBizModel(model);
//        model.setOutTradeNo(System.currentTimeMillis());
//        model.setTotalAmount("88.88");
//        model.setSubject("Iphone6 16G");
//        AlipayTradePrecreateResponse response = null;
//        String form = "";
//        try {
//            // 调用SDK生成表单
//            form = alipayClient.pageExecute(request).getBody();
//        } catch (AlipayApiException e) {
//            throw new RuntimeException(e);
//        }
//        httpResponse.setContentType("text/html;charset=utf-8");
//        // 直接将完整的表单html输出到页面
//        httpResponse.getWriter().write(form);
//        httpResponse.getWriter().flush();
//        httpResponse.getWriter().close();
//    }
//
//    @PostMapping("/notify")  // 注意这里必须是POST接口
//    public String payNotify(HttpServletRequest request) throws Exception {
//        if (request.getParameter("trade_status").equals("TRADE_SUCCESS")) {
//            System.out.println("=========支付宝异步回调========");
//
//            Map<String, String> params = new HashMap<>();
//            Map<String, String[]> requestParams = request.getParameterMap();
//            for (String name : requestParams.keySet()) {
//                params.put(name, request.getParameter(name));
//                 System.out.println(name + " = " + request.getParameter(name));
//            }
//
//            String tradeNo = params.get("out_trade_no");
//            String gmtPayment = params.get("gmt_payment");
//            String alipayTradeNo = params.get("trade_no");
//            // 支付宝验签
//            if (Factory.Payment.Common().verifyNotify(params)) {
//                // 验签通过
//                System.out.println("交易名称: " + params.get("subject"));
//                System.out.println("交易状态: " + params.get("trade_status"));
//                System.out.println("支付宝交易凭证号: " + params.get("trade_no"));
//                System.out.println("商户订单号: " + params.get("out_trade_no"));
//                System.out.println("交易金额: " + params.get("total_amount"));
//                System.out.println("买家在支付宝唯一id: " + params.get("buyer_id"));
//                System.out.println("买家付款时间: " + params.get("gmt_payment"));
//                System.out.println("买家付款金额: " + params.get("buyer_pay_amount"));
//                // 更新订单未已支付
//                Orders order = new Orders();
//                order.setId(Long.valueOf(tradeNo));
//                order.setStatus(2);
////                order.setCheckoutTime(params.get("gmt_payment"));
//                shopOrderMapper.updateById(order);
//            }
//        }
//        return "success";
//    }
}
