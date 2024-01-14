package com.restful.nabi.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getShowDate(@RequestParam ("name") String name){
		String payload=name+" Welcome Dost";
		return new ResponseEntity<>(payload,HttpStatus.OK);
	}
	
	@GetMapping("/student")
	public ResponseEntity<String> getStudent(@RequestParam("sname")String sname, @RequestParam ("roll") String roll){
		
		String body= sname +"By "+ roll+"admintion Fee 1000";
	return new ResponseEntity<>(body,HttpStatus.OK);
	
	
	}
	
	

}
