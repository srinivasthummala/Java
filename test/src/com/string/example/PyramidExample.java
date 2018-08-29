package com.string.example;

import java.util.Collections;

import org.testng.annotations.Test;

public class PyramidExample {

	// Full Pyramid using java8
	@Test
	public void method1() {

		for (int i = 0; i < 5; i++) {
			System.out.println(String.join("", Collections.nCopies(5 - i - 1, " "))
					+ String.join("", Collections.nCopies(2 * i + 1, "*")));
		}
	}

	// Inverted Pyramid using java8
	@Test
	public void method2() {

		for (int i = 5; i > 0; i--) {
			System.out.println(String.join("", Collections.nCopies(5 - i, " "))
					+ String.join("", Collections.nCopies(2 * i - 1, "*")));
		}
	}

	// Full Pyramid using java7
	@Test
	public void method3() {

		int row = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
