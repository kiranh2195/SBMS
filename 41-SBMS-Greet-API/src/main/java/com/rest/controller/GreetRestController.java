package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.client.WelcomeApiClient;

@RestController
public class GreetRestController {

	@Autowired
	private WelcomeApiClient welcomeClient;
	
	@Autowired
	private Environment env;

	@GetMapping("/greet")
	public String getGreetMsg() {
		String port = env.getProperty("server.port");
		String msg = "Good Night..! "+"(Port :: "+port+" )";
		String welcomeMsg = welcomeClient.invokeWelcomeApi();
		return msg + "," + welcomeMsg;
	}
}

