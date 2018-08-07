package com.java.example;

import org.testng.annotations.Test;

public class NumberSumRecursion {

	// Program: Write a program to find sum of each digit in the given number
	// using recursion.
	@Test
	public void method1() {
		System.out.println(getNumberSum(233));
	}

	int sum = 0;

	public int getNumberSum(int number) {

		if (number == 0) {
			return sum;
		} else {
			sum += (number % 10);
			getNumberSum(number / 10);
		}
		return sum;
	}

}
