package com.billpayment;

public class BillCollector {
	
   	private IPayment payment;
	
	//Constructor based injection 
   	//if we remove default constructor then spring-beans.xml file will give error that it will not know which object has to pass to call the constructor so it will give error  
	public BillCollector(IPayment payment) {
		System.out.println("BillCollector :: ParamConstructorExecuted");
		this.payment=payment;
	}
	
	public void collectPayment(double amount) {
		System.out.println("Injected ::" +payment.getClass().getName());
		String status = payment.pay(amount);
		System.out.println(status);	
	}
}
