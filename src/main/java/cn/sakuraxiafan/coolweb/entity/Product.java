package cn.sakuraxiafan.coolweb.entity;

import lombok.Data;

@Data
public class Product {
    private int id;
    private String productName;
    private String productBrief;
    private double productPrice;
    private String productCover;
    private String productIp;
    private String productBrand;
}