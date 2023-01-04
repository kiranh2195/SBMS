package com.billpayment;

public class BillCollector {
	
   	private IPayment payment;
	
	//setter base injection 
	public void setPayment(IPayment payment) {
		this.payment = payment;
	}

	//Constructor based injection 
	public BillCollector(IPayment payment) {
		this.payment=payment;
	}
	
	public BillCollector() {
		
	}
	
	public void collectPayment(double amount) {
		String status = payment.pay(amount);
		System.out.println(status);	
	}
}
