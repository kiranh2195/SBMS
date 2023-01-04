package com.rest.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
