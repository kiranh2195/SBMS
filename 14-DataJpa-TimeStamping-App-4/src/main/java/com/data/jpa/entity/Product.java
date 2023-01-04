package com.data.jpa.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name ="PRODUCT_MASTER")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@Column(name= "PRODUCT_ID")
	@GeneratedValue
	private Integer pid;
	 
	@Column(name= "PRODUCT_NAME")
	private String pname;
	
	@Column(name= "PRODUCT_PRICE")
	private Double price;
	
	@CreationTimestamp
	@Column(name= "CREATED_DATE" ,updatable=false)
	private LocalDateTime createdDate;
	
	@UpdateTimestamp
	@Column(name= "UPDATED_DATE" , insertable= false)
	private LocalDateTime updatedDate;
}
