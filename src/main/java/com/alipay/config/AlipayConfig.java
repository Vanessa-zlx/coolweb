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

	@Value("${alipay.baseUrl}")
	private String baseUrl;

	@Value("${alipay.notifyPath}")
	private String notifyPath;

	@Value("${alipay.returnPath}")
	private String returnPath;

	public String getNotifyUrl() {
		return baseUrl + notifyPath;
	}
	public String getReturnUrl() {
		return baseUrl + returnPath;
	}

	private String sign_type = "RSA2";
	private String charset = "utf-8";
	@Value("${alipay.gatewayUrl}")
	private String gatewayUrl;
}

