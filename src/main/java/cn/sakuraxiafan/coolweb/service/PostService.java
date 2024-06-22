package cn.sakuraxiafan.coolweb.service;

import cn.sakuraxiafan.coolweb.entity.Post;

import java.util.List;

public interface PostService {
    List<Post> selectPosts();
    int deletePost(Integer id);
    Post selectPost(Integer id);
    int insertPost(Post post);
}
