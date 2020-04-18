package com.gk.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	@Before("excludeGetterandSetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n======>>>>> Executing @Before Advice on beforeAddAccount()");
	}

	
	
	
}
