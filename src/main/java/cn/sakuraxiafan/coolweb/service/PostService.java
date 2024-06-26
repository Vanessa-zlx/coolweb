package cn.sakuraxiafan.coolweb.service;

import cn.sakuraxiafan.coolweb.entity.Post;

import java.util.List;
import java.util.concurrent.TimeUnit;

public interface PostService {
    List<Post> selectPosts();
    int deletePost(Integer id);
    Post selectPost(Integer id);
    Post selectPostForUpdate(Integer id);
    int insertPost(Post post);
    int incrementViewCount(Integer id);
    void syncViewCountsToDatabase();
    int updatePost(Post post);
}
