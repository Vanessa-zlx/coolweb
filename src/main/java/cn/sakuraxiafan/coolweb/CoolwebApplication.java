package cn.sakuraxiafan.coolweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = {"cn.sakuraxiafan", "com.alipay.config"})
@EnableScheduling
public class CoolwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoolwebApplication.class, args);
	}

}
