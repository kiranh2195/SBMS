package com.blop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.blop.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		UserService userService = context.getBean(UserService.class);
		
		userService.saveUser();
	}

}
