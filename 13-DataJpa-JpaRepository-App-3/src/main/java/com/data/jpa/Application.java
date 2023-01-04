package com.data.jpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.data.jpa.entity.User;
import com.data.jpa.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository repo = context.getBean(UserRepository.class);
/*
		User u1 = new User(101, "kiran", "Male", 25, "India");
		User u2 = new User(102, "Raju", "Male", 26, "India");
		User u3 = new User(103, "John", "Male", 30, "USA");
		User u4 = new User(104, "Smith", "Male", 32, "Canada");
		User u5 = new User(105, "rohan", "Male", 20, "India");
		User u6 = new User(106, "suresh", "Male", 15, "USA");
		User u7 = new User(107, "anand", "Male", 35, "USA");
		User u8 = new User(108, "shiv", "Male", 40, "Canada");
		User u9 = new User(109, "vishal", "Male", 21, "India");
		User u10 = new User(110, "swapnil", "Male", 26, "India");
*/
	 //repo.saveAll(Arrays.asList(u1,u2,u3,u4,u5,u6,u7,u8,u9,u10));
	// List<User> findAll = repo.findAll(Sort.by("age").ascending());
	// List<User> findAll = repo.findAll(Sort.by("age").descending());
	 //List<User> findAll = repo.findAll(Sort.by("userName").ascending());
	 //List<User> findAll = repo.findAll(Sort.by("userName","age").ascending());
	 
		int pageNo= 0;   //user gives this value 
		int pageSize=3; //fixed value 
		
		PageRequest pageRequest  = PageRequest.of(pageNo, pageSize);	
		Page<User> pageData = repo.findAll(pageRequest);
		List<User> user = pageData.getContent();
		
		int totalPage=pageData.getTotalPages();
		System.out.println("totalPage ::"+totalPage);
		
		
		user.forEach(users->{System.out.println(users);});

		User entity = new User();
		entity.setCountry("India");
		entity.setAge(25);
		
	 Example<User> example = Example.of(entity);
	 
	 List<User> users = repo.findAll(example);
	 
	//users.forEach(user->{System.out.println(user);});
	 
	 repo.findAll(example,pageRequest);
	 
	 //repo.findAll(example,sort);
	}
}

