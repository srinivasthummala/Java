package com.function.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.testng.annotations.Test;

public class FunctionExample {

	// Function interface same as Predicate interface except it return any type
	// required by application needs
	@Test
	public void getLengthOfString() {
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("srinu"));
		System.out.println(f.apply("babu"));
	}

	@Test
	public void method() {
		Map<String, Integer> salaries = new HashMap<>();
		salaries.put("John", 40000);
		salaries.put("Freddy", 30000);
		salaries.put("Samuel", 50000);
		System.out.println(salaries);

		salaries.replaceAll((name, oldValue) -> name.equals("Freddy") ? oldValue : oldValue + 10000);
		System.out.println(salaries);
	}
	
	@Test
	public void method2() {
		
		Map<String, Integer> nameMap = new HashMap<>();
		Integer value = nameMap.computeIfAbsent("John", s -> s.length());
		System.out.println(nameMap);
	}

}
