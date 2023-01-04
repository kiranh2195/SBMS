package com.data.jpa.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.data.jpa.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	

}
