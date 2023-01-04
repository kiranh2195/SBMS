package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	//controller are loosely coupled with presentation tech beacuse here controller dont know index is jsp or  thymeleaf 
	@GetMapping("/")
	public String getWelcomeMsg(Model model) {
		model.addAttribute("msg", "Welcome to ThymeLeaf");
		return "index";
	}
}
