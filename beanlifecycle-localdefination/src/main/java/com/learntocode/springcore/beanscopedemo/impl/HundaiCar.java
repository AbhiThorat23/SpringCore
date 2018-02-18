package com.learntocode.springcore.beanscopedemo.impl;

import com.learntocode.springcore.beanscopedemo.services.CarService;

public class HundaiCar implements CarService {

	public HundaiCar() {
		System.out.println("You are in constructor now ");
	}

	/*
	 * This is the custom Init method which is configured in config.xml file. It
	 * will be called post construct of bean i.e. constructor will be called
	 * first and then this init method will be called. This is the no argument
	 * method.
	 */
	public void customInit() {
		System.out.println("Method customInit() invoked...");
	}

	/*
	 * This is the custom Destroy method which is configured in config.xml file.
	 * It will be called pre destroy of bean i.e. before destroying bean this
	 * customdestroy method is called This is the no argument method.
	 */
	public void customDestroy() {
		System.out.println("Method customDestroy() invoked...");
	}
	
	@Override
	public void getCar() {
		System.out.println("Congratulations!!! You got your Hundai car. Enjoy!!!");
	}

}
