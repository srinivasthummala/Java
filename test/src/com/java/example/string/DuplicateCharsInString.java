package com.java.example.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class DuplicateCharsInString {
	
	//Program: Write a program to find out duplicate characters in a string.
	@Test
	public void method1(){
		
		String str = "srinu thummala";
		char[] chrArr = str.toCharArray();
		Map<Character, Integer> duplicate = new HashMap<>();
		for(char ch : chrArr){
			if(!duplicate.containsKey(ch)){
				duplicate.put(ch, 1);
			}else{
				duplicate.put(ch, duplicate.get(ch)+1);
			}
		}
		System.out.println(duplicate);
		
		Set<Character> keySet = duplicate.keySet();
		
		for(char ch : keySet){
			if(duplicate.get(ch)>1){
				System.out.println(ch + " : "+ duplicate.get(ch));
			}
		}
		
	}
	
}
