package com.tcs.wel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/home")
	public ModelAndView home() {
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.addObject("msg","ALAM GROUP HOME PAGE");
		 modelAndView.setViewName("home");
		 return modelAndView;
	}
}
