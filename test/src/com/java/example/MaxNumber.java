package com.java.example;

import org.testng.annotations.Test;

public class MaxNumber {
	
	//How To Find Largest Number Less Than Given Number And Without Given Digit?
	@Test
	public void method1(){
		
		int n =143;
		int digit = 1;
		
		while(String.valueOf(n).contains(Integer.toString(digit))){
			n--;
		}
		System.out.println(n);
	}

}
