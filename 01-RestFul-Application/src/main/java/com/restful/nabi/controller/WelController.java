package com.restful.nabi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelController {

	@GetMapping("/welcome")
	 public ResponseEntity<String> getWelcome(){
		 String message ="Welcome to MD NABI ALAM ...";
		 return new ResponseEntity<>(message,HttpStatus.OK);
	 }
	
	@GetMapping("/good")
	public String greet() {
		String string="Good Moring ...";
		return string;
		
	}
}
