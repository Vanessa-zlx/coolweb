package cn.sakuraxiafan.coolweb.controller;

import cn.sakuraxiafan.coolweb.entity.Game;
import cn.sakuraxiafan.coolweb.service.impl.GameServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    @Autowired
    private GameServiceImpl gameService;

    @RequestMapping("/game/select/id")
    Game selectById(Integer id) {
        return gameService.selectById(id);
    }
}
