package com.learntocode.springcore.beanscopedemo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learntocode.springcore.beanscopedemo.impl.HundaiCar;

/**
 * Demo Class to show Singleton Bean scope. Bean is create only once for
 * particular bean id and it is shared between subsequent bean request from
 * container for that bean id.
 * 
 * @author abhthora
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
		HundaiCar car = applicationContext.getBean("myHundaiCar", HundaiCar.class);
		HundaiCar car1 = applicationContext.getBean("myHundaiCar", HundaiCar.class);

		/*
		 * check Singleton Bean Scope : Both bean should be same as scope is
		 * "singleton".So both car and car1 should point to same object.
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
