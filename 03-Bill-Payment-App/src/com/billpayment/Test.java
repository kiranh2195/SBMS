package com.billpayment;

public class Test {

	public static void main(String[] args) {
		BillCollector bc = new BillCollector();
		
		// setter base injection 
		//Injecting CreditCardPayment object into BillCollector (Setter Injection)
		bc.setPayment(new CreditCardPayment());
		bc.collectPayment(1500.00);
		
		
	// constructor base injection
		BillCollector bc1 = new BillCollector(new DebitCardPayment());
		bc1.collectPayment(2000);
		
		//field injection -> here payment object is directly initialize here by making IPayment interface as public  
		BillCollector bc2 = new BillCollector();
		UpiPayment upi = new UpiPayment();
		//bc2.payment=upi;
		//bc2.collectPayment(3000);
	
	}

}
