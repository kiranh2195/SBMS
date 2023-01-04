package com.rest.binding.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.binding.PassangerInfo;
import com.rest.binding.TicketInfo;

@RestController
public class TicketController {

	@GetMapping("/ticket/{ticketId}")
	public ResponseEntity<TicketInfo> getTicket(@PathVariable("ticketId") Integer ticketId) {
		// logic to get ticket data

		TicketInfo info = new TicketInfo();
		info.setTicketId(ticketId);
		info.setPnr("HK4411DH");
		info.setTicketStatus("CONFIRMED");
		return new ResponseEntity<TicketInfo>(info, HttpStatus.OK);
	}

	@PostMapping(value = "/ticket", produces = { "application/json" }, consumes = { "application/json" })
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassangerInfo info) {
		System.out.println(info);

		// logic to book ticket
		TicketInfo ticketInfo = new TicketInfo();

		ticketInfo.setTicketId(101);
		ticketInfo.setPnr("dsf5646");
		ticketInfo.setTicketStatus("Confirmed");
		return new ResponseEntity<>(ticketInfo, HttpStatus.OK);
	}

	@PutMapping("/ticket")
	public ResponseEntity<String> updateTicket(@RequestBody PassangerInfo info) {
		System.out.println(info);
		// logic to update ticket
		return new ResponseEntity<String>("Ticket Updated", HttpStatus.OK);
	}

	@DeleteMapping("/ticket/{ticketId}")
	public ResponseEntity<String> deleteTicket(@PathVariable("ticketId") Integer ticketId) {
		System.out.println(ticketId);
		// logic to delete the ticket
		return new ResponseEntity<String>("Ticket Deleted", HttpStatus.OK);
	}

}
