package com.rest.service;

import java.security.SecureRandom;
import java.util.Optional;

import javax.validation.constraints.Max;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Passanger;
import com.rest.entity.Ticket;
import com.rest.repository.TicketRepository;

@Service
public class TicketBookingService {

	@Autowired
	private TicketRepository repo;

	public Ticket getTicket(Passanger passanger) {

		Passanger save = repo.save(passanger);
		System.out.println(save);
		SecureRandom secureRandom = new SecureRandom();
		int randomWithSecureRandom = secureRandom.nextInt();

		Optional<Passanger> pass = repo.findById(save.getTicketID());

		String status = null;
		if (pass.isPresent()) {
			status = "Confirmed";
		} else {
			status = "Waiting";
		}

		return new Ticket(randomWithSecureRandom, save.getName(), save.getSource(), save.getDestination(),
				save.getJdate(), save.getTrainNum(), status, 2000.00);

	}
}
