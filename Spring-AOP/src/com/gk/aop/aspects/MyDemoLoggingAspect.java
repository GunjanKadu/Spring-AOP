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
	// @Before("execution(public void com.gk.aop.dao.AccountDao.addAccount())")

	// Adding wildcard pointcut expression
	// @Before("execution(public void add*())")

	// PointCut expression only for void return types
	// @Before("execution( void add*())")

	// Pointcut expression for all return types & particular argument
	// @Before("execution(public * add*(com.gk.aop.Account))")
	
	// Pointcut expression for all return types & any number of arguments
	@Before("execution(public * add*(..))")
	public void beforeAddAccountAdvice() {
		System.out.println("\n======>>>>> Executing @Before Advice on method()");
	}
}
