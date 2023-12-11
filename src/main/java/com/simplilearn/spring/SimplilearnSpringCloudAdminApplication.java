package com.simplilearn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class SimplilearnSpringCloudAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplilearnSpringCloudAdminApplication.class, args);
	}

}
