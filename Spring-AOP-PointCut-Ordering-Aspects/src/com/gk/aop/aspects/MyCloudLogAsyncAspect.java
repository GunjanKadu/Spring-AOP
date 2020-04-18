package com.gk.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudLogAsyncAspect {
	@Before("com.gk.aop.aspects.PointCutExpressions.excludeGetterandSetter()")
	public void logToCloud() {
		System.out.println("\n======>>>>> Executing @Before Advice logToCloud");
	}
}
