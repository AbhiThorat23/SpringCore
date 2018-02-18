package com.learntocode.springcore.beanscopedemo.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.learntocode.springcore.beanscopedemo.services.CarService;


/**
 * This class demonstrate the use of @Scope annotation to define Bean scope
 * Default Bean scope for class is "singleton". If we don't specify any scope Spring
 * will consider it as singleton.(Same object for each request)
 * 
 * @author Abhijit Thorat
 *
 */
@Component("myHundaiCar")
@Scope("singleton")
public class HundaiCar implements CarService {

	
	@Override
	public void getCar() {
		System.out.println("Congratulations!!! You got your Hundai car. Enjoy!!!");
	}

}
