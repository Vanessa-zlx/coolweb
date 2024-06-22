package cn.sakuraxiafan.coolweb.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class PostComment {
    private int id;
    private int userId;
    private int postId;
    private Integer parentId;
    private Integer targetId;
    private String content;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp date;
}
