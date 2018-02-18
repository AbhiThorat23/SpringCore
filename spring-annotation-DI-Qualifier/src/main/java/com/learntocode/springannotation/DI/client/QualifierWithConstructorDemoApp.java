package com.learntocode.springannotation.DI.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learntocode.springannotation.DI.services.CarService;

public class QualifierWithConstructorDemoApp {

	public static void main(String[] args) {
		
		// Load the config file.
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");

		/*
		 * Retrieve the bean using default bean id 
		 */
		CarService car = applicationContext.getBean("hundaiCar", CarService.class);

		// Call the methods on bean.
		car.getCar();
		System.out.println("Your Hundai car is " + car.getCarInsurance());

		// close the context
		applicationContext.close();
	}

}
