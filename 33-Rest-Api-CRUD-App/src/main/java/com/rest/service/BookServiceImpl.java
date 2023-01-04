package com.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rest.entity.Book;
import com.rest.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository repo;

	public BookServiceImpl(BookRepository bookRepository) {
		this.repo = bookRepository;
	}

	@Override
	public String upsertBook(Book book) {

		Integer bookId = book.getBookId();
		Book save = repo.save(book);

		if (bookId != null) {
			return "Record updated";
		} else
			return "Record Inserted";

	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> list = repo.findAll();
		return list;
	}

	@Override
	public String deleteBook(Integer bookId) {
		repo.deleteById(bookId);
		return "Book Deleted";
	}

}
