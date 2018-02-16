package com.learntocode.springannotation.DI.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learntocode.springannotation.DI.services.CarService;

/**
 * This class test the field injection (DI directly with Field)
 * @author abhthora
 *
 */
public class FieldInjectionDemoApp {

	public static void main(String[] args) {

		// Load the config file.
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");

		/* Retrive the bean by custom bean id (If class name contains 1st and
		 2nd letter in Upper case then Spring will not convert it on lower
		 case while generationg Bean id. so its best practice to give our own
		 custom bean ID) */
		CarService car = applicationContext.getBean("myBMW", CarService.class);

		// Call the methods on bean(DI using custom method)
		car.getCar();
		System.out.println("Your Audi is " + car.getCarInsurance());

		// close the context
		applicationContext.close();

	}

}
