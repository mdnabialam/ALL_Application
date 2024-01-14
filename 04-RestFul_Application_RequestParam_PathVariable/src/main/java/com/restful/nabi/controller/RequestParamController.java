package com.restful.nabi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {
		
	@GetMapping("/coures")
	public ResponseEntity<String> getCouresfee(@RequestParam("cname") String cname){
		String param = cname+" by "+"Spring 700";
		return new ResponseEntity<>(param,HttpStatus.OK);
	}
	
	@GetMapping("/author/{bname}/{bAutother}")
	public ResponseEntity<String > getBook(@PathVariable("bname") String bname,@PathVariable ("bAutother") String bAutother){
		String res=bname+" By "+bAutother+"is out of Stock";
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
}
