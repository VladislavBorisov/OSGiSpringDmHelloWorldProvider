package com.sherybedrock.osgi.provider.impl;

import java.time.LocalTime;

import com.sherybedrock.osgi.provider.able.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public void hello() {
		LocalTime time = LocalTime.now();
		System.out.println("Hello World  :) " + "local time now is : " + time);
	}
}