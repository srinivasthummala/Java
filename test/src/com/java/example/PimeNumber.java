package com.java.example;

import org.testng.annotations.Test;

public class PimeNumber {

	@Test
	public void metod1() {
		System.out.println("Is 17 prime number? "+ isPrimeNumber(17));
	}
	
	//Program: Write a program to find the sum of the first 1000 prime numbers.
	@Test
	public void metod2() {

		int number = 2;
	        int count = 0;
	        long sum = 0;
	        while(count < 1000){
	            if(isPrimeNumber(number)){
	                sum += number;
	                count++;
	            }
	            number++;
	        }
	        System.out.println(sum);
	}

	public boolean isPrimeNumber(int number) {

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
