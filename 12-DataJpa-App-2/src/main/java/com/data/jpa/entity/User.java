package com.data.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name ="USER_TABLE")
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	@Column(name="USER_ID")
	private Integer userId;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="USER_GENDER")
	private String gender;
	
	@Column(name="USER_AGE")
	private Integer age;
	
	@Column(name="USER_COUNTRY")
	private String country; 
}
