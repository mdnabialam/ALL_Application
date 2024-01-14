package com.tcs.wel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelcome() {
		ModelAndView view = new ModelAndView();
		view.addObject("msg","Welcome To 1st Web Application .. !");
		view.setViewName("index");
		return view;
	}

}
