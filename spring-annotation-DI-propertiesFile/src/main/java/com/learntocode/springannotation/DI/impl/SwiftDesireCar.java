package com.learntocode.springannotation.DI.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.learntocode.springannotation.DI.services.CarService;

/**
 * Use of @Qualifier annotation to resolve the multiple implementation issue of
 * Service interface
 * 
 * @author abhthora
 *
 */
@Component("mySwiftDesire")
public class SwiftDesireCar implements CarService {

	@Value("${foo.color}")
	private String color;
	
	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

	@Value("${foo.model}")
	private String model;

	@Override
	public void getCar() {
		System.out.println("Congratulations!!! You got your SwiftDesire. Enjoy!!!");
	}


}
