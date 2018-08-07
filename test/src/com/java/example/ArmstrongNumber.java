package com.java.example;

import org.testng.annotations.Test;

/*Armstrong numbers are the sum of their own digits to the power of
the number of digits. It is also known as narcissistic numbers.*/

public class ArmstrongNumber {

	// Program: Write a program to find given number is Armstrong or not.
	@Test
	public void metod1() {

		int number = 153;
		int tmp = number;
		int numOfDigits = String.valueOf(number).length();
		int div = 0;
		int sum = 0;

		while (tmp > 0) {
			div = tmp % 10;
			int temp = 1;
			for (int i = 0; i < numOfDigits; i++) {
				temp *= div;
			}
			sum += temp;
			tmp = tmp / 10;
		}

		if (sum == number) {
			System.out.println(number + " is a Armstrong number");
		} else {
			System.out.println(number + " is not a Armstrong number");
		}
	}

	// Program: Write a program to find perfect numbers between 100 to 1000.
	@Test
	public void metod2() {

		for (int i = 100; i <= 1000; i++) {

			int tmp = i;
			int numOfDigits = String.valueOf(i).length();
			int div = 0;
			int sum = 0;
			while (tmp > 0) {
				div = tmp % 10;
				int temp = 1;
				for (int j = 0; j < numOfDigits; j++) {
					temp *= div;
				}
				sum += temp;
				tmp = tmp / 10;
			}

			if (sum == i) {
				System.out.println(i + " is a Armstrong number");
			} else {
				// System.out.println(i + " is not a Armstrong number");
			}
		}
	}
}
