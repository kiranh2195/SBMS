package com.rest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@Value("${Welcome.msg}")
	private String welcomeMsg;

	@Value("${Message.greet}")
	private String greetMsg;

	@GetMapping("/welcome")
	public String welcomeMsg() {
		return welcomeMsg;
	}

	@GetMapping("/greet")
	public String greetMsg() {
		return greetMsg;
	}
}
