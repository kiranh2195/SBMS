package com.jaxb.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Address {

	private String city;
	private String state;
	private String country;
}
