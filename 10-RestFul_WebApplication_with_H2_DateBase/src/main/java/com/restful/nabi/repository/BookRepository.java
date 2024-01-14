package com.restful.nabi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restful.nabi.model.Book;

public interface BookRepository extends JpaRepository<Book, Serializable>{

}
