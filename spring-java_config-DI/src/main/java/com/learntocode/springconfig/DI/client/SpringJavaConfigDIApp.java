package com.learntocode.springconfig.DI.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learntocode.springconfig.DI.configuration.SpringConfig;
import com.learntocode.springconfig.DI.services.CarService;

/**
 * This class is use to demo DI with Java code config (Constructor/Setter Injection)
 * @author abhthora
 *
 */
public class SpringJavaConfigDIApp {
	
	public static void main(String[] args) {
		
		// Load the Java config file.
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

		// Retrieve the bean instances
		CarService swiftCar = applicationContext.getBean("mySwiftCar", CarService.class);
		
		// Retrieve the bean instances
		CarService hundaiCar = applicationContext.getBean("hundaiCar", CarService.class);
		
		// Call the methods on bean(Constructor injection using Java-Based Config class)
		swiftCar.getCar();
		System.out.println("your swift Desire is " +swiftCar.getCarInsurance());
		
		//Call the methods on bean(Setter injection using Java-Based Config class)
		hundaiCar.getCar();
		System.out.println("your Hundai is " +hundaiCar.getCarInsurance());

		// close the context
		applicationContext.close();
	}
}
