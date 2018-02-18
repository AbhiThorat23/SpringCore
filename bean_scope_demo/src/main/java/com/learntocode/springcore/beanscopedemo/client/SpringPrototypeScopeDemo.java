package com.learntocode.springcore.beanscopedemo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learntocode.springcore.beanscopedemo.impl.SwiftDesireCar;

/**
 * Class to demonstrate Prototype Bean scope. Every time new bean is gets created when we request for it in prototype scope.
 * @author abhthora
 *
 */
public class SpringPrototypeScopeDemo {
	public static void main(String[] args) {
		// Load the config file.
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");

		/*
		 * Retrieve the Two bean instances and assign it to different reference
		 * variable
		 */
		SwiftDesireCar car = applicationContext.getBean("mySwiftCar", SwiftDesireCar.class);
		SwiftDesireCar car1 = applicationContext.getBean("mySwiftCar", SwiftDesireCar.class);

		/*
		 * check Prototype Bean Scope : Both Bean should point to different
		 * object as scope is Prototype so every time we request bean from
		 * container new object is gets created.
		 */
		if (car == car1) {
			System.out.println("care and car1 both are pointing to same object(Bean).");
			System.out.println("car points to  :" + car);
			System.out.println("car1 Points to :" + car);
		} else {
			System.out.println("care and car1 both are pointing to Different object(Bean).");
			System.out.println("car points to  :" + car);
			System.out.println("car1 Points to :" + car);
		}

		// close the context
		applicationContext.close();
	}
}
