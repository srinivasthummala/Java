package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyTest {

	@Test(priority = 1)
	public String returnString() {
		return "srinu";
	}

	@Test(priority = 2)
	public void getValueFromMethod() {
		MyTest myTest = new MyTest();
		System.out.println(myTest.returnString());
	}

	@Test(groups = { "functest", "checkintest" })
	public void testMethod1() {
		System.out.println("this is test method1");
	}

	@Test(groups = { "functest", "checkintest" })
	public void testMethod2() {
		System.out.println("this is test method2");

	}

	@Test(groups = { "functest" })
	public void testMethod3() {
		System.out.println("this is test method3");

	}
	
	@Parameters({"user"})
	@Test
	public void testMethod4(@Optional("srinu")  String u) {
		System.out.println("this is test method4");
		System.out.println("user is : "+u);

	}

}
