package com.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvc.binding.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
