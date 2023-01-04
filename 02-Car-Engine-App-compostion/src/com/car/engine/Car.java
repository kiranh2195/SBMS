package com.car.engine;

public class Car  {

	public void drive() {
		Engine engine= new Engine();
		int start = engine.start();  
		if( start >=1) {
			System.out.println("Journey Started...");
		}else {
			System.out.println("Engine Having Some Problem...");
		}
	}
}
