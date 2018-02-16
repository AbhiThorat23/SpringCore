package com.learntocode.springannotation.DI.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learntocode.springannotation.DI.services.CarService;
import com.learntocode.springannotation.DI.services.InsuranceService;

@Component
public class AudiCar implements CarService {

	private InsuranceService insuranceService;

	/*
	 * DI using Custom method : 
	 * Note that this is not constructor/Setter Method. i.e. We can inject
	 * dependencies by having ANY method annoted with @Autowired annotation to
	 * inject dependencies. It's not necessory that this method should be
	 * setter/constructor.
	 */
	@Autowired
	public void myCustomMethod(InsuranceService insuranceService) {
		this.insuranceService = insuranceService;
	}

	@Override
	public void getCar() {
		System.out.println("Hey You got your Audi!!!");

	}

	@Override
	public String getCarInsurance() {
		return insuranceService.getCarInsurance();
	}

}
