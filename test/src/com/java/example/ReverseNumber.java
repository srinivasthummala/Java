	package com.java.example;

import org.testng.annotations.Test;

public class ReverseNumber {

	@Test
	public void metod1(){
		
		int num = 12345;
		int revrse = 0;
		
		while(num!=0){
			revrse = (revrse*10)+(num%10);
			num = num/10;
		}
		System.out.println(revrse);
	}
}
