package com.restful.nabi.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restful.nabi.model.Book;
import com.restful.nabi.repository.BookRepository;
import com.restful.nabi.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	
	private BookRepository repository;
	public BookServiceImpl(BookRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public String upsertBook(Book book) {
		Integer bookId = book.getBookId();
		
		System.out.println(book);
		
		repository.save(book);
		
		System.out.println(book);

		if (bookId == null) {
			return "Record Inserted";
		} else {
			return "Record Updated";
		}
	}

	@Override
	public List<Book> getAllBooks() {
		return repository.findAll();
	}

	@Override
	public String deleteBook(Integer bookId) {
		repository.deleteById(bookId);
		return "Book Deleted";
	}

}
