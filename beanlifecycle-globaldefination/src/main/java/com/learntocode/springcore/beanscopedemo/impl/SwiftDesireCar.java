package com.learntocode.springcore.beanscopedemo.impl;

import com.learntocode.springcore.beanscopedemo.services.CarService;

public class SwiftDesireCar implements CarService {

	public void customInit() {
		System.out.println("SwiftDesireCar Car's Method customInit() invoked...");
	}

	public void customDestroy() {
		System.out.println("SwiftDesireCar Car's Method customDestroy() invoked...");
	}

	@Override
	public void getCar() {
		System.out.println("Congratulations!!! You got your SwiftDesire. Enjoy!!!");
	}

}
