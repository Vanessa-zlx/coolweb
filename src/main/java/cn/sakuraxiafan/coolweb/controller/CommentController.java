package cn.sakuraxiafan.coolweb.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
    @RequestMapping("/comment/add")
    public String addComment(@RequestBody String comment){
        System.out.println(comment);
        return comment+" ok";
    }
}
