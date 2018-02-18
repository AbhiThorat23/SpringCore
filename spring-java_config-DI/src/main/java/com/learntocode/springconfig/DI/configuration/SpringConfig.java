package com.learntocode.springconfig.DI.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learntocode.springconfig.DI.impl.HDFCInsurance;
import com.learntocode.springconfig.DI.impl.HundaiCar;
import com.learntocode.springconfig.DI.impl.SwiftDesireCar;
import com.learntocode.springconfig.DI.services.CarService;
import com.learntocode.springconfig.DI.services.InsuranceService;

/**
 * Notice that We are not using @ComponentScan annotation. Here we are defining
 * each bean individually in this config file. Also we are injecting
 * dependency(Constructor/Setter Injection) 
 * HundaiCar: Constructor Injection
 * SwiftDesireCar : Setter Injection
 * 
 * @author Abhijit Thorat
 *
 */
@Configuration
public class SpringConfig {

	/**
	 * Method name is the actual bean id which spring will use when it register
	 * the Bean with Spring Container. This method returns the HDFCInsurance
	 * Bean (Which is the dependency for SwiftCar/HundaiCar)
	 * 
	 * @return
	 */
	@Bean
	public InsuranceService hdfcInsurance() {
		return new HDFCInsurance();
	}

	/**
	 * Method name(hundaiCar) is the bean id we will use in our main app. Here
	 * we are creating Beans and also injecting dependency(Constructor
	 * injection)
	 * 
	 * @return CarService
	 */
	@Bean
	public CarService hundaiCar() {
		return new HundaiCar(hdfcInsurance());

	}

	/**
	 * Here we have explicitly defined the bean name(mySwiftCar). We will use it in our main app.
	 * Here we are injecting dependency using setter injection.
	 * 
	 * 
	 * @return
	 */
	@Bean("mySwiftCar")
	public CarService swiftCar() {
		SwiftDesireCar desireCar = new SwiftDesireCar();
		desireCar.setInsuranceService(hdfcInsurance());
		return desireCar;

	}

}
