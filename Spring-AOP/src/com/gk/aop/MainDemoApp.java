package com.gk.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gk.aop.dao.AccountDao;

public class MainDemoApp {

	public static void main(String[] args) {
		// read spring config
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		AccountDao theAccountDao = context.getBean("accountDao", AccountDao.class);

		// call the business method
		theAccountDao.addAccount();

		// do it again
		System.out.println("\n let's call it again");
		theAccountDao.addAccount();
		
		// close the context
		context.close();
	}

}
