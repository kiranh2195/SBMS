package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mvc.binding.Book;
import com.mvc.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService service;

	@GetMapping("/")
	public String displayForm(Model model) {
		Book bookObj = new Book();
		model.addAttribute("book", bookObj);
		return "index";
	}

	@PostMapping("/book")
	public String saveBookData(Book book, Model model) {

		Book saveBooks = service.saveBooks(book);
		System.out.println(saveBooks);
		model.addAttribute("msg", "Book Saved Successfuly");
		return "success";
	}

}
