package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");

		
		//here scope is Prototype so different object will be created when it will read below line  
		Car car1 = context.getBean("car", Car.class);
		System.out.println(car1.hashCode());  
		
		Car car2 = context.getBean("car", Car.class);
		System.out.println(car2.hashCode());

		
		// here scope is same and Hashcode will be same for both object because object will be created when IOC reads line no 8 
		//i.e. when IOC container starts 
		Motor motor1 = context.getBean("motor", Motor.class);
		System.out.println(motor1.hashCode());
		
		Motor motor2 = context.getBean("motor", Motor.class);
		System.out.println(motor2.hashCode());
		
		/*Motor.Motor()
		Car.Car()
		1002191352
		Car.Car()
		1256440269
		704024720
		704024720*/
	}

}
