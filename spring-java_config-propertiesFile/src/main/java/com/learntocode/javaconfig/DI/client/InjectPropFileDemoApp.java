package com.learntocode.javaconfig.DI.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learntocode.javaconfig.DI.impl.SwiftDesireCar;
import com.learntocode.springconfig.DI.configuration.SpringConfig;

/**
 * Demo class to test setting properties value through java-config file
 * 
 * @author abhthora
 *
 */
public class InjectPropFileDemoApp {

	public static void main(String[] args) {

		// Load the config class.
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

		/*
		 * Retrieve the bean(here bena id is the name of method in Java-config class)
		 */
		SwiftDesireCar swiftCar = applicationContext.getBean("swiftDesireCar", SwiftDesireCar.class);

		// Call the methods on bean
		swiftCar.getCar();
		System.out.println("color of car is: "+swiftCar.getColor());
		System.out.println("Model of car is: "+swiftCar.getModel());
		
		// close the context
		applicationContext.close();

	}

}
