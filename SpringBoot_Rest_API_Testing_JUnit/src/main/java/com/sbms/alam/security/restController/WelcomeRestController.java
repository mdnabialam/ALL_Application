package com.sbms.alam.security.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbms.alam.security.service.WelcomeService;

@RestController
public class WelcomeRestController {

		@Autowired
		private WelcomeService service;
		
		
		@GetMapping("/welcome")
		public String welcomemsg() {
			String msg = service.getmsg();
			return msg;
		}
}
