package com.learntocode.springannotation.DI.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learntocode.springannotation.DI.services.CarService;
import com.learntocode.springannotation.DI.services.InsuranceService;

@Component
public class SwiftDesireCar implements CarService {

	private InsuranceService insuranceService;
	
	/*setter Injection by using Java Annotation */
	@Autowired
	public void setInsuranceService(InsuranceService insuranceService) {
		this.insuranceService = insuranceService;
	}

	@Override
	public void getCar() {
		System.out.println("Congratulations!!! You got your SwiftDesire. Enjoy!!!");
	}
	
	@Override
	public String getCarInsurance() {
		return insuranceService.getCarInsurance();
	}

}
