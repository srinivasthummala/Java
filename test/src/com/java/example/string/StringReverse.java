package com.java.example.string;

import org.testng.annotations.Test;

public class StringReverse {

	@Test
	public void method1() {
		reverseString("srinu");
		reverseString1("thummala");
		reverseString2("srinu thummala");
		System.out.println(reverseString3("srinu thummala"));
		reverseString2("thummala srinu");
	}

	//Using iterative method
	public void reverseString(String str) {

		int length = str.length();
		char[] charArr = str.toCharArray();
		String s = "";

		for (int i = length - 1; i >= 0; i--) {
			s += charArr[i];
		}
		System.out.println(s);
	}

	//Using iterative method
	public void reverseString1(String str) {

		int length = str.length();
		char[] charArr = str.toCharArray();

		for (int i = length - 1; i >= 0; i--)
			System.out.print(charArr[i]);
		System.out.println("");

	}

	//Using StringBuffer class
	public void reverseString2(String str) {

		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
	}

	//Using recursive method.
	public String reverseString3(String str) {

		if (str == null || str.length() <= 1)
			return str;
		return reverseString3(str.substring(1)) + str.charAt(0);
	}

	//Using iterative method
	public void reverseString4(String str) {

		int length = str.length();
		String reverse = "";
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + str.charAt(i);
		System.out.println(reverse);

	}

	// Program: reverse a string by removing immediate repetitive chars
	@Test
	public void method2() {

		String input = "hello";

		int strLength = input.length();
		char prev = 0;
		String revStr = "";
		char[] chrArr = input.toCharArray();
		for (int i = strLength - 1; i >= 0; i--) {
			if (prev == chrArr[i]) {
				continue;
			} else {
				prev = chrArr[i];
				revStr += chrArr[i];
			}
		}
		System.out.println(revStr);
	}
}
