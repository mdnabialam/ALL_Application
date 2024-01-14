package com.sbms.alam.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRest {

	@GetMapping("/come")
	public String welcome1() {
		System.out.println("welcome");
		String mgs ="Welcome to MicroService !!!";
		return mgs;
		
	}
}
