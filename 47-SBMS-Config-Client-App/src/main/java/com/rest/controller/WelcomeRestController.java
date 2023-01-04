package com.rest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope 
public class WelcomeRestController {

	@Value("${msg:Config Server Not Working}")
	private String msg;
	
	@GetMapping("/")
	public String getMessage() {
		return msg;
	}
}

//@RefreshScope  is used for to refresh the configuration at runtime 
//i.e. when we change configuration in GitHub then it should be reflected without restarting the server for that purpose this annotation is used

//@Value("${msg:Config Server Not Working}") here we write in the colon reason is if message is present in config server then it will populate its value 
//if not available the it will give default value as "Config Server Not Working" 

