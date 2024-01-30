package com.sbms.alam.security.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
	
	public String getmsg() {
		
		String msg= "Welcome Api ";
		return msg;
	}
}
