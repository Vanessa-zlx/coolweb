package cn.sakuraxiafan.coolweb.service;

import cn.sakuraxiafan.coolweb.entity.PostComment;

import java.util.List;

public interface PostCommentService {
    PostComment getCommentById(int id);

    List<PostComment> getCommentsByPostId(int postId);

    List<PostComment> getCommentsByParentId(int parentId);

    int addComment(PostComment postComment);

    void updateComment(PostComment postComment);

    void deleteComment(int id);
}
