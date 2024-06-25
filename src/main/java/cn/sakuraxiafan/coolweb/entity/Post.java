package cn.sakuraxiafan.coolweb.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class Post {
    private Integer id;
    private String postAuthor;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp postDate;
    private String postStatus;
    private String postContent;
    private String postName;
    private String postTitle;
    private long commentCount;
    private String commentStatus;
    private String postCover;
    private String postBrief;
    private String categoryName;
    private long viewCount;
}
