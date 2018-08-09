package com.java.example.string;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class DuplecateElementsInArray {

	// Java Program To Find Duplicate Elements In An Array Using Brute Force
	// Method :
	@Test
	public void method1() {

		String[] strArr = { "abc", "acb", "adc", "abc", "asc", "adc", "aed" };
		for (int i = 0; i < strArr.length; i++) {
			for (int j = i + 1; j < strArr.length; j++) {
				if ((strArr[i].equals(strArr[j])) && (i != j)) {
					System.out.println("Duplecate array elemnts : " + strArr[i]);
				}
			}
		}

	}

	// Java Program To Find Duplicate Elements In An Array Using HashSet :
	@Test
	public void method2() {

		String[] strArr = { "abc", "acb", "adc", "abc", "asc", "adc", "aed" };
		Set<String> set = new HashSet<>();
		for (String s : strArr) {
			if (!set.add(s)) {
				System.out.println("Duplecate array elemnts : " + s);
			}
		}
	}
}
