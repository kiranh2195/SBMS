package com.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mvc.binding.Book;
import com.mvc.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository repo;

	public List<Book> getAllBooks() {
		List<Book> list = repo.findAll();
		return list;
	}
	
	public Book saveBooks(Book book) {
		return repo.save(book);
	}
}
