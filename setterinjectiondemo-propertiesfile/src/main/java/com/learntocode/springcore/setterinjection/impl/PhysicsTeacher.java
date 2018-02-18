package com.learntocode.springcore.setterinjection.impl;

import com.learntocode.springcore.setterinjection.service.QuotesService;
import com.learntocode.springcore.setterinjection.service.TeacherService;

public class PhysicsTeacher implements TeacherService {

	//Dependent Bean Ref to demo dependancy injection using setter method in bean config
	private QuotesService quotesService;
	
	//Literal variables(member variables): To Demo setting literal values 
	//using setter injection from properties file
	private String name;
	private int age;
	private String city;
	
	//Literal variables(member variables): To Demo setting literal values 
	//using setter injection from bean config file directly
	private String email;
	
	//Generate getters and setters for all the dependent object and member variable
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public QuotesService getQuotesService() {
		return quotesService;
	}

	public void setQuotesService(QuotesService quotesService) {
		this.quotesService = quotesService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public void getHomeWork() {
		System.out.println("Solve 10 problems on Oscillation");
	}

	@Override
	public void getQuotes() {
		quotesService.getQuotes();
	}



	

}
