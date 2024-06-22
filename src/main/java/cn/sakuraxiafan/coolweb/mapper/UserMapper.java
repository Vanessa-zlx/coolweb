package cn.sakuraxiafan.coolweb.mapper;

import cn.sakuraxiafan.coolweb.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT id, name, email, password, nickname, avatar_url, is_admin, phone, gender FROM user;")
//    @Results(id = "userResultMap", value = {
//            @Result(property = "id", column = "id", javaType = Integer.class),
//            @Result(property = "userLogin", column = "user_login", javaType = String.class),
//            @Result(property = "userNicename", column = "user_nicename", javaType = String.class),
//            @Result(property = "userUrl", column = "user_url", javaType = String.class),
//            @Result(property = "isAdmin", column = "is_admin", javaType = boolean.class),
//            @Result(property = "userRegistered", column = "user_registered", javaType = Date.class),
//            @Result(property = "userPass", column = "user_pass", javaType = String.class),
//            @Result(property = "userEmail", column = "user_email", javaType = String.class),
//            @Result(property = "userTel", column = "user_tel", javaType = String.class),
//    })
    List<User> selectUsers();

    @Delete("DELETE FROM user WHERE id = #{id};")
    int deleteUser(Integer id);

    @Select("SELECT id, name, email, password, nickname, avatar_url, is_admin, phone, gender FROM user WHERE id = #{id};")
//    @ResultMap("userResultMap")
    User selectById(Integer id);

    @Select("SELECT id, name, email, password, nickname, avatar_url, is_admin, phone, gender " +
            "FROM user WHERE name = #{name};")
//    @ResultMap("userResultMap")
    User selectByUserName(String userLogin);

    @Insert("INSERT INTO user(name, email, password, nickname, is_admin) " +
            "VALUES (#{name}, #{email}, #{password}, #{nickname}, #{isAdmin});")
    int insertUser(User user);

    @Update("update user set email=#{email},password=#{password},nickname=#{nickname},phone=#{phone} " +
            "where name=#{name}")
    int updateUserInfo(User user);

    @Update("update user set avatar_url=#{avatarUrl} where name=#{name}")
    void updateUrl(@Param("avatarUrl") String avatarUrl, @Param("name") String name);
}
