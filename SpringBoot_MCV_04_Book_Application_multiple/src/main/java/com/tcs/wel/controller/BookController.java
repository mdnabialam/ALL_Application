package com.tcs.wel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tcs.wel.entity.Book;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public String bookDate(Model model) {
		Book b1= new Book(101,"Core Java",4520.00);
		
		model.addAttribute("book", b1);
		return "book";
	}
}
