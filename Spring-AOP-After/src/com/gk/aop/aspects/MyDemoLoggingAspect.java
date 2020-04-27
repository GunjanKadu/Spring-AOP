package com.gk.aop.aspects;

import java.util.Iterator;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.gk.aop.Account;


@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
	
	@AfterThrowing(pointcut = "execution(public * com.gk.aop.dao.AccountDao.findAccounts(..) )",throwing ="theExe" )
	public void afterThrowingFindAccountsAdvice(JoinPoint theJoinPoint,Throwable theExe) {
		// print out which method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n=======>>>> Executing @AfterThrowing on method: " + method);
		// log the execption
		System.out.println("The Execption is :" + theExe);
	}
	
	

//	add a new advice for @AfterReturning on the findAccounts method

	@AfterReturning(pointcut = "execution(public * com.gk.aop.dao.AccountDao.findAccounts(..))", returning = "result")
	public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> result) {

		// print out which method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n=======>>>> Executing @AfterReturning on method: " + method);

		// print out the result for the method call
		System.out.println("\n=======>>>> Result is : " + result);

		// modify the data

		// convert the account names to all upper case
		convertAccountNameToUpperCase(result);
		
		System.out.println("\n====>>>> results is: " + result);

	}

	private void convertAccountNameToUpperCase(List<Account> result) {
		// loop through the accounts
		for (Account tempAccout : result) {

			// get uppercase version of name
			String theUpperNameString = tempAccout.getName().toUpperCase();

			// update the name on the account
			tempAccout.setName(theUpperNameString);
		}

	}

	@Before("com.gk.aop.aspects.PointCutExpressions.excludeGetterandSetter()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		System.out.println("\n======>>>>> Executing @Before Advice on beforeAddAccount()");

		// display the method signature
		MethodSignature methodSignature = (MethodSignature) theJoinPoint.getSignature();
		System.out.println("Method: " + methodSignature);

		// display method arguments

		// get args

		Object[] argsObjects = theJoinPoint.getArgs();

		// loop through array
		for (Object tempArg : argsObjects) {
			System.out.println(tempArg);
			if (tempArg instanceof Account) {
				// downcast and print account specific stuff
				Account theAccount = (Account) tempArg;

				System.out.println("account name: " + theAccount.getName());
				System.out.println("account name: " + theAccount.getLevel());
			}
		}

	}
}
