package cn.sakuraxiafan.coolweb.service.impl;

import cn.sakuraxiafan.coolweb.entity.User;
import cn.sakuraxiafan.coolweb.mapper.UserMapper;
import cn.sakuraxiafan.coolweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUsers() {
        return userMapper.selectUsers();
    }

    @Override
    public int deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public User selectUser(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public User selectUser(String userLogin) {
        return userMapper.selectByUserName(userLogin);
    }

    /**
     *
     * @param user login.html传入的用户信息，userLogin字段非空，userPass字段非空
     * @param session 当前HTTP会话，登陆成功则将用户信息存入会话
     * @return 1：登陆成功；2:登陆失败，检查用户名或密码是否正确
     */
    @Override
    public int login( User user, HttpSession session) {
        User res = userMapper.selectByUserName(user.getName());
        if (res != null && user.getPassword().equals(res.getPassword())) {
            System.out.println("用户" + res.getName() + "登陆成功");
            session.setAttribute("user", res);
            return 1;
        } else {
            return 0;
        }
    }

    /**
     *
     * @param user login.html传入的用户信息，userLogin字段非空，userPass字段非空
     * @return 1：注册成功；2:注册失败，用户名重复或其它错误
     */
    @Override
    public int register(User user) {
        /*isAmdin*/

        user.setAdmin(false);
        User res = selectUser(user.getName());  //userLogin值唯一
        if (res == null && userMapper.insertUser(user) > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public void logout(HttpSession session) {
        // 首先通过 session.getAttribute("user") 获取会话中名为 "user" 的属性值。如果该属性值不为 null，
        // 则调用 session.removeAttribute("user") 方法来移除名为 "user" 的属性，从而实现移除用户信息的操作。
        if (session.getAttribute("user") != null) {
            session.removeAttribute("user");
        }
    }

    @Override
    public int updateUser(User user, HttpSession session) {
        /*?  */
        User u = userMapper.selectByUserName(user.getName());
        if (u != null && u.getPassword().equals(user.getPassword())) {
            return userMapper.updateUserInfo(user);
        }
        return 0;
    }

}
