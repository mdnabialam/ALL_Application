package com.sbms.alam.exception.restcontroller;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbms.alam.exception.exceptionInfo.ExceptionInfo;

@RestController
public class DemoException {

	private org.slf4j.Logger logger=LoggerFactory.getLogger(DemoException.class);

	
	@GetMapping("/get")
	public String doAction() {
		String msg= "Action is progress";
		try {
			int i =10/0;
		} catch (Exception e) {
			logger.error("Exception Occured ::"+e,e);
			throw new ArithmeticException(e.getMessage());
		}
		
		
		return msg;
	}
	
	@ExceptionHandler(value = ArithmeticException.class)
	public ResponseEntity<ExceptionInfo> handAE(ArithmeticException arithmeticException){
		ExceptionInfo exceptionInfo= new ExceptionInfo();
		exceptionInfo.setMess(arithmeticException.getMessage());
		exceptionInfo.setCode("AIT0004");
		return new ResponseEntity<>(exceptionInfo,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	
	
	
	
	

}
