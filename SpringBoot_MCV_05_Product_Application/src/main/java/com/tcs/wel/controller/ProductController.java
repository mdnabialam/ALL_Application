package com.tcs.wel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tcs.wel.entity.Products;

@Controller
public class ProductController {

	@GetMapping("/")
	public String getProductgForm(Model model) {
		Products products = new Products();
		model.addAttribute("product", products);
		return"index";
	}
	
	@PostMapping("/product")
	public String saveDateProduct(Products product,Model model) {
		System.out.println(product);
		model.addAttribute("msg", "Product save Succesfully");
		return "success";
	}
	
}
