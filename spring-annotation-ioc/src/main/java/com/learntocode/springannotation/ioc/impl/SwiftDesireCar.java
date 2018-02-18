package com.learntocode.springannotation.ioc.impl;

import org.springframework.stereotype.Component;

import com.learntocode.springannotation.ioc.services.CarService;

@Component
public class SwiftDesireCar implements CarService {

	
	@Override
	public void getCar() {
		System.out.println("Congratulations!!! You got your SwiftDesire. Enjoy!!!");
	}

}
