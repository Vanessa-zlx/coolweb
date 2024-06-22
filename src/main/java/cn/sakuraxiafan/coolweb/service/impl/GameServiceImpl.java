package cn.sakuraxiafan.coolweb.service.impl;

import cn.sakuraxiafan.coolweb.entity.Game;
import cn.sakuraxiafan.coolweb.mapper.GameMapper;
import cn.sakuraxiafan.coolweb.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {
    @Autowired
    private GameMapper gameMapper;
    @Override
    public Game selectById(Integer id) {
        return gameMapper.selectById(id);
    }

    @Override
    public int deleteById(Integer id) {
        return gameMapper.deleteById(id);
    }

    @Override
    public int addGameImg(Integer id, String url) {
        return gameMapper.addGameImg(id, url);
    }

    @Override
    public int updateTitle(Integer id, String title) {
        return gameMapper.updateTitle(id, title);
    }

    @Override
    public int updateBrief(Integer id, String brief) {
        return gameMapper.updateBrief(id, brief);
    }

    @Override
    public int updateImgs(Integer id, String imgs) {
        return gameMapper.updateImgs(id, imgs);
    }

    @Override
    public int updateTags(Integer id, String tags) { return gameMapper.updateTags(id, tags);}
}
