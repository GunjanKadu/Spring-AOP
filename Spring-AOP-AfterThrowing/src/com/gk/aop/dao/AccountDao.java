package com.gk.aop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.gk.aop.Account;

@Component(value = "accountDao")
public class AccountDao {

	private String nameString;
	private String serviceString;

	public List<Account> findAccounts() {
		List<Account> myAccounts = new ArrayList<Account>();
		
		// create sample accounts
		Account temp1 = new Account("John","Silver");
		Account temp2 = new Account("Gunjan","Gold");
		Account temp3 = new Account("Arun","Silver");

		
		// add them to the list
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);

		
		return myAccounts;
	}

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
