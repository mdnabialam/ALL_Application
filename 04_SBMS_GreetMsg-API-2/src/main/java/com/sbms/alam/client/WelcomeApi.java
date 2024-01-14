package com.sbms.alam.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "WELCOME-API")
public interface WelcomeApi {
	
	@GetMapping("/come")
	public String invokeWelcomeApi();

}
