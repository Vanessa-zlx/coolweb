package cn.sakuraxiafan.coolweb.controller;

import cn.sakuraxiafan.coolweb.entity.Post;
import cn.sakuraxiafan.coolweb.entity.User;
import cn.sakuraxiafan.coolweb.service.impl.PostServiceImpl;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;

@RestController
public class PostController {
    @Autowired
    private PostServiceImpl postService;

    @GetMapping("/post/select")
    public List<Post> selectPosts() {
        return postService.selectPosts();
    }

    @GetMapping("/post/select/id")
    public Post selectPost(Integer id) {
        return postService.selectPost(id);
    }

    @DeleteMapping("/post/delete")
    public int deletePost(Integer id) {
        return postService.deletePost(id);
    }

    @PostMapping("/post/update")
    public int updatePost(@RequestBody Post post) {
        return postService.updatePost(post);
    }

    @PostMapping("/post/insert")
    public int insert(HttpSession session, @RequestBody Post post) {
        User user = (User) session.getAttribute("user");//未登录用户有拦截器
        post.setPostAuthor(user.getName());
        post.setPostDate(new Timestamp(System.currentTimeMillis()));
        post.setViewCount(0);
        post.setCommentCount(0);
        return postService.insertPost(post);
    }

    @PostMapping("/post/incrementViewCount")
    public int incrementViewCount(@RequestBody Integer postId) {
        return postService.incrementViewCount(postId);
    }

}
