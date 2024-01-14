package com.tcs.wel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AboutController {
	
	@GetMapping("/about")
	public ModelAndView about() {
		ModelAndView view = new ModelAndView();
		view.addObject("msg", "ALAM GROUP OF CEO :  MD NABI ALAM");
		view.setViewName("about");
		return view;
	}
}
