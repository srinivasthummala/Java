package com.java.example;

import org.testng.annotations.Test;

public class SwapNumbers {

	// Program : Swap two integers using third user defined variable in Java
	@Test
	public void method1() {

		int x = 10;
		int y = 20;
		System.out.println("Before swap:");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swap:");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);

	}

	// Program : Swap two integers using third user defined variable in Java
	@Test
	public void method2() {

		int x = 10;
		int y = 20;
		System.out.println("Before swap:");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);
		x = x * y;
		y = x / y;
		x = x / y;
		System.out.println("After swap:");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);

	}

	// Program : Swap two integers without using third user defined variable in
	// Java
	@Test
	public void method3() {

		int x = 10;
		int y = 20;
		int z = 0;
		System.out.println("Before swap:");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);
		z = x;
		x = y;
		y = z;
		System.out.println("After swap:");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);
	}
}
