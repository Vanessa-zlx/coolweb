package com.alipay.config;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Data
@Component
public class AlipayConfig {
	@Value("${alipay.appId}")
	private String appId;
	@Value("${alipay.appPrivateKey}")
	private String appPrivateKey;
	@Value("${alipay.alipayPublicKey}")
	private String alipayPublicKey;

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	@Value("${alipay.notifyUrl}")
	private String notifyUrl;

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	@Value("${alipay.returnUrl}")
	private String return_url;

	private String sign_type = "RSA2";
	private String charset = "utf-8";
	@Value("${alipay.gatewayUrl}")
	private String gatewayUrl;
}

