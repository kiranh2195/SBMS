package com.blop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blop.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}
