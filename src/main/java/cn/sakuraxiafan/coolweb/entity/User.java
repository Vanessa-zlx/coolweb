package cn.sakuraxiafan.coolweb.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String nickname;
    private String avatarUrl;//头像图片路径
    private boolean isAdmin;
    private String phone;
    private Integer gender;
//    private Integer status;
//    private Integer credit;
}
