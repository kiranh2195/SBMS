package com.data.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.data.jpa.entity.Product;
import com.data.jpa.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ProductRepository repo = context.getBean(ProductRepository.class);
		
		Product p1 = new Product();
		
	
		p1.setPname("tv");
		p1.setPrice(1000.00);
		
		repo.save(p1);
	 
	}
}

