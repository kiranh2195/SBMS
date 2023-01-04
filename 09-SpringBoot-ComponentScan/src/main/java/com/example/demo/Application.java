package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.security.AppSecurity;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.demo" , "com.wallmart.security" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public AppSecurity createInstance() {
		AppSecurity appSecurity= new AppSecurity();
		return appSecurity;
	}
}
