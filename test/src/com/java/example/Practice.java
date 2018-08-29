package com.java.example;

public class Practice {

	// @Test
	public void test1() {
		int sum = 0;
		for (int i = 0, j = 0; i < 5 & j < 5; ++i, j = i + 1)
			sum += i;
		System.out.println(sum);
	}

	// @Test
	public void test2() {
		int x = 2;
		int y = 0;
		for (; y < 10; ++y) {
			if (y % x == 0)
				continue;
			else if (y == 8)
				break;
			else
				System.out.print(y + " ");
		}
	}

	//@Test
	public void test3() {

		final int a = 10;
		int b = a;
		System.out.println(b + 10);
		System.out.println(a);

		int y = 0;
		for (; y < 10; ++y) {
			if (y == 8)
				break;
			else
				System.out.print(y + " ");
		}
		StringBuffer s1 = new StringBuffer("Hello");
		s1.insert(1, "Java");
		System.out.println(s1);
	}

	

}
