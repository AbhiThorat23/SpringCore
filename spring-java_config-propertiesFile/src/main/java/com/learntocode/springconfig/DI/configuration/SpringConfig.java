package com.learntocode.springconfig.DI.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.learntocode.javaconfig.DI.impl.SwiftDesireCar;
import com.learntocode.javaconfig.DI.services.CarService;

/**
 *@PropertySource: Configure the Property file path from where we can get properties values 
 * 
 * @author Abhijit Thorat
 *
 */
@Configuration
@PropertySource("classpath:carinfo.properties")
public class SpringConfig {

	@Value("${foo.color}")
	private String color;

	@Value("${foo.model}")
	private String model;

	/**
	 * In order for @Value annotations to work
	 * PropertySourcesPlaceholderConfigurer should be registered. It is done
	 * automatically when using <context:property-placeholder> in XML, but
	 * should be registered as a static @Bean when using @Configuration.
	 * 
	 * Remove this bean if you are not using @Value annotations for injecting properties
	 * 
	 * @return
	 */
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	/**
	 * setting the properties values using java-based configuration class
	 * @return
	 */
	@Bean
	public CarService swiftDesireCar() {
		SwiftDesireCar desireCar = new SwiftDesireCar();
		desireCar.setColor(color);
		desireCar.setModel(model);
		return desireCar;
	}

}
