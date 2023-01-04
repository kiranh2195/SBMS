package com.gson.main;

import java.io.File;
import java.io.FileReader;

import com.google.gson.Gson;
import com.gson.binding.Order;

public class Test {
	public static void main(String[] args) throws Exception {
		Order order = new Order();
		order.setBillAmt(200.00);
		order.setOrderBy("Kiran");
		order.setOrderId(101);
		order.setOrderStatus("Deliverd");
		
		Gson gson= new Gson();
		String json = gson.toJson(order); //convert java object to JSON
	//System.out.println(json);
		
		Order od = gson.fromJson(new FileReader(new File("order.json")), Order.class);
	System.out.println(od);
	}
}
