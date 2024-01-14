package com.tcs.wel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView view= new ModelAndView();
		view.addObject("msg", "Welcome to ALAM GROUP ... ");
		view.setViewName("index");
		return view;
	}
}
