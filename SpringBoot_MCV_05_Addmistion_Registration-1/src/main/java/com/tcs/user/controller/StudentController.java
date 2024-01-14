package com.tcs.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.tcs.user.admintion.Stusent;
import jakarta.validation.Valid;

@Controller
public class StudentController {

	@GetMapping("/")
	public String getForm(Model model) {
		Stusent stusent = new Stusent();
		model.addAttribute("student", stusent);
		return "index";
	}
	
	@PostMapping("/register")
	public String sumitFrom(@Valid Stusent stu,BindingResult result,Model model) {
		if (result.hasErrors()) {
			return "index";
		}
		System.out.println(stu);
		model.addAttribute("msg","Your Registration Successful .. ");
		return "succes";
		
	}
}
