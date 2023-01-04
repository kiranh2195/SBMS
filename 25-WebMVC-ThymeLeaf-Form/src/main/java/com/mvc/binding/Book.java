package com.mvc.binding;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "BOOK_TABLE")
public class Book {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer bookId;

	@Column(name = "Book_Name")
	private String bookName;

	@Column(name = "AUTHOR")
	private String authorName;

	@Column(name = "PRICE")
	private Double bookPrice;

}
