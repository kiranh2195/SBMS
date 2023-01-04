package com.mvc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mvc.bindings.Book;

@Controller
public class BookController {

	@GetMapping("/book")
	public String getBookData(Model model) {
		
		//setting data to binding obj
		Book b1 = new Book(101,"Spring",450.00);
		Book b2 = new Book(102,"Devops",350.00);
		Book b3 = new Book(103,"Jrtp",250.00);
		
		List<Book> asList = Arrays.asList(b1,b2,b3);
		
		//adding data to model  to send to UI
		model.addAttribute("book",asList);  // key -value pair , key can be anything 
		
		//return  view name 
		return "book"; // view page/name 
	}
}
