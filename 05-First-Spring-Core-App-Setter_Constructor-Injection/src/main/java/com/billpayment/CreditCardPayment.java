package com.billpayment;

public class CreditCardPayment implements IPayment {

	public CreditCardPayment() {
	System.out.println("CreditCardPayment.CreditCardPayment()");	
	}
	
	public String pay(double amount) {
		// logic for credit card payment
		return "Payment Successful thrhough credit card";
	}
}
