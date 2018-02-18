package com.learntocode.springannotation.DI.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learntocode.springannotation.DI.services.CarService;

/**
 * This class is to test @Qualifier annotation used with constructor when there are many
 * implementations of dependency service interface
 * 
 * @author abhthora
 *
 */
public class QualifierAnnotationDemo {

	public static void main(String[] args) {

		// Load the config file.
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");

		/*
		 * Retrieve the bean using custom bean id which we have mentioned with
		 * @Component annotation
		 */
		CarService car = applicationContext.getBean("mySwiftDesire", CarService.class);

		// Call the methods on bean
		car.getCar();
		System.out.println("Your Swift Desire is " + car.getCarInsurance());

		// close the context
		applicationContext.close();

	}

}
