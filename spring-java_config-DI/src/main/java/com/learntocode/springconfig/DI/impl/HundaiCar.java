package com.learntocode.springconfig.DI.impl;

import com.learntocode.springconfig.DI.services.CarService;
import com.learntocode.springconfig.DI.services.InsuranceService;

public class HundaiCar implements CarService {

	private InsuranceService insuranceService;

	public HundaiCar(InsuranceService insuranceService) {
		this.insuranceService = insuranceService;
	}

	@Override
	public void getCar() {
		System.out.println("Congratulations!!! You got your Hundai car. Enjoy!!!");
	}

	@Override
	public String getCarInsurance() {
		return insuranceService.getCarInsurance();

	}

}
