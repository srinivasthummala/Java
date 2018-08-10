package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

/**
 * @author Srinivas.Thummala
 *
 */
public class MapCollectionExample {

	//Sorting map based on student name using Lambdas
	// @Test
	public void method1() {

		System.out.println("method 1 : Result");
		Map<Student, Integer> student = new HashMap<>();
		Student s1 = new Student("srinu", 18, "india");
		Student s2 = new Student("john", 78, "usa");
		Student s3 = new Student("boss", 98, "canada");
		Student s4 = new Student("jing", 48, "dubai");

		student.put(s1, 1);
		student.put(s2, 2);
		student.put(s3, 3);
		student.put(s4, 4);

		System.out.println(student);

		Set<Student> keySet = student.keySet();
		ArrayList<Student> arrayList = new ArrayList<>(keySet);
		arrayList.sort((Student s01, Student s02) -> s01.getName().compareTo(s02.getName()));
		System.out.println(arrayList);
	}

	//Sorting map based on student name using java comparator 
	// @Test
	public void method2() {

		System.out.println("method 2 : Result");
		Map<Student, Integer> student = new HashMap<>();
		Student s1 = new Student("srinu", 18, "india");
		Student s2 = new Student("john", 78, "usa");
		Student s3 = new Student("boss", 98, "canada");
		Student s4 = new Student("jing", 48, "dubai");

		student.put(s1, 1);
		student.put(s2, 2);
		student.put(s3, 3);
		student.put(s4, 4);
		System.out.println(student);

		Set<Entry<Student, Integer>> entrySet = student.entrySet();
		ArrayList<Entry<Student, Integer>> arrayList = new ArrayList<>(entrySet);
		Comparator<Entry<Student, Integer>> com = new Comparator<Entry<Student, Integer>>() {

			@Override
			public int compare(Entry<Student, Integer> o1, Entry<Student, Integer> o2) {
				return o1.getKey().getName().compareTo(o2.getKey().getName());
			}

		};
		Collections.sort(arrayList, com);
		// arrayList.sort(com);
		arrayList.forEach(System.out::println);
	}

	//Sorting map based on student country
	// @Test
	public void method3() {

		System.out.println("method 3 : Result");
		Map<Student, Integer> student = new HashMap<>();
		Student s1 = new Student("srinu", 18, "india");
		Student s2 = new Student("john", 78, "usa");
		Student s3 = new Student("boss", 98, "canada");
		Student s4 = new Student("jing", 48, "dubai");

		student.put(s1, 1);
		student.put(s2, 2);
		student.put(s3, 3);
		student.put(s4, 4);
		System.out.println(student);
		Set<Entry<Student, Integer>> entrySet = student.entrySet();
		ArrayList<Entry<Student, Integer>> arrayList1 = new ArrayList<>(entrySet);

		arrayList1.sort((Entry<Student, Integer> e1, Entry<Student, Integer> e2) -> e1.getKey().getCountry()
				.compareTo(e2.getKey().getCountry()));

		for (Entry<Student, Integer> entry : arrayList1) {
			System.out.println(entry);
		}

		student.forEach((k, v) -> System.out.println("student : " + k + " value : " + v));
	}

	@Test
	public void method4() {

		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();

		map1.put('s', 10);
		map1.put('b', 11);
		map1.put('a', 12);
		map1.put('t', 13);
		map1.put('e', 14);

		map2.put('s', 15);
		map2.put('b', 16);
		map2.put('d', 17);
		map2.put('e', 18);
		map2.put('f', 14);
		map2.put('g', 13);

		System.out.println(map1.equals(map2));

		map1.remove('s', 10);
		System.out.println(map1);

		map1.putAll(map2);
		System.out.println(map1);
	}

	//@Test
	public void method5() {
		
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();

		map1.put('s', 10);
		map1.put('b', 11);
		map1.put('a', 12);
		map1.put('t', 13);
		map1.put('e', 14);

		map2.put('s', 15);
		map2.put('b', 16);
		map2.put('d', 17);
		map2.put('e', 18);
		map2.put('f', 14);
		map2.put('g', 13);
		
		map1.putAll(map2);
		
		Set<Character> keySet = map1.keySet();
		Iterator<Character> iterator = keySet.iterator();
		
		while(iterator.hasNext()){
			System.out.println(map1.get(iterator.next()));
		}
		
	}

	@Test
	public void method6() {
		Map<Character, Integer> map1 = new HashMap<>();

		map1.put('s', 10);
		map1.put('b', 11);
		map1.put('a', 12);
		map1.put('t', 13);
		map1.put('e', 14);
		map1.put('s', 15);
		map1.put('b', 16);
		map1.put('d', 17);
		map1.put('e', 18);
		map1.put('f', 14);
		map1.put('g', 13);
		
		
		Set<Entry<Character, Integer>> entrySet = map1.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println("key : "+entry.getKey() + " value : "+entry.getValue());
		}
	}

	@Test
	public void method7() {

	}
}
