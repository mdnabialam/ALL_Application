package com.sbms.alam.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sbms.alam.security.service.WelcomeService;

@SpringBootApplication
public class SpringBootClientsSecurity02Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootClientsSecurity02Application.class, args);
		WelcomeService bean = run.getBean(WelcomeService.class);
	
		bean.invokeWelcomeAPI();
		bean.invokeWelcome();
	
	}

}
