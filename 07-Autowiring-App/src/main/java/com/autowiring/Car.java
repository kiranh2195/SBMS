package com.autowiring;

public class Car {
	private DieselEngine dieselEngine;
	
	//setter injection
	public void setDieselEngine(DieselEngine dieselEngine) {
		this.dieselEngine=dieselEngine;
	}
	
	//Constructor injection 
	public Car(DieselEngine dieselEngines){
		System.out.println("Car :: param Constructor ");
		this.dieselEngine=dieselEngines;
	}
	
	public Car() {
		System.out.println("Car :: 0 - Param constructor)");
	}

	public void drive() {
		int start = dieselEngine.start();
		if(start >= 1) {
			System.out.println("journey sarted");
		}else
			System.out.println("Engine Failed to start.....!");
	}
}
