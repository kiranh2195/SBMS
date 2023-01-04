package com.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.exception.ExceptionInfo;

@RestController
public class DemoRestController {

   private Logger logger = LoggerFactory.getLogger(DemoRestController.class); 
	
	@GetMapping("/demo")
	public String doAction() {
		String msg = "Action in Progress";
		try {
			int i = 10 / 0;
		} catch (Exception e) {
			//e.printStackTrace(); here if we write print track trace then exception stack trace will be printed on console but in realtime our code is running on server we are not able to see the console so we are not using this  
			logger.error("Exception Occured :: " +e.getMessage() ,e);  // logger is used to log error message for developer use  
			//here we are re-throwing the exception to invoke handler method to give response to client Application its for client use
			throw new ArithmeticException();
		}
		return msg;
	}
}
