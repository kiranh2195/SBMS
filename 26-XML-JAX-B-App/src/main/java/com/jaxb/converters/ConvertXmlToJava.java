package com.jaxb.converters;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.jaxb.binding.Person;

public class ConvertXmlToJava {
	public static void main(String[] args) throws Exception {

		File xmlFile= new File("Person.xml");
		JAXBContext context= JAXBContext.newInstance(Person.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Object object = unmarshaller.unmarshal(xmlFile);
		Person person=(Person) object;
		System.out.println(person);
	}
}



