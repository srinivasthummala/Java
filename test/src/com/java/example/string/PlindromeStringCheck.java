package com.java.example.string;

import org.testng.annotations.Test;

public class PlindromeStringCheck {
	// A palindrome string is a string that is same after reverse.
	@Test
	public void metod1() {

		String str = "madam";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		if (rev.equals(str)) {
			System.out.println("String is palindrome");
		}
	}

	// A palindrome string is a string that is same after reverse.
	@Test
	public void metod2() {

		String str = "madam";
		StringBuilder sb = new StringBuilder(str);
		if (sb.reverse().toString().equals(str)) {
			System.out.println("String is palindrome");
		}
	}
}
