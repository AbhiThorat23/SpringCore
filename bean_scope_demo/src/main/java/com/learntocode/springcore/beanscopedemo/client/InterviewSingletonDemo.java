package com.learntocode.springcore.beanscopedemo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learntocode.springcore.beanscopedemo.impl.Scope;

/**
 *Demo class to demonstrate Singleton bean scope in details: i.e. single object is created per bean id.
 *Refer the article {@link https://dzone.com/articles/an-interview-question-on-spring-singletons}
 *
 * 
 * @author abhthora
 *
 */
public class InterviewSingletonDemo {

	public static void main(String[] args) {

		// Load the config file.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("interviewSpringConfig.xml");

		// retrieve the beans
		Scope scope = ctx.getBean("scopeTest", Scope.class);
		Scope scopeDuplicate = ctx.getBean("scopeTestDuplicate", Scope.class);

		// Check the references
		if (scope == scopeDuplicate) {
			System.out.println("scope and scopeDuplicate both are pointing to same object(Bean).");
			System.out.println("scope points to  :" + scope);
			System.out.println("scopeDuplicate Points to :" + scopeDuplicate);
		} else {
			System.out.println("scope and scopeDuplicate both are pointing to Different object(Bean).");
			System.out.println("scope points to  :" + scope);
			System.out.println("scopeDuplicate Points to :" + scopeDuplicate);
		}

		/*
		 * A Spring Singleton does not work like a Java Singleton So it is clear
		 * that for a given id, a Spring container maintains only one shared
		 * instance in a singleton cache.
		 * 
		 * In my example, I use two different ids (scopeTest and
		 * ScopeTestDuplicate), so the Spring container creates two instances of
		 * the same class and binds them with respective ids, then stores them
		 * in a Singleton cache
		 */

		// Close the context.
		ctx.close();

	}
}
