package com.java.example.string;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class FirstNonRepetitiveCharInString {

	// Program: Write a program to find first non-repetitive character in a
	// given string.
	@Test
	public void method1() {

		String name = "teeter";
		char result = ' ';
		for (int i = 0; i < name.length(); i++) {
			boolean status = true;
			for (int j = 0; j < name.length(); j++) {

				if (i != j && name.charAt(i) == name.charAt(j)) {
					status = false;
				}
			}

			if (status) {
				System.out.println("index:-" + i);
				result = name.charAt(i);
				break;
			}
		}
		System.out.println("result: " + result);
	}

	// Program: Write a program to find first non-repetitive character in a
	// given string.
	@Test
	public void method2() {

		String name = "collection";
		List<String> list = Arrays.asList(name.split(""));

		System.out.println(list.stream().filter(s -> (list.indexOf(s) == list.lastIndexOf(s))).findFirst().get());

		for (String s : list) {
			if (list.indexOf(s) == list.lastIndexOf(s)) {
				System.out.println(s);
				break;
			}
		}
	}

	// Program: Write a program to find first non-repetitive character in
	// given string.
	@Test
	public void method3() {

		String name = "collection";
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (name.indexOf(c) == name.lastIndexOf(c)) {
				System.out.println(c);
				break;
			}
		}
	}

	// Program: Write a program to find first non-repetitive character in
	// given string.
	@Test
	public void method4() {

		String name = "collection";
		for (char c : name.toCharArray()) {
			if (name.indexOf(c) == name.lastIndexOf(c)) {
				System.out.println(c);
				break;
			}
		}
	}
}
