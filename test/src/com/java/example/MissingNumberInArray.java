package com.java.example;

import org.testng.annotations.Test;

public class MissingNumberInArray {

	@Test
	public void method2() {

		int num[] = { 5, 4, 7, 2, 9, 1, 6, 3 };

		int size = num.length;
		int sumOfNums = (size + 1) * (size + 2) / 2;
		int sumOfElements = 0;
		for (int n : num) {
			sumOfElements += n;
		}
		System.out.println("Missing element : "+ (sumOfNums-sumOfElements));
	}

}
