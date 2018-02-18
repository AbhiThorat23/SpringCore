package com.learntocode.springconfig.DI.impl;

import com.learntocode.springconfig.DI.services.CarService;
import com.learntocode.springconfig.DI.services.InsuranceService;


public class SwiftDesireCar implements CarService {

	private InsuranceService insuranceService;
	
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
