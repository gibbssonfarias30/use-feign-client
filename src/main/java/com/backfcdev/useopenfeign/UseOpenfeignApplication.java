package com.backfcdev.useopenfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients // We notify spring that we are going to use openfeign client in the context or service
public class UseOpenfeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(UseOpenfeignApplication.class, args);
	}

}
