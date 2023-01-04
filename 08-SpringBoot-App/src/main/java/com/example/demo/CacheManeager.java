package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CacheManeager implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
	System.out.println("logic executing top load the data into Cache ");
		
	}

}
