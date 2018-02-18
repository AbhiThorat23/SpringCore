package com.learntocode.springannotation.DI.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.learntocode.springannotation.DI.services.CarService;
import com.learntocode.springannotation.DI.services.InsuranceService;

/**
 * Use of @Qualifier annotation to resolve the multiple implementation issue of
 * Service interface
 * 
 * @author abhthora
 *
 */
@Component("mySwiftDesire")
public class SwiftDesireCar implements CarService {

	/*
	 * DI using Filed Injection. As there are multiple implementation for
	 * InsuranceService.java(HDFC,Kotak.BharatiAxa) we have to specify which one
	 * to select so that Spring will create the bean of that specific class and
	 * assign that dependency in our class. For this we use @Qualifier(bean id)
	 * annotation.
	 */
	@Autowired
	@Qualifier("kotakInsurance")
	private InsuranceService insuranceService;

	@Override
	public void getCar() {
		System.out.println("Congratulations!!! You got your SwiftDesire. Enjoy!!!");
	}

	@Override
	public String getCarInsurance() {
		return insuranceService.getCarInsurance();
	}

}
