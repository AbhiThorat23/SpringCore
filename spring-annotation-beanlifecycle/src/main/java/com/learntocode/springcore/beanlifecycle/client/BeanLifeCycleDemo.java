package com.learntocode.springcore.beanlifecycle.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learntocode.springcore.beanlifecycle.services.CarService;

/**
 * class to demonstrate bean life cycle. so whenever we load config file
 * init/destroy methods of all the beans will invoked.
 * 
 * @author Abhijit
 *
 */
public class BeanLifeCycleDemo {

	public static void main(String[] args) {

		// Load the config file.
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");

		//Retrive the bean
		CarService carService = applicationContext.getBean("swiftDesireCar", CarService.class);
		
		//call the bean method
		carService.getCar();
		
		// close the context
		applicationContext.close();
	}
}
