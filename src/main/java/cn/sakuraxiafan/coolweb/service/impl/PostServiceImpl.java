package cn.sakuraxiafan.coolweb.service.impl;

import cn.sakuraxiafan.coolweb.entity.Post;
import cn.sakuraxiafan.coolweb.mapper.PostMapper;
import cn.sakuraxiafan.coolweb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostMapper postMapper;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    private static final String POST_VIEW_COUNT_KEY = "post:viewCount:";

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
    public Post selectPostForUpdate(Integer id) {
        return postMapper.selectPostForUpdate(id);
    }

    @Override
    public int insertPost(Post post) {
        return postMapper.insertPost(post);
    }

    @Override
    public int updatePost(Post post) {
        return postMapper.updatePost(post);
    }

    @Override
    public int incrementViewCount(Integer id) {
        String key = POST_VIEW_COUNT_KEY + id;
        redisTemplate.opsForValue().increment(key, 1);
        redisTemplate.expire(key, 1, TimeUnit.DAYS); // 设置过期时间，防止Redis内存占用过多
        return 1;
    }

    @Override
    public void syncViewCountsToDatabase() {
        List<Post> posts = postMapper.selectPosts();
        for (Post post : posts) {
            String key = POST_VIEW_COUNT_KEY + post.getId();
            Integer viewCount = (Integer) redisTemplate.opsForValue().get(key);
            if (viewCount != null) {
                postMapper.updateViewCount(post.getId(), viewCount);
            }
        }
    }
}
