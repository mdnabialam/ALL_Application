package com.book.josn.main;

import java.io.File;

import com.book.josn.Author;
import com.book.josn.Book;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BookMain {
	public static void main(String[] args) throws Exception {
		Author author = new Author();
		author.setAuthorName("Roa johnson");
		author.setAuthorGamil("r.jo@gmail.com");
		author.setPhoneNumber(4525635);
		
		
		
		
		Book book = new Book();
		book.setId(101);
		book.setName("Spring");
		book.setPrice(2500.00);
		book.setAuthor(author);
		
		
		// java object to Json Convert 
		ObjectMapper mapper= new ObjectMapper();
		 mapper.writeValue(new File("book.json"), book);
		 System.out.println("Json File Create ... ");
		 
		
	}

}
