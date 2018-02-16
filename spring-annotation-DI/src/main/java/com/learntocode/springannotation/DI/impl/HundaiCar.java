package com.learntocode.springannotation.DI.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learntocode.springannotation.DI.services.CarService;
import com.learntocode.springannotation.DI.services.InsuranceService;


@Component("myCustomHundai")
public class HundaiCar implements CarService {

	private InsuranceService insuranceService; 
	
	/*Constructor injection using Java Annotation*/
	@Autowired
	public HundaiCar(InsuranceService insuranceService){
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
