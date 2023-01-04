package com.billpayment;

public class DebitCardPayment implements IPayment {

	public String pay(double amount) {
		return "payment succesfull through Debit Card ";
	}

}
