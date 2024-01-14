package com.tcs.wel.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tcs.wel.entity.Book;

@Controller
public class BookController {
	
	@GetMapping("/books")
	public String bookDate(Model model) {
		Book b1= new Book(101,"Core Java",4520.00);
		Book b2= new Book(102,"Adv Java",4520.00);
		Book b3= new Book(103,"Spring",5520.00);
		Book b4= new Book(104,"AWS",4120.00);
		List<Book> list = Arrays.asList(b1,b2,b3,b4);
		model.addAttribute("books", list);
		return "books";
	}
	@GetMapping("/")
	public String index(Model model) {
		return"index";
	}
}
