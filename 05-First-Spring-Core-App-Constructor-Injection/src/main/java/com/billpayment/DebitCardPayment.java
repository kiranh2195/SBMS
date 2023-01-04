package com.billpayment;

public class DebitCardPayment implements IPayment {

	public DebitCardPayment() {
		System.out.println("DebitCardPayment.DebitCardPayment()");
	}
	
	public String pay(double amount) {
		return "payment succesfull through Debit Card ";
	}

}
