package com.learntocode.springconfig.ioc.impl;

import org.springframework.stereotype.Component;

import com.learntocode.springconfig.ioc.services.CarService;


@Component("myCustomHundai")
public class HundaiCar implements CarService {

	
	@Override
	public void getCar() {
		System.out.println("Congratulations!!! You got your Hundai car. Enjoy!!!");
	}

}
