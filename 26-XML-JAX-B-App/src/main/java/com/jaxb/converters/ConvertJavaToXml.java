package com.jaxb.converters;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.jaxb.binding.Address;
import com.jaxb.binding.Person;

public class ConvertJavaToXml {
	public static void main(String[] args) throws Exception {

		Address address= new Address();
		address.setCity("pune");
		address.setCountry("India");
		address.setState("MH");
				
		
		Person person= new Person();
		person.setAge(20);
		person.setId(101);
		person.setName("kiran");
		person.setPhno(115456865l);
		person.setType("Doctor");
		person.setAddress(address);
		
		JAXBContext instance = JAXBContext.newInstance(Person.class);
		
		Marshaller marshaller = instance.createMarshaller();
		marshaller.marshal(person, new File("Person.xml"));
		
		System.out.println("Marshalling");
	}
}
