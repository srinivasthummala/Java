package com.java.example;

import org.testng.annotations.Test;

/*A perfect number is a positive integer that is equal to the sum of its proper positive divisors,
that is,the sum of its positive divisors excluding the number itself.Equivalently,a perfect number 
is a number that is half the sum of all of its positive divisors.The first perfect number is 6,
because 1,2 and 3 are its proper positive divisors,and 1+2+3=6. Equivalently,the number 6 is 
equal to half the sum of all its positive divisors:(1+2+3+6)/2=6.*/

public class PerfectNumber {

	// Program: Write a program to find perfect number or not.
	//@Test
	public void metod1() {

		int number = 6;

		int counter = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				counter += i;
			}
		}
		if (counter == number) {
			System.out.println(number + " is a perfect number");
		} else {
			System.out.println(number + " is not a perfect number");
		}
	}

	// Program: Write a program to find perfect numbers between 1 to 100.
	@Test
	public void metod2() {

		for (int i = 1; i <= 100; i++) {
			int counter = 0;
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0) {
					counter += j;
				}
			}
			if (counter == i) {
				System.out.println(i + " is a perfect number");
			} else {
				//System.out.println(i + " is not a perfect number");
			}
		}
	}
}
