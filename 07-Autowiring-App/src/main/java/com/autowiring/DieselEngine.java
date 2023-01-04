package com.autowiring;

public class DieselEngine {
	public DieselEngine() {
		System.out.println("DieselEngine.DieselEngine()");
	}

	public int start() {
		System.out.println("Diesel engine started");
		return 1;
	}
}
