package com.MainServises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroMainServisesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroMainServisesApplication.class, args);
	}

}
