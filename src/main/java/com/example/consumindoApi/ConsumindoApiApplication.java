package com.example.consumindoApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ConsumindoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumindoApiApplication.class, args);
	}

}
