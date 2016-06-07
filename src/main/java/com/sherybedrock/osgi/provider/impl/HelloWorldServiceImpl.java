package com.sherybedrock.osgi.provider.impl;

import com.sherybedrock.osgi.provider.able.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public void hello() {
		System.out.println("Hello World ! ");
	}
}