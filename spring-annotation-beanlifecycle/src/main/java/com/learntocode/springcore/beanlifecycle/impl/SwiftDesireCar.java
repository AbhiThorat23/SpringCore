package com.learntocode.springcore.beanlifecycle.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import com.learntocode.springcore.beanlifecycle.services.CarService;

/**
 * @author Abhijit
 * This class demonstrate the use of @PostConstruct and @PreDestroy annotaion
 */
@Component
public class SwiftDesireCar implements CarService {

	@PostConstruct
	public void customInit() {
		System.out.println("SwiftDesireCar Car's Method customInit() invoked...It does start up stuff");
	}

	@PreDestroy
	public void customDestroy() {
		System.out.println("SwiftDesireCar Car's Method customDestroy() invoked... It does clean up stuff");
	}

	@Override
	public void getCar() {
		System.out.println("Congratulations!!! You got your SwiftDesire. Enjoy!!!");
	}

}
