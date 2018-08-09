package com.java.example.string;

import java.util.Arrays;

import org.testng.annotations.Test;

/*Two Strings are said to be anagrams if they contain same number of characters (excluding space), 
 * same set of characters but in different order. Following are some of the anagrams.
	• dose – does
	• used – dues
	• care – race
	• silent – listen */

public class AnagramCheck {

	// Program: Write a java program to find if two Strings are anagram.
	@Test
	public void method1() {

		String str1 = "listen";
		String str2 = "silent";

		isAnagram1(str1, str2);
		if (isAnagram4(str1, str2)) {
			System.out.println("strings are anagram");
		}

	}

	// Anagram Program In Java Using Iterative Method
	public void isAnagram1(String str1, String str2) {

		String s1 = str1.replace("\\s", "").toLowerCase();
		String s2 = str2.replace("\\s", "").toLowerCase();
		boolean status = true;
		if (str1.length() != str2.length()) {
			status = false;
		} else {
			char[] chrArr = s1.toCharArray();

			for (char c : chrArr) {
				int index = s2.indexOf(c);
				if (index != -1) {
					s2 = s2.substring(0, index) + s2.substring(index + 1, s2.length());
				} else {
					status = false;
					break;
				}
			}
		}

		if (status) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
		}

	}

	//Anagram Program In Java Using StringBuilder
	public boolean isAnagram2(String str1, String str2) {

		boolean status = true;
		if (str1 != null && str2 != null && str1.length() == str2.length()) {
			char[] chrArr = str1.toCharArray();
			StringBuilder sbSecond = new StringBuilder(str2);
			for (char c : chrArr) {
				int index = sbSecond.indexOf("" + c);
				if (index != -1) {
					sbSecond.deleteCharAt(index);
				}
			}
			return sbSecond.toString().isEmpty();
		}
		return status;
	}

	//Anagram Program In Java Using sort() and equals() Methods.
	public void isAnagram3(String str1, String str2) {

		boolean status = true;
		if (str1.length() != str2.length()) {
			status = false;
		} else {

			char[] chrArr1 = str1.toCharArray();
			char[] chrArr2 = str2.toCharArray();

			Arrays.sort(chrArr1);
			Arrays.sort(chrArr2);

			status = Arrays.equals(chrArr1, chrArr2);
		}

		if (status) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
		}
	}

	// Anagram Program In Java Using Iterative Method
	public boolean isAnagram4(String str1, String str2) {

		boolean status = true;
		if (str1 != null && str2 != null && str1.length() == str2.length()) {
			char[] chrArr = str1.toCharArray();
			for (char c : chrArr) {
				int index = str2.indexOf(c);
				if (index == -1) {
					status = false;
					break;
				}
			}
		}
		return status;
	}
}
