package com.learntocode.springcore.setterinjection.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learntocode.springcore.setterinjection.impl.PhysicsTeacher;

public class TestMyApp {

	public static void main(String[] args) {
		//1.Load the config file
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");
		
		//2.Retrive Bean object from Bean Factory
		PhysicsTeacher teacherService = applicationContext.getBean("teacherService", PhysicsTeacher.class);
		
		//3.1 Call the methods of bean to check dependency injection using setter injection
		teacherService.getHomeWork();
		teacherService.getQuotes();
		
		//3.2 Call the getters of literal values which are set through config file
		System.out.println("Name is: "+teacherService.getName());
		System.out.println("Age is: "+teacherService.getAge());
		System.out.println("City : "+teacherService.getCity());

		
		//4 Close the Context
		applicationContext.close();

	}

}
