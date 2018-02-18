package com.learntocode.springcore.beanscopedemo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learntocode.springcore.beanscopedemo.impl.HundaiCar;
import com.learntocode.springcore.beanscopedemo.services.CarService;

/**
 * Test class to demo bean life cycle methods.
 * 
 * @author abhthora
 *
 */
public class SpringSingletonScopeDemo {
	
	public static void main(String[] args) {
		
		// Load the config file.
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");

		//Retrieve the bean
		CarService car = applicationContext.getBean("myHundaiCar", HundaiCar.class);
		
		//Call the methods on bean
		car.getCar();
		
		// close the context
		applicationContext.close();
	}
}
