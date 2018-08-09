package com.java.example;

import java.util.Arrays;
import java.util.HashSet;

import org.testng.annotations.Test;

public class CommonArrayElements {

	// Program: Write a program to find common elements between two arrays.
	@Test
	public void method1() {

		int[] arr1 = { 4, 7, 3, 9, 2 };
		int[] arr2 = { 3, 2, 12, 9, 40, 32, 4 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
	
	@Test
	public void method2() {
		
		Integer[] i1 = { 4, 7, 3, 9, 2 };
		Integer[] i2 = { 3, 2, 12, 9, 40, 32, 4 };
		
		HashSet<Integer> set1 = new HashSet<>(Arrays.asList(i1));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(i2));
        
        set1.retainAll(set2);
        System.out.println(set1);
	}
}
