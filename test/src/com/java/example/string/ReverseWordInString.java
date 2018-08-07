package com.java.example.string;

import org.testng.annotations.Test;

public class ReverseWordInString {

	@Test
	public void method1() {
		reverseStringWords("Hi This Is Srinu");
		reverseStringWords1("Hi This Is Srinu");
	}

	public void reverseStringWords(String str) {

		String[] string = str.split(" ");
		String reversedString = "";
		for (int i = 0; i < string.length; i++) {
			String word = string[i];
			String reversedWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reversedWord = reversedWord + word.charAt(j);
			}
			reversedString = reversedString + reversedWord + " ";
		}
		System.out.println(reversedString);
	}

	public void reverseStringWords1(String str) {
		
		String[] strings = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String s : strings){
			sb.append(new StringBuilder(s).reverse().toString());
			sb.append(' ');
		}
		System.out.println(sb);
	}

}
