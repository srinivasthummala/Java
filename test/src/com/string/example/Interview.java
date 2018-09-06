package com.string.example;

import org.testng.annotations.Test;

public class Interview {

	@Test
	public void method1() {
		String str = "ABC";
		System.out.println(str.equals("ABC"));
		str = null;

		// string comparing with null then reurns false
		System.out.println("ABC".equals(str));

		// null comparing with string then reurns null pointer exception
		System.out.println(str.equals("ABC"));

	}
}
