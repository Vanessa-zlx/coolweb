package cn.sakuraxiafan.coolweb.interceptor;

import cn.sakuraxiafan.coolweb.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            System.out.println("need login "+request.getRequestURL().toString());
            response.sendRedirect("/index.html");
            return false;
        }
        return true;
    }
}
