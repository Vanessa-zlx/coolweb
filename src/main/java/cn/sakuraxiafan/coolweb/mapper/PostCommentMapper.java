package cn.sakuraxiafan.coolweb.mapper;

import cn.sakuraxiafan.coolweb.entity.PostComment;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PostCommentMapper {
    @Select("SELECT * FROM post_comment WHERE id = #{id}")
    PostComment findById(int id);

//    SELECT comments.comment, users.username, users.nickname
//    FROM comments
//    JOIN users ON comments.username = users.username;

    @Select("SELECT post_comment.id, author, nickname, post_id, parent_id, target_id, content, date FROM post_comment " +
            "JOIN USER ON user.name=post_comment.author " +
            "WHERE post_id = #{postId} " )
    List<PostComment> findByPostId(int postId);

    @Select("SELECT * FROM post_comment WHERE parent_id = #{parentId}")
    List<PostComment> findByParentId(int parentId);

    @Insert("INSERT INTO post_comment(author, post_id, parent_id, target_id, content, date) " +
            "VALUES(#{author}, #{postId}, #{parentId}, #{targetId}, #{content}, #{date})")
//    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(PostComment postComment);

    @Update("UPDATE post_comment SET content = #{content}, date = #{date} WHERE id = #{id}")
    void update(PostComment postComment);

    @Delete("DELETE FROM post_comment WHERE id = #{id}")
    void delete(int id);
}
