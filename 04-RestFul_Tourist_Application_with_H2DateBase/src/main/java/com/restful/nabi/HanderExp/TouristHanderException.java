package com.restful.nabi.HanderExp;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.restful.nabi.exception.TouristNotFoundException;
import com.restful.nabi.model.ErrorDetails;

@RestControllerAdvice
public class TouristHanderException {

	@ExceptionHandler(TouristNotFoundException.class)
	public ResponseEntity<ErrorDetails> handerTourist(TouristHanderException tef){
		System.out.println("Tourist Not Found in Datebase");
		ErrorDetails details= new ErrorDetails(LocalDateTime.now(),"404 Not Found");
		return new ResponseEntity<ErrorDetails>(details,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handedAllExp(Exception  exception){
		System.out.println("All type Exception");
		ErrorDetails details = new ErrorDetails(LocalDateTime.now()+"Server Not Working");
		return new ResponseEntity<ErrorDetails>(details,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
