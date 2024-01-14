package com.restful.nabi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restful.nabi.entity.Product;

@RestController
public class ProductController {

	@GetMapping(
			value = "/product", 
			produces = { "application/xml", "application/json" }
	)
	//@GetMapping("/product")
	public ResponseEntity<Product> getProduct() {

		Product p1 = new Product(101, "Monitor", 8000.00);

		return new ResponseEntity<>(p1, HttpStatus.OK);
	}
	
	@GetMapping(value = "/products",
			produces = {"application/xml","application/json"})
	
	public ResponseEntity<List<Product>> getProduct1(){
		
		Product p1= new Product(101,"CPU",8500);
		Product p2 = new Product(102,"RAM",3500);
		Product p3= new Product(103,"SSD",4500);
		
			List<Product> asList = Arrays.asList(p1,p2,p3);
			return new ResponseEntity<>(asList,HttpStatus.OK);
	}
	
	
}	
