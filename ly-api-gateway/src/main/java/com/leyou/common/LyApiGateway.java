package com.leyou.common;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class LyApiGateway {

	public static void main(String[] args) {
		SpringApplication.run(LyApiGateway.class, args);
	}
}
