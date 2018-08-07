package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Person> person = new ArrayList<>();

		Person p1 = new Person();
		p1.setAge(40);
		p1.setName("srinu");

		Person p2 = new Person();
		p2.setAge(30);
		p2.setName("thummala");

		Person p3 = new Person();
		p3.setAge(25);
		p3.setName("babu");

		person.add(p1);
		person.add(p2);
		person.add(p3);

		// Collections.sort(person, new NameComparator());
		Collections.sort(person, new AgeComparator());
		person.forEach(s -> System.out.println(s));

		// comparator with Anonymous class
		Comparator<Person> ageComparator = new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o1.getAge() - o2.getAge();
			}

		};
		System.out.println("comparator with Anonymous class");
		Collections.sort(person, ageComparator);
		person.forEach(System.out::println);

		// comparator with lambda expression
		Comparator<Person> nameComparator = (Person o1, Person o2) -> o1.getName().compareTo(o2.getName());
		Collections.sort(person, nameComparator);
		System.out.println("comparator with lambda expression");
		person.forEach(System.out::println);
		
		// comparator with lambda expression new
		person.sort((Person o1, Person o2) -> o1.getName().compareTo(o2.getName()));
		System.out.println("comparator with lambda expression new");
		person.forEach(System.out::println);
	}

}
