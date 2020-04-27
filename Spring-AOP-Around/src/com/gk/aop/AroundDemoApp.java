package com.gk.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gk.aop.dao.AccountDao;
import com.gk.aop.dao.MembershipDAO;
import com.gk.aop.service.TrafficFortuneService;

public class AroundDemoApp {

	public static void main(String[] args) {
		// read spring config
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		TrafficFortuneService theFortuneService = context.getBean("TrafficFortuneService", TrafficFortuneService.class);

		System.out.println("\nMain Program: AroundDemoApp");

		System.out.println("Calling getFortune");

		String dataString = theFortuneService.getFortune();

		System.out.println("My Fortune is :" + dataString);

		System.out.println("Finished");
		
		
		// close the context
		context.close();
	}

}
