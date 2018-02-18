package com.learntocode.javaconfig.DI.impl;

import com.learntocode.javaconfig.DI.services.CarService;

/**
 * Setting properties value and bean using Java-based config class
 * 
 * @author abhthora
 *
 */

public class SwiftDesireCar implements CarService {

	private String color;

	private String model;

	public void setColor(String color) {
		this.color = color;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

	@Override
	public void getCar() {
		System.out.println("Congratulations!!! You got your SwiftDesire. Enjoy!!!");
	}

}
