package cn.sakuraxiafan.coolweb.config;

import cn.sakuraxiafan.coolweb.interceptor.AdminInterceptor;
import cn.sakuraxiafan.coolweb.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/orders/**");

        registry.addInterceptor(new AdminInterceptor())
                .addPathPatterns("/post/delete").addPathPatterns("/banner/delete").
                addPathPatterns("/product/delete/id","/product");
    }
}
