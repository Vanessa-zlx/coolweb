package cn.sakuraxiafan.coolweb.service.impl;

import cn.sakuraxiafan.coolweb.entity.PostComment;
import cn.sakuraxiafan.coolweb.mapper.PostCommentMapper;
import cn.sakuraxiafan.coolweb.service.PostCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostCommentServiceImpl implements PostCommentService {
    @Autowired
    private PostCommentMapper postCommentMapper;

    @Override
    public PostComment getCommentById(int id) {
        return postCommentMapper.findById(id);
    }

    @Override
    public List<PostComment> getCommentsByPostId(int postId) {
        return postCommentMapper.findByPostId(postId);
    }

    @Override
    public List<PostComment> getCommentsByParentId(int parentId) {
        return postCommentMapper.findByParentId(parentId);
    }

    @Override
    public void addComment(PostComment postComment) {
        postCommentMapper.insert(postComment);
    }

    @Override
    public void updateComment(PostComment postComment) {
        postCommentMapper.update(postComment);
    }

    @Override
    public void deleteComment(int id) {
        postCommentMapper.delete(id);
    }
}
