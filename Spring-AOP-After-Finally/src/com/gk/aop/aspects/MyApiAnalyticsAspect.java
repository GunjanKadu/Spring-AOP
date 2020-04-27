package com.gk.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyApiAnalyticsAspect {
	@Before("com.gk.aop.aspects.PointCutExpressions.excludeGetterandSetter()")
	public void performAPIanalytics() {
		System.out.println("\n======>>>>> Executing @Before Advice API analytics");
	}
}
