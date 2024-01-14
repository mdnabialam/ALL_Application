package jSon.to.java.object;

import java.io.File;

import com.book.josn.Book;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json_To_Java_Object {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("book.json");
		ObjectMapper mapper= new ObjectMapper();
		Book book = mapper.readValue(file, Book.class);
		System.out.println(book);
	}

}
