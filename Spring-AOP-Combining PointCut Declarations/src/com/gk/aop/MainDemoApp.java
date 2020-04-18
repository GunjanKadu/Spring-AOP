package com.gk.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gk.aop.dao.AccountDao;
import com.gk.aop.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		// read spring config
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		AccountDao theAccountDao = context.getBean("accountDao", AccountDao.class);

		// Get the membership dao
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

		// call the business method
		Account myAccount = new Account();
		theAccountDao.addAccount(myAccount, true);
		theAccountDao.doWork();

		// call the membership business method
		theMembershipDAO.addTest();
		theMembershipDAO.goToSleep();

		// close the context
		context.close();
	}

}
