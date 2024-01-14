package com.restful.nabi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@Api(tags = "User Management")

public class WelcomeController {

	@GetMapping("/")
	public String welcome(){
		return "Welcome to RestController";
	}
	/*
	 * @RestController
	@Api(tags = "User Management")
	@RequestMapping("/users")
	public class UserController {
    @ApiOperation("Get all users")
    @GetMapping
    public List<User> getAllUsers() {
        // Implementation
    }
}

	 */
}
