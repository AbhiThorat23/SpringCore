package com.learntocode.springcore.beanscopedemo.impl;

import com.learntocode.springcore.beanscopedemo.services.CarService;

public class HundaiCar implements CarService {

	public void customInit() {
		System.out.println("Hundai Car's Method customInit() invoked...");
	}

	public void customDestroy() {
		System.out.println("Hundai Car's Method customDestroy() invoked...");
	}

	@Override
	public void getCar() {
		System.out.println("Congratulations!!! You got your Hundai car. Enjoy!!!");
	}

}
