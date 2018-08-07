package com.mypackage;

public class Programs {

	public static void main(String[] args) {
		
		System.out.println("Hi");
		Programs p = null;
		p.test();
		
		p.testReturn();
	}

	public static void test() {
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 10; j++) {
				if (i == j) {
					break;
				}
				System.out.println("after if brok : " + i + " and " + j);
			}
		}
		System.out.println("after for loop");
	}
	
	public static void testReturn() {
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 10; j++) {
				if (i > j) {
					return;
				}
				System.out.println("after if brok : " + i + "and" + j);
			}
		}
		System.out.println("after for loop");
	}
}