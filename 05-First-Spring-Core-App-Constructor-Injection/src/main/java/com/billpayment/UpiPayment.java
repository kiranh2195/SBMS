package com.billpayment;

public class UpiPayment implements IPayment {

	 public UpiPayment() {
		System.out.println("UpiPayment.UpiPayment()");
	}
	public String pay(double amount) {
		// logic for upi payment 
		return "payment successfull through UPI";
	}

}
