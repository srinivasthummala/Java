package com.java.example.string;

import org.testng.annotations.Test;

public class StringSwap {

	//Program : Swap two Strings using third user defined variable in Java
	@Test
	public void method1(){
		
		String s1 = "srinu";
		String s2 = "thummala";
		String s3=null;
		
		s3=s1;
		s1=s2;
		s2=s3;
		System.out.println(s1 +" "+ s2);
	}
	
	//Program : Swap two Strings without using third user defined variable in Java
	@Test
	public void method2(){
		
		String s1 = "srinu";
		String s2 = "thummala";
		
		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		System.out.println(s1 +" "+ s2);
	}
}
