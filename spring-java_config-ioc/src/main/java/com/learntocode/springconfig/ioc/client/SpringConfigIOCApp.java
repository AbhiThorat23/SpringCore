package com.learntocode.springconfig.ioc.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learntocode.springconfig.configuration.CarConfig;
import com.learntocode.springconfig.ioc.services.CarService;

/**
 * This class demonstrate the use of Java config file based configuration.
 * Note: How to read Spring config java class in the first step
 * @author Abhijit Thorat
 *
 */
public class SpringConfigIOCApp {

	public static void main(String[] args) {

		/*Read the spring config java class(CarConfig) Note that we have used
		 "AnnotationConfigApplicationContext" here to laod the config class*/
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CarConfig.class);

		// Retrieve the bean from container(Here bean id is default, generated by
		// Spring based on class name).
		CarService swiftCar = applicationContext.getBean("swiftDesireCar", CarService.class);

		// Retrieve the bean instances(Here we have used bean id which is our
		// custom bean id of component).
		CarService hundaiCar = applicationContext.getBean("myCustomHundai", CarService.class);

		// Call the methods on bean
		swiftCar.getCar();
		hundaiCar.getCar();

		// close the context
		applicationContext.close();
	}
}
