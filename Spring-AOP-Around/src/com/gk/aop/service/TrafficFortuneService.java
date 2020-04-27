package com.gk.aop.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;


@Component(value = "TrafficFortuneService")
public class TrafficFortuneService {

	public String getFortune() {
		// simulate a delay
		try {

			TimeUnit.SECONDS.sleep(5);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// return a fortune
		return "Expect Heavy Traffic this morning";
	}
}
