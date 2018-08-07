package com.java.example;

import org.testng.annotations.Test;

public class FibonacciSeries {

	@Test
	public void method1() {
		fib1(12);
		fib2(8);
		fib3(15);
	}

	public void fib1(int num) {
		int[] fib = new int[num];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < num; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}

		for (int i : fib) {
			System.out.print(i + " ");
		}
	}

	public void fib2(int count) {
		int num1 = 0;
		int num2 = 1;
		int num3;
		System.out.println("");
		for (int i = 0; i < count; i++) {
			System.out.print(num1 + " ");
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;

		}
	}

	public void fib3(int count) {
		int num1 = 0;
		int num2 = 1;
		int num3;
		System.out.println("");
		int i = 1;
		while (i <= count) {
			System.out.print(num1 + " ");
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			i++;
		}
	}

}
