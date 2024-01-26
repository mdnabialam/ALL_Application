package com.sbms.alam.security.restControlller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@GetMapping("/")
	public String welcomemsg() {
		String msg="Welcome to SpringBoot Security ...";
		return msg;
	}
}
