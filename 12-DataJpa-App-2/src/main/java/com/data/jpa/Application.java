package com.data.jpa;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.data.jpa.entity.User;
import com.data.jpa.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository repo = context.getBean(UserRepository.class);

		User u1 = new User(101, "kiran", "Male", 25, "India");

		// repo.save(u1);

		User u2 = new User(102, "Raju", "Male", 26, "India");
		User u3 = new User(103, "John", "Male", 30, "USA");
		User u4 = new User(104, "Smith", "Male", 32, "Canada");

	 //repo.saveAll(Arrays.asList(u1,u2,u3,u4));
/*
		Optional<User> id = repo.findById(104);
		if (id.isPresent()) {
			// System.out.println(id.get());
		}

		Iterable<User> findAllById = repo.findAllById(Arrays.asList(101, 102, 103, 104));
		findAllById.forEach(users -> {
			// System.out.println(users);
		});
		
		long count = repo.count();
		//System.out.println("No of records->"+" "+count);
		
		boolean existsById = repo.existsById(105);
		//System.out.println(existsById);
		
		//repo.deleteById(104);
		
		//repo.deleteAllById(Arrays.asList(101,102));
*/
		//################FindBy Methods################################
		
		//List<User> byCountry = repo.findByCountry("usa");
		//System.out.println(byCountry);
		
		//List<User> findByAgeGreaterThan = repo.findByAgeIsGreaterThanEqual(30);
		//System.out.println(findByAgeGreaterThan);
		
		//List<User> countryContaining = repo.findByCountryIn(Arrays.asList("India","USA"));
	     //System.out.println(countryContaining);
		
		//List<User> countryAndAge = repo.findByCountryAndAge("India", 25);
		//countryAndAge.forEach(users ->{System.out.println(countryAndAge);});
		
		//List<User> findByAgeAndCountryAndGender = repo.findByAgeAndCountryAndGender(25, "India", "male");
		//findByAgeAndCountryAndGender.forEach(users ->{System.out.println(findByAgeAndCountryAndGender);});
	
		//################HQL Query################################
		
		//List<User> usersHql = repo.getAllUsersHql();
        //usersHql.forEach(users->{System.out.println(users);});
		
		//List<User> list = repo.getAllUserByAgeAndCountryAndGender(25, "India", "male");
		//list.forEach(users ->{System.out.println(list);});
	
		//List<User> list = repo.getAllUserByAgeAndCountryAndGenderUsingNativeQuery(25, "India", "male");
		//list.forEach(users ->{System.out.println(list);});
		
		List<User> list = repo.getUsersByCountryName("India");
		list.forEach(users ->{System.out.println(list);});
	
	}
}

