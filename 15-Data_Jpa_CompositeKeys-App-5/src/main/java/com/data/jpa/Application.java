package com.data.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.data.jpa.entity.AccountPK;
import com.data.jpa.repository.AccountRepository;
import com.data.jpa.service.AccountService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		AccountService service = context.getBean(AccountService.class);
		
	service.saveAccData();
		
	//service.getDataUsingPK();
		context.close();
	}
}

