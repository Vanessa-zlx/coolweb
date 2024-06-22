package cn.sakuraxiafan.coolweb.controller;

import cn.sakuraxiafan.coolweb.entity.PostComment;
import cn.sakuraxiafan.coolweb.service.PostCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/comments")
public class PostCommentController {
    @Autowired
    private PostCommentService postCommentService;

    // 获取某个帖子的所有评论
    @GetMapping("/post/{postId}")
    public ResponseEntity<List<PostComment>> getCommentsByPostId(@PathVariable int postId) {
        System.out.println("请求"+postId+"的评论");
        List<PostComment> comments = postCommentService.getCommentsByPostId(postId);
        return ResponseEntity.ok(comments);
    }

    // 添加新评论
    @PostMapping("/add")
    public ResponseEntity<String> addComment(@RequestBody PostComment postComment) {
        postComment.setDate(new Timestamp(System.currentTimeMillis()));
        postCommentService.addComment(postComment);
        return ResponseEntity.ok("Comment added successfully");
    }
}
