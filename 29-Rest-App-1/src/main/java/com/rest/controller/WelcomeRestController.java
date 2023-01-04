package com.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	//Recommended approach 
	@GetMapping("/welcome")
	public ResponseEntity<String> getwelcomeMsg(@RequestParam("name") String name,@RequestParam("sirname") String sname){
		String respPayload=name + " "+sname +" Welcome to RESTFul services";
		return new ResponseEntity<>(respPayload, HttpStatus.OK);
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String respPayload="Good Morning..!!";
		return respPayload;
	}
}
