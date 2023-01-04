package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Passanger;
import com.rest.entity.Ticket;
import com.rest.service.TicketBookingService;

@RestController
public class TicketBookingController {

	@Autowired
	private TicketBookingService service;
	
	@PostMapping(value="/ticket" , consumes= {"application/json" } ,produces= {"application/json"})
	public Ticket bookTicket(@RequestBody Passanger passanger) {
		System.out.println(1);
		return service.getTicket(passanger);
	}
}
