package com.satish.spring.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FlipkartServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlipkartServerApplication.class, args);
	}
}
