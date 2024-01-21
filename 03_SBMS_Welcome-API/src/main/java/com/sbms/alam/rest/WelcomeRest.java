package com.sbms.alam.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRest {
	
	@Autowired
	private Environment environment;

	@GetMapping("/come")
	public String welcome1() {
		System.out.println("welcome");
		String port = environment.getProperty("server.port");
		System.out.println(port);
		String mgs ="Welcome to MicroService !!!"+"Port Number "+port;
		return mgs;
		
	}
}
