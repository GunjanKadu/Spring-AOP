package com.gk.aop.dao;

import org.springframework.stereotype.Component;

import com.gk.aop.Account;

@Component(value = "accountDao")
public class AccountDao {
	public void addAccount(Account theAccount,boolean vipFlag) {
		System.out.println(" [ " + getClass() + " ] " + " : Doing my db work: Adding An Account");
	}
}
