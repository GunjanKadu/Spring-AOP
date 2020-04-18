package com.gk.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	// this is where we add all of our related advice for logging

	// let's start with an Before advice

	// @Before("execution(public void updateAccount())")

	// add account method of only a particular class
	@Before("execution(public void com.gk.aop.dao.AccountDao.addAccount())")
	public void beforeAddAccountAdvice() {
		System.out.println("\n======>>>>> Executing @Before Advice on method()");
	}
}
