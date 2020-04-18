package com.practice.bankmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BankMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankMicroserviceApplication.class, args);
	}

}

