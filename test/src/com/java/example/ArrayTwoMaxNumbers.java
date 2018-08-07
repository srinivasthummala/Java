package com.java.example;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ArrayTwoMaxNumbers {

	// Program: Write a program to find top two maximum numbers in a array.
	@Test
	public void method1() {

		int num[] = { 5, 34, 78, 2, 45, 1, 99, 23 };
		int max1 = 0;
		int max2 = 0;

		for (int n : num) {
			if (max1 < n) {
				max2 = max1;
				max1 = n;
			} else if (max2 < n) {
				max2 = n;
			}
		}
		System.out.println(max1 + " " + max2);
	}
	
	@Test
	public void method2() {

		int num[] = { 5, 34, 78, 2, 45, 1, 99, 23 };
		
		Arrays.sort(num);
		System.out.println(num[num.length-1]+" "+ num[num.length-2]);
	}
}
