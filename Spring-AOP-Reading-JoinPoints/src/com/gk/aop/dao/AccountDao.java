package com.gk.aop.dao;

import org.springframework.stereotype.Component;

import com.gk.aop.Account;

@Component(value = "accountDao")
public class AccountDao {

	private String nameString;
	private String serviceString;

	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(" [ " + getClass() + " ] " + " : Doing my db work: Adding An Account");
	}

	public boolean doWork() {
		System.out.println(" [ " + getClass() + " ] " + " : doWork()");
		return false;
	}

	public String getNameString() {
		System.out.println(" [ " + getClass() + " ] " + " : inGetName");

		return nameString;
	}

	public void setNameString(String nameString) {
		System.out.println(" [ " + getClass() + " ] " + " : inSetName");

		this.nameString = nameString;
	}

	public String getServiceString() {
		System.out.println(" [ " + getClass() + " ] " + " : inGetService");

		return serviceString;
	}

	public void setServiceString(String serviceString) {
		System.out.println(" [ " + getClass() + " ] " + " : inSetService");

		this.serviceString = serviceString;
	}

}
