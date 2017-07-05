package com.realife.services.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Application {

	public static void main(String[] args) {
		// Tell Boot to look for zuul-server.yml
		// System.setProperty("spring.config.name", "zuul-server");
		SpringApplication.run(Application.class, args);
	}
}
