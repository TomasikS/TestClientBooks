package com.example.FeignV2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FeignV2Application {

	public static void main(String[] args) {
		SpringApplication.run(FeignV2Application.class, args);
	}

}
