package cn.sakuraxiafan.coolweb.service;

import cn.sakuraxiafan.coolweb.entity.Game;

public interface GameService {
    Game selectById(Integer id);
    int deleteById(Integer id);
    int addGameImg(Integer id, String url);
    int updateTitle(Integer id, String title);
    int updateBrief(Integer id, String brief);
    int updateImgs(Integer id, String imgs);
    int updateTags(Integer id, String tags);
}
