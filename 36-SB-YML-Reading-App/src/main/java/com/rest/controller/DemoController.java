package com.rest.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.props.AppProperties;

@RestController
public class DemoController {
	@Autowired
	private AppProperties prop;

	@GetMapping("/greet")
	public String getGreetMsg() {
		Map<String, String> messages = prop.getMessages();
		String value = messages.get("greet");
		return value;
	}

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return prop.getMessages().get("welcome");
	}

	@GetMapping("/wish")
	public String getWishMsg() {
		return prop.getMessages().get("wish");
	}
}
