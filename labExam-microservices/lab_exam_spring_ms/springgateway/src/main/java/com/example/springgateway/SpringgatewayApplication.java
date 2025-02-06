package com.example.springgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringgatewayApplication.class, args);
	}

}
