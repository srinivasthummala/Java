package com.java.example.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.Test;

public class StringOcuurrence {

	// Program: find occurrences of sub string in given string using regex.
	@Test
	public void method1() {

		String input = "hi srinu how are you srinu";

		Pattern pattern = Pattern.compile("u");
		Matcher matcher = pattern.matcher(input);
		int occurrence = 0;
		while (matcher.find()) {
			occurrence++;
		}
		System.out.println(occurrence);
	}

	// Program: find occurrences of sub string in given string.
	@Test
	public void method2() {

		String input = "hi srinu how are you srinu";
		System.out.println(StringUtils.countMatches(input, "u"));

		String str = "helloslkhellodjladfjhello";
		String findStr = "hello";
		System.out.println(str.split(findStr, -1).length - 1);

		System.out.println(str.split(findStr, 0).length);
		
		System.out.println(str.split(findStr).length);
		

		for (String s : str.split(findStr, 0)) {
			System.out.println(s);
		}
		
	}
}
