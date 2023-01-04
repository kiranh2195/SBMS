package com.springboot.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;


//@Repository("mysql")
@Repository
@Primary
public class MySqlReportDaoImpl implements ReportDao{

	public MySqlReportDaoImpl() {
		System.out.println("ReportDao :: MySql 0 - Param Constructor");
	}

	public String findData() {
	System.out.println("Fetching Report Data from MySql DB....");
		return "Report Data";
	}

}
