package com.streamapi.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class StreamExample {

	@Test
	public void testStreamFilter() {

		List<Integer> l1 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			l1.add(i);
		}
		System.out.println(l1);

		List<Integer> l2 = new ArrayList<>();
		for (Integer i : l1) {
			if (i % 2 == 0) {
				l2.add(i);
			}
		}
		System.out.println(l2);

		List<Integer> l3 = l1.stream().filter(i -> (i % 2 == 0)).collect(Collectors.toList());
		System.out.println(l3);

		long count = l1.stream().filter(i -> (i % 2 == 0)).count();
		System.out.println("list count for even number : " + count);

	}

	@Test
	public void testStreamMap() {

		List<String> l1 = new ArrayList<>();
		l1.add("january");
		l1.add("february");
		l1.add("march");
		System.out.println(l1);

		List<String> l2 = l1.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);

	}

	@Test
	public void testStreamSorted() {

		List<String> l1 = new ArrayList<>();
		l1.add("january");
		l1.add("february");
		l1.add("march");
		System.out.println(l1);

		List<String> l2 = l1.stream().sorted().collect(Collectors.toList());
		System.out.println(l2);

		Comparator<String> s = (s1, s2) -> s1.compareTo(s2);
		List<String> l3 = l1.stream().sorted(s).collect(Collectors.toList());
		System.out.println(l3);

		Comparator<String> ss = (s1, s2) -> s2.compareTo(s1);
		List<String> l4 = l1.stream().sorted(ss).collect(Collectors.toList());
		System.out.println(l4);

	}

	@Test
	public void streamMax() {

		List<Integer> l1 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			l1.add(i);
		}
		System.out.println(l1);

		Comparator<Integer> c = (i1, i2) -> i1.compareTo(i2);
		Integer max = l1.stream().max(c).get();
		System.out.println(max);

		Integer min = l1.stream().min(c).get();
		System.out.println(min);

	}
	
	@Test
	public void streamForEach() {

		List<Integer> l1 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			l1.add(i);
		}
		System.out.println(l1);

		l1.stream().forEach(i->System.out.println(i));

		
	}
}
