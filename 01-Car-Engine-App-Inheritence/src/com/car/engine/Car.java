package com.car.engine;

public class Car extends Engine {

	public void drive() {
		int start = super.start(); //ctl+1+enter //shortcut to get method return type 
		if(start >=1) {
			System.out.println("Journey Started...");
		}else {
			System.out.println("Engine Having Some Problem...");
		}
	}
}
