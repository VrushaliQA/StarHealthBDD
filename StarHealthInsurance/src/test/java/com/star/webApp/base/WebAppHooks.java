package com.star.webApp.base;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;


public class WebAppHooks {

	@Before(order=-1)
	public void initSmoke()
	{
		System.out.println("-1 hook");
	}
	@Before(order=0)
	public void init()
	{
		System.out.println("0 hook");
	}
	@After
	public void tearDown()
	{
		System.out.println("out from hooks");
	}
}
