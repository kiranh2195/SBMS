package com.form.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.form.binding.Product;

@Controller
public class ProductController {
	
	// we need a method for loading empty form
	
	@GetMapping("/")
	public String getProductForm(Model model) {
		Product product= new Product();
		model.addAttribute("product",product);
		return "index";
	}
	
	// we need a method for handling form submission
	
	@PostMapping("/product")
	public String handleFormSubmit(Product product, Model model ) {
		System.out.println(product);
		model.addAttribute("msg","product saved Successfully...!!");
		return "success";
	}
}
