package com.restful.nabi.exception;

@SuppressWarnings("serial")
public class TouristNotFoundException extends Exception {
	public TouristNotFoundException() {
		
	}

	public TouristNotFoundException(String string) {
		// TODO Auto-generated constructor stub
	}
	
	public String getMessage() {
		return "Not Found";
		
	}
}
