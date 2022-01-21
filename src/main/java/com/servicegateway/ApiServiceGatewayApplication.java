package com.servicegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class ApiServiceGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiServiceGatewayApplication.class, args);
	}

}
