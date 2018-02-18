package com.learntocode.springcore.beanscopedemo.impl;

import com.learntocode.springcore.beanscopedemo.services.CarService;

public class HundaiCar implements CarService {

	@Override
	public void getCar() {
		System.out.println("Congratulations!!! You got your Hundai car. Enjoy!!!");
	}

}
