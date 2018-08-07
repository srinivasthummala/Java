package com.predicate.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.testng.annotations.Test;

public class PredicateExample {
	
	//Predicate is a functional interface accepts one argument and returns boolean value
	@Test
	public void greaterThanValue(){
		Predicate<Integer> p = i -> (i>20);
		System.out.println(p.test(5));
		System.out.println(p.test(25));
		System.out.println(p.test(15));

	}
	
	@Test
	public void lengthOfString(){
		Predicate<String> p = s->(s.length()>5);
		System.out.println(p.test("srinu1"));
		System.out.println(p.test("babu"));
		System.out.println(p.test("hello"));

	}
	
	@Test
	public static void predicateJoins(){
		
		int [] x = {1, 3, 5, 6, 2, 8, 20, 43, 11, 26,45, 54, 70, 33};
		Predicate<Integer> p = i->(i>10);
		Predicate<Integer> evenNumbers = i->(i%2==0);
		
		System.out.println("greater than 10: ");
		method1(p, x);
		
		System.out.println("less than 10: ");
		method1(p.negate(), x);
		
		System.out.println("even numbers : ");
		method1(evenNumbers, x);
		
		System.out.println("odd numbers : ");
		method1(evenNumbers.negate(), x);
		
		System.out.println("greater than 10 and even numbers");
		method1(p.and(evenNumbers), x);
		
		System.out.println("greater than 10 and odd numbers");
		method1(p.and(evenNumbers.negate()), x);
		
		System.out.println("greater than 10 or even numbers");
		method1(p.or(evenNumbers), x);
		
		
		

	}
	
	public static void method1(Predicate<Integer> p, int[] x){
		for(int value : x){
			if(p.test(value)){
				System.out.println(value);
			}
		}
	}

	@Test(enabled = false)
	public void listLamdaExample() {

		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(23);
		numbers.add(12);
		numbers.add(16);
		numbers.add(13);
		numbers.add(18);
		numbers.add(38);
		numbers.add(68);

		Predicate<Integer> p = n -> (n > 20);
		Predicate<Integer> p1 = n -> (n < 50);

		System.out.println("*******************predicate negate output(number <20)******************");

		numbers.stream().filter(p.negate()).forEach(System.out::println);

		System.out.println("*******************predicate output (number>20)*************************");

		numbers.stream().filter(p).forEach(System.out::println);

		System.out.println("*******************loop output using for each*************************");

		numbers.forEach(n -> System.out.println(n));

		System.out.println("*******************predicate output (number>20) and (number <50)*************************");

		numbers.stream().filter(p.and(p1)).forEach(System.out::println);

		System.out.println("*******************predicate output (number>20) or (number <50)*************************");
		
		numbers.stream().filter(p.or(p1)).forEach(System.out::println);
		

	}


}
