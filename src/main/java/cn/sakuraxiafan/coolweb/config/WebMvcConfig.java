//package cn.sakuraxiafan.coolweb.config;
//
//import cn.sakuraxiafan.coolweb.interceptor.AdminInterceptor;
//import cn.sakuraxiafan.coolweb.interceptor.LoginInterceptor;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebMvcConfig implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**")
//                .excludePathPatterns("/reg", "/user/getsession", "/login")
//                .excludePathPatterns("/upload/avatar")
//                .excludePathPatterns("/banner/select")
//                .excludePathPatterns("/posts/*/comments")
//                .excludePathPatterns("/post/select/**")
//                .excludePathPatterns("/product/select/**")
//                .excludePathPatterns("/**/*.html", "/**/*.js", "/**/*.css", "/**/*.jpg", "/**/*.png",
//                        "/**/*.cur", "/**/*.ico", "/**/*.map")
//                .excludePathPatterns("/alipay/*")
//                .excludePathPatterns("/post/incrementViewCount").
//                excludePathPatterns("/**/error");
//
//        registry.addInterceptor(new AdminInterceptor())
//                .addPathPatterns("/post/delete").addPathPatterns("/banner/delete").
//                addPathPatterns("/product/delete/id","/product");
//    }
//}
