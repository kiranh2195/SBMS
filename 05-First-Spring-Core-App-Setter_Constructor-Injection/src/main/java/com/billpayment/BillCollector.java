package com.billpayment;

public class BillCollector {

	private IPayment payment;

	
	public BillCollector(IPayment payment) {
		System.out.println("BillCollector :: ParamConstructorExecuted");
		this.payment = payment;
	}

	// setter base injection
	//here setter base injection will override constructor injection
	public void setPayment(IPayment payment) {
		this.payment = payment;
	}

	public void collectPayment(double amount) {
		System.out.println("Injected ::" + payment.getClass().getName());
		String status = payment.pay(amount);
		System.out.println(status);
	}
}
