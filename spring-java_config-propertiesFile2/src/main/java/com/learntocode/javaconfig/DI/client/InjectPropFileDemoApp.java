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
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringConfig.class);

		/*
		 * Retrieve the bean(here bena id is the name of method in Java-config
		 * class)
		 */
		SwiftDesireCar swiftCar = applicationContext.getBean("swiftDesireCar", SwiftDesireCar.class);

		// Call the methods on bean which test the getting of values from
		// Environment class and by using properties file
		swiftCar.getCar();
		swiftCar.readValues();

		// close the context
		applicationContext.close();

	}

}
