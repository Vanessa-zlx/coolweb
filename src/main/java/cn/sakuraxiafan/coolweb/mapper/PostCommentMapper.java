package cn.sakuraxiafan.coolweb.mapper;

import cn.sakuraxiafan.coolweb.entity.PostComment;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PostCommentMapper {
    @Select("SELECT * FROM post_comment WHERE id = #{id}")
    PostComment findById(int id);

    @Select("SELECT * FROM post_comment WHERE post_id = #{postId}")
    List<PostComment> findByPostId(int postId);

    @Select("SELECT * FROM post_comment WHERE parent_id = #{parentId}")
    List<PostComment> findByParentId(int parentId);

    @Insert("INSERT INTO post_comment(user_id, post_id, parent_id, target_id, content, date) " +
            "VALUES(#{userId}, #{postId}, #{parentId}, #{targetId}, #{content}, #{date})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(PostComment postComment);

    @Update("UPDATE post_comment SET content = #{content}, date = #{date} WHERE id = #{id}")
    void update(PostComment postComment);

    @Delete("DELETE FROM post_comment WHERE id = #{id}")
    void delete(int id);
}
