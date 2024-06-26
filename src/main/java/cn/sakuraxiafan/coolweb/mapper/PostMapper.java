package cn.sakuraxiafan.coolweb.mapper;

import cn.sakuraxiafan.coolweb.entity.Post;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PostMapper {

    @Select("SELECT id, post_author, post_content, post_title, post_cover, post_date, view_count, comment_count, post_brief FROM tech_post;")
    List<Post> selectPosts();

    @Select("SELECT id, post_author, post_content, post_title, post_cover, post_date, view_count, comment_count, post_brief FROM tech_post WHERE id = #{id};")
    Post selectPost(Integer id);

    @Delete("DELETE FROM tech_post WHERE id = #{id}")
    int deletePost(Integer id);

    @Insert("INSERT INTO tech_post(post_author, post_content, post_title, post_cover, post_date, view_count, comment_count, post_brief) " +
            "VALUES (#{postAuthor}, #{postContent}, #{postTitle}, #{postCover}," +
            " #{postDate}, #{viewCount}, #{commentCount}, #{postBrief});")
    int insertPost(Post post);

    @Select("SELECT id, post_author, post_content, post_title, post_cover, post_date, view_count, comment_count, post_brief FROM tech_post WHERE id = #{id} FOR UPDATE")
    Post selectPostForUpdate(Integer id);

    @Update("UPDATE tech_post SET post_author = #{postAuthor}, post_content = #{postContent}, post_title = #{postTitle}, post_cover = #{postCover}, " +
            "post_date = #{postDate}, view_count = #{viewCount}, comment_count = #{commentCount}, post_brief = #{postBrief} WHERE id = #{id}")
    int updatePost(Post post);

    @Update("UPDATE tech_post SET view_count = #{viewCount} WHERE id = #{id}")
    int updateViewCount(@Param("id") Integer id, @Param("viewCount") int viewCount);

}
//    @Results(id = "postResultMap", value = {
//            @Result(property = "id", column = "id", javaType = Integer.class),
//            @Result(property = "postAuthor", column = "post_author", javaType = String.class),
//            @Result(property = "postContent", column = "post_content", javaType = String.class),
//            @Result(property = "postTitle", column = "post_title", javaType = String.class),
//            @Result(property = "postCover", column = "post_cover", javaType = String.class),
//            @Result(property = "postDate", column = "post_date", javaType = Timestamp.class),
//            @Result(property = "viewCount", column = "view_count", javaType = long.class),
//            @Result(property = "commentCount", column = "comment_count", javaType = long.class),
//            @Result(property = "postBrief", column = "post_brief", javaType = String.class)
//    })