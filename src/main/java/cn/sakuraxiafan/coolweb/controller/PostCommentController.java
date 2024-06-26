package cn.sakuraxiafan.coolweb.controller;

import cn.sakuraxiafan.coolweb.entity.Post;
import cn.sakuraxiafan.coolweb.entity.PostComment;
import cn.sakuraxiafan.coolweb.entity.User;
import cn.sakuraxiafan.coolweb.service.PostCommentService;
import cn.sakuraxiafan.coolweb.service.impl.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostCommentController {
    @Autowired
    private PostCommentService postCommentService;

    @Autowired
    private PostServiceImpl postService;

    // 获取某个帖子的所有评论
    @GetMapping("/{postId}/comments")
    public ResponseEntity<List<PostComment>> getCommentsByPostId(@PathVariable int postId) {
        System.out.println("请求"+postId+"的评论");
        List<PostComment> comments = postCommentService.getCommentsByPostId(postId);
        return ResponseEntity.ok(comments);
    }

    // 添加新评论
    @PostMapping("/{postId}/comments")
    public ResponseEntity<Integer> addComment(@RequestBody PostComment postComment, HttpSession session) {
        postComment.setDate(new Timestamp(System.currentTimeMillis()));
        if (postComment.getTargetId()!=null) {
            PostComment targetComment = postCommentService.getCommentById(postComment.getTargetId());
            if (targetComment.getParentId()==null) {
                postComment.setParentId(targetComment.getId());
            }else {
                postComment.setParentId(targetComment.getParentId());
            }
        }
        User user = (User) session.getAttribute("user");
        postComment.setAuthor(user.getName());

        Post post = postService.selectPostForUpdate(postComment.getPostId());
        post.setCommentCount(post.getCommentCount()+1);
        postService.updatePost(post);

        return ResponseEntity.ok(postCommentService.addComment(postComment));
    }
}
