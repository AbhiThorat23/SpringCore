package com.learntocode.springconfig.DI.impl;

import org.springframework.stereotype.Component;

import com.learntocode.springconfig.DI.services.InsuranceService;

@Component
public class HDFCInsurance implements InsuranceService {

	@Override
	public String getCarInsurance() {
		return "insured by HDFC Bank.";
	}

}
