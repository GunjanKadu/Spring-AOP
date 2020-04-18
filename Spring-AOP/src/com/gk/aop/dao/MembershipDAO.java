package com.gk.aop.dao;

import org.springframework.stereotype.Component;

@Component(value = "membershipDAO")
public class MembershipDAO {
	public void addAccount() {
		System.out.println(" [ " + getClass() +" ] " + " :  DOING STUFF:ADDING A MEMBERSHIP ACCOUNT");
	}
}
