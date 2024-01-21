package com.sbms.alam.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication01Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication01Application.class, args);
	}

}
