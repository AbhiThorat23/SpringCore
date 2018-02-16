package com.learntocode.springannotation.DI.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learntocode.springannotation.DI.services.CarService;
import com.learntocode.springannotation.DI.services.InsuranceService;

@Component("myBMW")
public class BMWCar implements CarService {

	/*DI using Field injection, No need of Constructor/Method/setter Injection*/
	@Autowired
	private InsuranceService insuranceService;
	
	@Override
	public void getCar() {
		System.out.println("You got yor BMW ready!! Enjoy");
	}

	@Override
	public String getCarInsurance() {
		return insuranceService.getCarInsurance();
	}

}
