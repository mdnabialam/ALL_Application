package com.book.josn;

import lombok.Data;

@Data
public class Book {
 
	private Integer id;
	private String name;
	private double price;
	private Author author;
}
