package com.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import lombok.Data;

@Data
@Entity
@Table(name="PASSANGER_TABLE")
public class Passanger {
	
	@Id
	@Column(name="TICKET_ID")
	@GeneratedValue
	private Integer ticketID;
	
	@Column(name="P_NAME")
	private String name;
	
	@Email
	@Column(name="EMAIL")
	private String emailId;
	
	@Column(name="SOURCE")
	private String source;
	
	@Column(name="DESTINATION")
	private String destination;
	
	@Column(name="J_DATE")
	private String jdate;
	
	@Column(name="T_NUMBER")
	private Integer trainNum;

}
