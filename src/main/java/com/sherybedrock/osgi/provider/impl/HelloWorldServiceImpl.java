package com.sherybedrock.osgi.provider.impl;

import java.time.LocalDate;
import java.time.LocalTime;

import com.sherybedrock.osgi.provider.able.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public void hello() {
		LocalTime time = LocalTime.now();
		LocalDate date = LocalDate.now();

		System.out.println("Hello World  :) " + "local date/time now is : " + date + "*" + time);
	}
}