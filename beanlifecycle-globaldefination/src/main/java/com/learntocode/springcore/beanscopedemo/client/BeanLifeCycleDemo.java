package com.learntocode.springcore.beanscopedemo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * class to demonstrate Global definition of bean life cycle. Here we set init
 * method for all the beans or group of beans in bean context of spring config
 * file. so whenever we load config file init/destroy methods of all the beans will invoked.
 * 
 * @author abhthora
 *
 */
public class BeanLifeCycleDemo {

	public static void main(String[] args) {

		// Load the config file.
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");


		// close the context
		applicationContext.close();
	}
}
