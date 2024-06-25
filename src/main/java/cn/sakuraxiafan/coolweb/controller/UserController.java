package cn.sakuraxiafan.coolweb.controller;

import cn.sakuraxiafan.coolweb.entity.User;
import cn.sakuraxiafan.coolweb.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/user/select")
    public List<User> selectUsers() {
        return userService.selectUsers();
    }

    @GetMapping("/user/delete")
    int deleteUser(Integer id) {
        return userService.deleteUser(id);
    }

    /**
     *
     * @param user login.html传入的用户信息，userLogin字段非空，userPass字段非空
     * @param session 当前HTTP会话，登陆成功则将用户信息存入会话
     * @return 1：登陆成功；2:登陆失败，检查用户名或密码是否正确
     */
    @PostMapping("/login")
    public int login(@RequestBody User user, HttpSession session) {
        return userService.login(user, session);
    }

    @PostMapping("/reg")
    public int register(@RequestBody User user) {
        return userService.register(user);
    }

    @RequestMapping("/user/logout")
    public void logout(HttpSession session) {
        userService.logout(session);
    }

    @RequestMapping("/user/getsession")
    public User getUerInSession(HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user==null){
            System.out.println("no user session");
            return new User();
        }
        System.out.println(user.getName()+" login by session");
        return userService.selectUser(user.getName());
    }

    @RequestMapping("/user/update")
    public int updateUser(@RequestBody User user, HttpSession session) {
        return userService.updateUser(user, session);
    }
}
