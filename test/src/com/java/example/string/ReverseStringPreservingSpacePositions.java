package com.java.example.string;

import org.testng.annotations.Test;

public class ReverseStringPreservingSpacePositions {

	@Test
	public void method1() {
		String str = "srinu thummala";
		char[] inputArr = str.toCharArray();
		char[] resultArr = new char[inputArr.length];

		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] == ' '){
				resultArr[i] = ' ';
			}
		}

		int j = resultArr.length - 1;
		
		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] != ' ') {
				if (resultArr[j] == ' ') {
					j--;
				}
				resultArr[j] = inputArr[i];
				j--;
			}
			
		}
		System.out.println(String.valueOf(resultArr));
	}
}
