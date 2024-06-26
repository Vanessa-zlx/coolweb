package cn.sakuraxiafan.coolweb.entity;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class Order {
    private Integer id;
    private Integer customerId;
    private String tradeNo;//64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
    private Timestamp creationTime;
    private Timestamp paymentTime;
    private String subject;//price(11)订单总金额，单位为元，精确到小数点后两位，取值范围为 [0.01,100000000]。金额不能为0。
    private double totalAmount;
    private String alipayTradeNo;
}


