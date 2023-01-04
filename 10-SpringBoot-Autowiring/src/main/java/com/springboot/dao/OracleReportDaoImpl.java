package com.springboot.dao;

import org.springframework.stereotype.Repository;


//@Repository("oracle")

@Repository
public class OracleReportDaoImpl implements ReportDao{

	public OracleReportDaoImpl() {
		System.out.println("ReportDao ::Oracle - 0 - Param Constructor");
	}

	
	public String findData() {
	System.out.println("Fetching Report Data from Oracle DB....");
		return "Report Data";
	}

}
