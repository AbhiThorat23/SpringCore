package com.learntocode.springannotation.DI.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.learntocode.springannotation.DI.services.CarService;
import com.learntocode.springannotation.DI.services.InsuranceService;

/**
 * use of @Qualifier with constructor injection 
 * @author abhthora
 *
 */
@Component
public class HundaiCar implements CarService {

	private InsuranceService insuranceService;

	/*
	 * DI using Constructor Injection and @Qualifier annotation. As there are
	 * multiple implementation for InsuranceService.java(HDFC,Kotak.BharatiAxa)
	 * we have to specify which one to select so that Spring will create the
	 * bean of that specific class and assign that dependency in our class. For
	 * this we use @Qualifier(bean id) annotation.
	 */
	@Autowired
	public HundaiCar(@Qualifier("bharatiAxaInsurance") InsuranceService insuranceService) {
		this.insuranceService = insuranceService;
	}

	@Override
	public void getCar() {
		System.out.println("Congratulations!!! You got your HundaiCar. Enjoy!!!");
	}

	@Override
	public String getCarInsurance() {
		return insuranceService.getCarInsurance();
	}

}
