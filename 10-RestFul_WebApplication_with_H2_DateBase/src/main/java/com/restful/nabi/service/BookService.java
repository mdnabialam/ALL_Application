package com.restful.nabi.service;

import java.util.List;

import com.restful.nabi.model.Book;

public interface BookService {
		
	public String upsertBook(Book book);

	public List<Book> getAllBooks();

	public String deleteBook(Integer bookId);
}
