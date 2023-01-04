package com.data.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.data.jpa.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	public List<User> findByCountry(String countryName);
	
	public List<User> findByAgeIsGreaterThanEqual(Integer age);
	
	public List<User> findByCountryIn(List<String> countires);
	
	public List<User> findByCountryAndAge(String country,Integer age);
	
	public List<User> findByAgeAndCountryAndGender(Integer age,String country,String gender);

	@Query(value="from User where country='India'")
	public List<User> getAllUsersHql();
	
	@Query(value="from User where age=:age and country=:country and gender=:gender")
	public List<User> getAllUserByAgeAndCountryAndGender(Integer age,String country,String gender);

	@Query(value="select * from user_table where user_age=? and user_country= ? and user_gender=?", nativeQuery= true)
	public List<User> getAllUserByAgeAndCountryAndGenderUsingNativeQuery(Integer age,String country,String gender);

	@Query(value="from User where country=:countryName")
	public List<User> getUsersByCountryName(String countryName);

}
