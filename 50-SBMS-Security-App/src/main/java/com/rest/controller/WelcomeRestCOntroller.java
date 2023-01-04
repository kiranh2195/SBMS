package com.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestCOntroller {

	@GetMapping("/")
	public String welcomeMsg() {
		String msg = "Welcome to Spring Security";
		return msg;
	}
}
