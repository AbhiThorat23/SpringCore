package com.learntocode.javaconfig.DI.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

import com.learntocode.javaconfig.DI.services.CarService;

/**
 * Setting properties value and bean using Java-based config class Note that
 * here we have not used setter methods to set properties values. It is
 * automatically assign to respective variable through Properties file.
 * 
 * Also Note the use of Environment class provided by Spring.
 * 
 * i.e. If we use Environment class then there is no need of @Value (which we
 * have used for "model" and "color") we can directly get the values using
 * getProperty() method of Environment class(Which we did for getting
 * "jdbc.driverClassName")
 * 
 * @author Abhijit Thorat
 *
 */

public class SwiftDesireCar implements CarService {

	@Value("${foo.color}")
	private String color;

	@Value("${foo.model}")
	private String model;

	/*
	 * Environment will get access to all the properties declared in specified
	 * .properties file. You can get the value of specific property using
	 * getProperty method.
	 */
	@Autowired
	private Environment environment;

	public void readValues() {
		System.out
				.println("Getting property via Spring Environment :" + environment.getProperty("jdbc.driverClassName"));

		System.out.println("color is : " + color);
		System.out.println("model is : " + model);

	}

	@Override
	public void getCar() {
		System.out.println("Congratulations!!! You got your SwiftDesire. Enjoy!!!");
	}

}
