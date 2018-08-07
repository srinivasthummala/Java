package com.java.example;

import org.testng.annotations.Test;

public class FactorialGivenNumber {

	// Program: factorial of given number using java
	// @Test
	public void metod1() {

		int number = 3;
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		System.out.println(factorial);
	}

	// Program: factorial of given number using Genric Functional Interface
	//@Test
	public void metod2() {

		GenericInterface<Integer> factorial = (num) -> {
			int result = 1;
			for (int i = 1; i <= num; i++)
				result = i * result;
			return result;
		};
		System.out.println(factorial.fun(4));
	}

	@FunctionalInterface
	interface GenericInterface<T> {

		T fun(T t);
	}

	// Program: factorial of given number using Normal Functional Interface
	//@Test
	public void metod3() {

		GenericInterface1 factorial = (num) -> {
			int result = 1;
			for (int i = 1; i <= num; i++)
				result = i * result;
			System.out.println(result);
		};
		factorial.fun(4);
	}

	@FunctionalInterface
	interface GenericInterface1 {

		void fun(int i);
	}

	// Program: factorial of given number using java Recursion
	@Test
	public void metod4() {

		System.out.println(fact(4));
	}

	public int fact(int n) {

		if(n!=0)
			return n * fact(n - 1);
		return 1;
	}

}
