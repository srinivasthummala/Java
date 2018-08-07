package com.function.example;

import java.util.function.Function;

import org.testng.annotations.Test;

public class FunctionExample {
	
	//Function interface same as Predicate interface except it return any type required by application needs 
	@Test
	public void getLengthOfString(){
		Function<String, Integer> f = s->s.length();
		System.out.println(f.apply("srinu"));
		System.out.println(f.apply("babu"));
	}

}
