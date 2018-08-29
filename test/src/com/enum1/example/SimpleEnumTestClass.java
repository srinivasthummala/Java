package com.enum1.example;

public class SimpleEnumTestClass {

	public static void main(String[] args) {
		
		SimpleEnum num = SimpleEnum.FIVE;
		System.out.println(num);
		
		num = SimpleEnum.SIX;
		System.out.println(num);
		
		num = SimpleEnum.TEN;
		System.out.println(num);
		
		num = SimpleEnum.FOUR;
		System.out.println(num);
		
		num = SimpleEnum.NINE;
		System.out.println(num);
		
		Day day = Day.MONDAY;
		System.out.println(day);
	}
	
	public enum Day{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	}
}
