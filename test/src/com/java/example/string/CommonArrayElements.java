package com.java.example.string;

import java.util.Arrays;
import java.util.HashSet;

import org.testng.annotations.Test;

public class CommonArrayElements {

	// Program: Write a program to find common elements between two arrays.
	@Test
	public void method1() {
		String[] s1 = { "abc", "acb", "adc", "abc", "asc", "adc", "aed" };
		String[] s2 = { "abc", "aaa", "bbb", "alm", "abd", "adc", "aws" };
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					set.add(s1[i]);
				}
			}
		}
		System.out.println(set);
	}
	
	@Test
	public void method2() {
		
		String[] s1 = { "abc", "acb", "adc", "abc", "asc", "adc", "aed" };
		String[] s2 = { "abc", "aaa", "bbb", "alm", "abd", "adc", "aws" };
		
		HashSet<String> set1 = new HashSet<>(Arrays.asList(s1));
        HashSet<String> set2 = new HashSet<>(Arrays.asList(s2));
        
        set1.retainAll(set2);
        System.out.println(set1);
	}
}
