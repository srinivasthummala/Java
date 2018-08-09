package com.java.example.string;

import org.testng.annotations.Test;

public class StringRotaionCheck {

	// Check Whether One String Is Rotation Of Another?
	@Test
	public void method1() {

		String s1 = "JavaJ2eeStrutsHibernate";
		String s2 = "StrutsHibernateJavaJ2ee";

		if (s1.length() == s2.length()) {
			String s3 = s1 + s2;
			if (s3.contains(s2)) {
				System.out.println("s2 is a rotated version of s1");
			} else {
				System.out.println("s2 is not rotated version of s1");
			}
		} else {
			System.out.println("s2 is not rotated version of s1");
		}
	}
}
