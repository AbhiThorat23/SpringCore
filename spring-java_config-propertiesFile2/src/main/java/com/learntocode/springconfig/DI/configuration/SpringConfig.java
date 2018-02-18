package com.learntocode.springconfig.DI.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.learntocode.javaconfig.DI.impl.SwiftDesireCar;
import com.learntocode.javaconfig.DI.services.CarService;

/**
 * @PropertySource: Configure the Property file path from where we can get
 *                  properties values
 * 
 * @author Abhijit Thorat
 */
@Configuration
@PropertySource("classpath:carinfo.properties")
public class SpringConfig {

	/**
	 * In order for @Value annotations to work
	 * PropertySourcesPlaceholderConfigurer should be registered. It is done
	 * automatically when using <context:property-placeholder> in XML, but
	 * should be registered as a static @Bean when using @Configuration.
	 * 
	 * Remove this bean if you are not using @Value annotations for injecting
	 * properties
	 * 
	 * In Spring 4.3 and higher, they removed this requirement. As a result, you
	 * don't need this code.
	 */
	/*
	 * @Bean public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() { 
	 * return new PropertySourcesPlaceholderConfigurer(); 
	 * }
	 */

	/**
	 * creating bean for SwiftDesireCar
	 * 
	 * @return
	 */
	@Bean
	public CarService swiftDesireCar() {
		return new SwiftDesireCar();
	}

}
