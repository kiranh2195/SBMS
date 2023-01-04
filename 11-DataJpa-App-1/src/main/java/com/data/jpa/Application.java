package com.data.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.data.jpa.entity.Player;
import com.data.jpa.repository.PlayerRepositroy;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		PlayerRepositroy playerRepo = context.getBean(PlayerRepositroy.class);
		System.out.println(playerRepo.getClass().getName());
		
		Player player =new Player(1,"kirna",28,"Aurangabad");
	
		playerRepo.save(player);
		System.out.println("Record inserted in table");
		
		
	}

}
