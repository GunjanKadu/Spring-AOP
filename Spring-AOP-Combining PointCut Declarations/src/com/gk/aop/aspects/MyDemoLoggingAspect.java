package com.gk.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	// create a point cut for getter method
	@Pointcut("execution(public * com.gk.aop.dao.*.get*(..))")
	private void getter() {
	}

	// create a point cut for setter method
	@Pointcut("execution(public * com.gk.aop.dao.*.set*(..))")
	private void setter() {
	}

	// create a point cut for all methods method
	@Pointcut("execution(public * com.gk.aop.dao.*.*(..))")
	private void forDaoPackage() {
	}

	// create pointcut to include the package and exclude the getters and setters
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void excludeGetterandSetter() {
	}

	// Pointcut expression for all return types & any number of arguments
	@Before("excludeGetterandSetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n======>>>>> Executing @Before Advice on method()");
	}

	@Before("excludeGetterandSetter()")
	public void performAPIanalytics() {
		System.out.println("\n======>>>>> Executing @Before Advice API analytics");
	}
}
