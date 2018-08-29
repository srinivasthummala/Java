package com.java.example.string;

public class StringExample {

	public static void main(String[] args) {
		String a = "x";
		String b = "x";
		System.out.println(a == b); //object comparison
		String s1 = new String("s1");
		String s2 = new String("s1");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));//content comparison
	}

}
