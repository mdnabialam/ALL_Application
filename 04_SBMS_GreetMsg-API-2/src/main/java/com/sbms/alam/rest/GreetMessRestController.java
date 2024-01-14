package com.sbms.alam.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbms.alam.client.WelcomeApi;

@RestController
public class GreetMessRestController {

	@Autowired
	private WelcomeApi welcomeApi;
	
	@GetMapping("/message")
	public String getMessage() {
		String mess= "Good Morning , ";
		String api = welcomeApi.invokeWelcomeApi();
		return mess+api;
	}
}
