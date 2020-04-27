package com.gk.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gk.aop.dao.AccountDao;
import com.gk.aop.dao.MembershipDAO;

public class AfterFinallyDemoApp {

	public static void main(String[] args) {
		// read spring config
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		AccountDao theAccountDao = context.getBean("accountDao", AccountDao.class);

		// call the method to find the acccount
		List<Account> theAccounts = null;

		try {
			// add a boolean flag to simulate exception
			boolean tripWire = false;
			theAccountDao.findAccounts(tripWire);
		} catch (Exception e) {
			System.out.println("\n\nMain Program....caught exception" + e);
		}

		// display the accounts
		System.out.println("\n\nMain Program: After ThrowingDemoApp");
		System.out.println("----");
		System.out.println(theAccounts);
		System.out.println("\n");

		// close the context
		context.close();
	}

}
