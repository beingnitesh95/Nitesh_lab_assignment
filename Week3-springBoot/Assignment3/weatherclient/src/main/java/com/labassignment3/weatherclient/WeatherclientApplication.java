package com.labassignment3.weatherclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class WeatherclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherclientApplication.class, args);
	}

}
