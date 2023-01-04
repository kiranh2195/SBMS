package com.rest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.binding.Product;

@RestController
public class ProductRestController {

	@GetMapping(value = "/product", produces = { "application/xml", "application/json" })

	public ResponseEntity<Product> getProduct() {

		Product product = new Product();
		product.setPid(101);
		product.setPname("Mouce");
		product.setPrice(1011.00);

		return new ResponseEntity<>(product, HttpStatus.OK);
	}

	@GetMapping(value="/products" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> getProducts() {
		Product p1 = new Product(101, "Mouce", 100.00);
		Product p2 = new Product(102, "KeyBoard", 100.00);
		Product p3 = new Product(103, "Monitor", 100.00);
		Product p4 = new Product(104, "Earphones", 100.00);

		List<Product> list = Arrays.asList(p1, p2, p3, p4);

		return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
	}
}
