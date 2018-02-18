package com.learntocode.springannotation.DI.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learntocode.springannotation.DI.impl.SwiftDesireCar;

/**
 * 
 * @author abhthora
 *
 */
public class InjectPropFileDemoApp {

	public static void main(String[] args) {

		// Load the config file.
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");

		/*
		 * Retrieve the bean using custom bean id which we have mentioned with
		 * @Component annotation
		 */
		SwiftDesireCar swiftCar = applicationContext.getBean("mySwiftDesire", SwiftDesireCar.class);

		// Call the methods on bean
		swiftCar.getCar();
		System.out.println("color of car is: "+swiftCar.getColor());
		System.out.println("Model of car is: "+swiftCar.getModel());
		
		// close the context
		applicationContext.close();

	}

}
