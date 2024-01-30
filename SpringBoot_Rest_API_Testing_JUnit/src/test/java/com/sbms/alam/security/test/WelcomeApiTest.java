package com.sbms.alam.security.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.sbms.alam.security.restController.WelcomeRestController;
import com.sbms.alam.security.service.WelcomeService;

@WebMvcTest(value = WelcomeRestController.class)
public class WelcomeApiTest  {
	
	@Autowired
	private WelcomeService welcomeService;
	@Autowired
	private MockMvc mockMvc;
	
	
	@Test
	public void welcomeTest() throws Exception {
		when(welcomeService.getmsg()).thenReturn("Wlcome TO RestAPI Testing");
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/welcome");
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		MockHttpServletResponse response = result.getResponse();
		
		int status = response.getStatus();
		 assertEquals(200, status);
		
	
	}
	
	
	

}
