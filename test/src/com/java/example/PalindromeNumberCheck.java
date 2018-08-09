package com.java.example;

import org.testng.annotations.Test;

public class PalindromeNumberCheck {

	// A palindrome number is a number that is same after reverse. 
	@Test
	public void metod1() {
		
		int num = 212;
		int temp = num;
		int rev = 0;
		while(temp>0){
			int div = temp%10;
			rev = (rev*10) + div;
			temp=temp/10;
		}
		if(rev == num){
			System.out.println("num is palindrome");
		}
	}
}
