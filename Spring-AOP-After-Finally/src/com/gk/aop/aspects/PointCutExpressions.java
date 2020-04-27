package com.gk.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCutExpressions {

	@Pointcut("execution(public * com.gk.aop.dao.*.get*(..))")
	public void getter() {
	}

	// create a point cut for setter method
	@Pointcut("execution(public * com.gk.aop.dao.*.set*(..))")
	public void setter() {
	}

	// create a point cut for all methods method
	@Pointcut("execution(public * com.gk.aop.dao.*.*(..))")
	public void forDaoPackage() {
	}

	// create pointcut to include the package and exclude the getters and setters
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void excludeGetterandSetter() {
	}
}
