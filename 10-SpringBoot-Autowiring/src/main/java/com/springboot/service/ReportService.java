package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springboot.dao.ReportDao;

@Service
public class ReportService {

	//Dependent class and this class is target class
	// if we don't write @Autowired Annotation then we will get Null pointer Exception
	
	private ReportDao dao;
	
/*	@Autowired
	//@Qualifier("mysql")
	public void setReportDao(ReportDao dao) {
		System.out.println("setReportDao() method called");
		this.dao=dao;
	}*/
	
	
	/*
	 * when we write this constructor and parameterized constructor is also available then
	 * IOC will give priority to 0-parameterized constructor for object creation
	 * so object creation will happen with this constructor and we will get Null Pointer Exception
	 * 
	 * but if we provide @Autowired annotation on parameterized constructor then IOC will create object for that Constructor
	 * (java basic if we provide a constructor then java will not produce the default constructor )
	 */
	
	/*public ReportService() {
		System.out.println("ReportService:: 0-parameterized Constructor Called ");
	}*/
	
	
    /*
     *when we provide only parameterized constructor to initialize the object then
     *we don't need to write the @AUtowired annotation because we have removed option to call 0-param constructor to IOC 
     *so IOC will call this Constructor only 
     *
     *if we provide both the constructor then use @Autowired annotation on parameterized constructor so IOC will chose this Constructor 
	 */
	@Autowired
	public ReportService(ReportDao dao) {
		System.out.println("ReportService:: Param Constructor Called ");
		this.dao=dao;
	}
	
	public void generateReport() {
		String findData=dao.findData();
		System.out.println("Generating Report");
	}

}
