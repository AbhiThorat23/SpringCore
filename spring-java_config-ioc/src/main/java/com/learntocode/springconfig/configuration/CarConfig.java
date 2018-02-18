package com.learntocode.springconfig.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * This is Java config class to configure the beans.
 * @Configuration: tells that this class is config class
 * @ComponentScan: tells the package for which spring has to configure the beans.
 * @author Abhijit Thorat
 *
 */
@Configuration
@ComponentScan("com.learntocode.springconfig.ioc.impl")
public class CarConfig {

}
