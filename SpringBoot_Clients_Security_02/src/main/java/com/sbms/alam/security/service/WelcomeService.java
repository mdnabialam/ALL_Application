package com.sbms.alam.security.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.accept.HeaderContentNegotiationStrategy;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WelcomeService {

	private String apiurl="http://localhost:6363/";
	public void invokeWelcomeAPI() {
		String apiurl="http://localhost:6363/";
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth("zohan","zohan1");
		HttpEntity<String> reqEntity= new HttpEntity<>(headers);
		ResponseEntity<String> entity = restTemplate.exchange(apiurl, HttpMethod.GET, reqEntity, String.class);
		String body = entity.getBody();
		System.out.println(body);
	
	}
	
	public void invokeWelcome() {
		WebClient client= WebClient.create();
		String block=client.get()
				.uri(apiurl)
				.headers(headers->headers.setBasicAuth("zohan","zohan1"))
				.retrieve()
				.bodyToMono(String.class)
				.block();
		System.out.println(block);
	}
	
	
	
}
