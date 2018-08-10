package com.java.example;

import org.testng.annotations.Test;

public class PrintRangeOfNumbersWithOutLoop {

	//Write a Java Program to Print 1 To 10 Without Using Loop
	@Test
	public void method2() {
		
		printWithOutLoop(1);
	}
	
	public void printWithOutLoop(int n){
		
		if(n<=10){
			System.out.println(n);
			printWithOutLoop(n+1);
		}
	}
}
