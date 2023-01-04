package com.data.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.data.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	

}
