package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
	public static <T> void main(String[] args) {

		// creating list of student with different name and age
		List<Student> list = new ArrayList<>();
		Student s1 = new Student();
		s1.setAge(10);
		s1.setName("student 1");

		// second
		Student s2 = new Student();
		s2.setAge(20);
		s2.setName("student 2");
		
		// third
		Student s3 = new Student();
		s3.setAge(30);
		s3.setName("student 3");

		// fourth
		Student s4 = new Student();
		s4.setAge(40);
		s4.setName("student 4");

		// fifth
		Student s5 = new Student();
		s5.setAge(50);
		s5.setName("student 5");

		list.add(s2);
		list.add(s1);
		list.add(s4);
		list.add(s3);
		list.add(s5);

		System.out.println("Printing before sorting the list");
		list.forEach(s -> System.out.println(s));

		// sorting the list
		Collections.sort(list);
		System.out.println();

		System.out.println("Printing after sorting the list");
		list.forEach(s -> System.out.println(s));

	}

}
