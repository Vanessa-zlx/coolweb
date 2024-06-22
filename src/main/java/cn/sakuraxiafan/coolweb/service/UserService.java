package cn.sakuraxiafan.coolweb.service;

import cn.sakuraxiafan.coolweb.entity.User;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface UserService {
    List<User> selectUsers();
    int deleteUser(Integer id);
    User selectUser(Integer id);
    User selectUser(String userLogin);
    int login(User user, HttpSession session);
    int register(User user);
    void logout(HttpSession session);

    int updateUser(User user, HttpSession session);
}
