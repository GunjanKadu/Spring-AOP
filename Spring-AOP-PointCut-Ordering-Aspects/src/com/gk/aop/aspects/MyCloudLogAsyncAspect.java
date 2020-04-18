package com.gk.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyCloudLogAsyncAspect {
	@Before("excludeGetterandSetter()")
	public void logToCloud() {
		System.out.println("\n======>>>>> Executing @Before Advice logToCloud");
	}
}
