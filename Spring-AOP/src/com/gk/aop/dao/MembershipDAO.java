package com.gk.aop.dao;

import org.springframework.stereotype.Component;

@Component(value = "membershipDAO")
public class MembershipDAO {
	public boolean addTest() {
		System.out.println(" [ " + getClass() + " ] " + " :  DOING STUFF:ADDING A MEMBERSHIP ACCOUNT");
		return true;
	}

	public void goToSleep() {
		System.out.println(" [ " + getClass() + " ] " + " :  Goto Sleep");

	}
}
