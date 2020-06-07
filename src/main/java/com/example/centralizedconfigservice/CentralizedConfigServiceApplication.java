package com.example.centralizedconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CentralizedConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralizedConfigServiceApplication.class, args);
	}

}
