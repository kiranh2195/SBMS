package com.json.converters;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.binding.Author;
import com.json.binding.Book;

public class JavaToJsonConverter {
	public static void main(String[] args) throws Exception {
    
		Author author= new Author();
		author.setAuthorEmail("kiran@gmail.com");
		author.setAuthorname("Kiran");
		author.setAuthorPhno(8766928529l);
		
		Book book= new Book();
		book.setId(101);
		book.setName("Java");
		book.setPrice(101.00);
		
		book.setAuthor(author);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("book.json"), book);
		System.out.println("Conversion completed......");
	}
}
