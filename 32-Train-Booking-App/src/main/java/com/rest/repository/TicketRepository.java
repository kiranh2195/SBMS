package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entity.Passanger;

public interface TicketRepository extends JpaRepository<Passanger ,Integer> {
	
}
