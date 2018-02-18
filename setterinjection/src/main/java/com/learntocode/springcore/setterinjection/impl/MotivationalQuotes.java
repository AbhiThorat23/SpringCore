package com.learntocode.springcore.setterinjection.impl;

import com.learntocode.springcore.setterinjection.service.QuotesService;

public class MotivationalQuotes implements QuotesService {

	public void getQuotes() {
		System.out.println("Belive in Yourself");
	}

}
