package com.learntocode.springcore.beanscopedemo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learntocode.springcore.beanscopedemo.services.CarService;

/**
 * Demo Class to show Singleton Bean scope using annotation. Bean is created only once for
 * particular bean id and it is shared between subsequent bean request from
 * container for that bean id.
 * 
 * @author Abhijit
 *
 */
public class SpringSingletonScopeDemo {
	
	public static void main(String[] args) {
		
		// Load the config file.
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");

		/*
		 * Retrieve the Two bean instances and assign it to different reference
		 * variable
		 */
		CarService car = applicationContext.getBean("myHundaiCar", CarService.class);
		CarService car1 = applicationContext.getBean("myHundaiCar", CarService.class);

		/*
		 * check Singleton Bean Scope : Both bean should be same as scope is
		 * "singleton".So both car and car1 should point to same object.
		 */
		if (car == car1) {
			System.out.println("car and car1 both are pointing to same object(Bean).");
			System.out.println("car points to  :" + car);
			System.out.println("car1 Points to :" + car);
		} else {
			System.out.println("car and car1 both are pointing to Different object(Bean).");
			System.out.println("car points to  :" + car);
			System.out.println("car1 Points to :" + car);
		}

		// close the context
		applicationContext.close();
	}
}
