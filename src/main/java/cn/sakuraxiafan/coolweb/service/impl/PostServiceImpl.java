package cn.sakuraxiafan.coolweb.service.impl;

import cn.sakuraxiafan.coolweb.entity.Post;
import cn.sakuraxiafan.coolweb.mapper.PostMapper;
import cn.sakuraxiafan.coolweb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostMapper postMapper;
    @Override
    public List<Post> selectPosts() {
        return postMapper.selectPosts();
    }

    @Override
    public int deletePost(Integer id) {
        return postMapper.deletePost(id);
    }

    @Override
    public Post selectPost(Integer id) {
        return postMapper.selectPost(id);
    }

    @Override
    public int insertPost(Post post) {

        return postMapper.insertPost(post);
    }
}
