package com.billpayment;


public class TestReflectionApi {

	public static void main(String[] args) throws Exception {

		// dependet class object
		CreditCardPayment cc = new CreditCardPayment();

		//target class object 
		BillCollector collector = new BillCollector();
		
		//injecting dependet class obj into target class obj
		collector.setPayment(cc);
		
		collector.collectPayment(2000);
	}	
}
