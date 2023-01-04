package com.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
	private Integer pnrNo;
	private String name;
	private String from;
	private String to;
	private String journeyDate;
	private Integer trainNum;
	private String ticketStatus;
	private Double ticketPrice;
}
