package com.gk.aop.dao;

import org.springframework.stereotype.Component;

@Component(value="accountDao")
public class AccountDao {
	public void addAccount() {
		System.out.println(getClass()+" : Doing my db work: Adding An Account");
	}
}
