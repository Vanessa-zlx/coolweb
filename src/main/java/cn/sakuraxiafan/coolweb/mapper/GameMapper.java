package cn.sakuraxiafan.coolweb.mapper;

import cn.sakuraxiafan.coolweb.entity.Game;
import org.apache.ibatis.annotations.*;

@Mapper
public interface GameMapper {
    @Select("SELECT id, game_title, game_brief, game_imgs , game_tags FROM acg_game WHERE id=#{id};")
    @Results(id = "game", value = {
            @Result(property = "id", column = "id", javaType = Integer.class),
            @Result(property = "title", column = "game_title", javaType = String.class),
            @Result(property = "brief", column = "game_brief", javaType = String.class),
            @Result(property = "imgs", column = "game_imgs", javaType = String.class),
            @Result(property = "tags", column = "game_tags", javaType = String.class),
    })
    Game selectById(Integer id);

    @Delete("DELETE FROM acg_game WHERE id=#{id};")
    int deleteById(Integer id);

    @Insert("INSERT INTO acg_game(game_title, game_brief) VALUES (#{title}, #{brief});")
    int insertGame(Game game);

    @Update("UPDATE acg_game SET game_imgs = CONCAT(game_imgs, ',', #{url}) WHERE id = #{id};")
    int addGameImg(Integer id, String url);

    @Update("UPDATE acg_game SET game_title = #{title} WHERE id = #{id};")
    int updateTitle(Integer id, String title);

    @Update("UPDATE acg_game SET game_brief = #{brief} WHERE id = #{id};")
    int updateBrief(Integer id, String brief);

    @Update("UPDATE acg_game SET game_imgs = #{imgs} WHERE id = #{id};")
    int updateImgs(Integer id, String imgs);

    @Update("UPDATE acg_game SET game_tags = #{tags} WHERE id = #{id};")
    int updateTags(Integer id, String tags);
}
