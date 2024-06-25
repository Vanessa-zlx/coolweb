package cn.sakuraxiafan.coolweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"cn.sakuraxiafan", "com.alipay.config"})
public class CoolwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoolwebApplication.class, args);
	}

}
