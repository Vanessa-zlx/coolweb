package cn.sakuraxiafan;

import cn.sakuraxiafan.coolweb.entity.User;
import cn.sakuraxiafan.coolweb.service.UserService;
import cn.sakuraxiafan.coolweb.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Timestamp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
    }
}
