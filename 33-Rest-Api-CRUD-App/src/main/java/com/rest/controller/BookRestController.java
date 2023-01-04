package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Book;
import com.rest.service.BookService;

@RestController
public class BookRestController {

	@Autowired
	private BookService bookService;

	@PostMapping(value = "/book")
	public ResponseEntity<String> addBook(@RequestBody Book book) {
		String msg = bookService.upsertBook(book);
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}

	@GetMapping(value = "/books")
	public ResponseEntity<List<Book>> getAllBooks() {
		List<Book> allBooks = bookService.getAllBooks();
		return new ResponseEntity<>(allBooks, HttpStatus.OK);
	}

	@PutMapping(value = "/book")
	public ResponseEntity<String> updateBook(@RequestBody Book book) {
		String msg = bookService.upsertBook(book);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@DeleteMapping(value = "/book/{bookId}")
	public ResponseEntity<String> deleteBook(@PathVariable("bookId") Integer bookId) {
		String msg = bookService.deleteBook(bookId);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
