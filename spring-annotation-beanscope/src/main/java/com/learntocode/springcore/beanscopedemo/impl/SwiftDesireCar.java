package com.learntocode.springcore.beanscopedemo.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.learntocode.springcore.beanscopedemo.services.CarService;

/**
 * This class demonstrate the use of @Scope annotation to define Bean scope as "Prototype"
 * Prototype: New object for each request.
 * @author Abhijit
 *
 */
@Component("mySwiftCar")
@Scope("prototype")
public class SwiftDesireCar implements CarService {

	@Override
	public void getCar() {
		System.out.println("Congratulations!!! You got your SwiftDesire. Enjoy!!!");
	}

}
