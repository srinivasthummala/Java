package com.streamapi.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class StreamCollectExample {

	List<String> listOfString = Arrays.asList("Java", "C", "C++", "Go", "JavaScript", "Python", "Scala");

	@Test
	public void toList() {
		List<String> list = listOfString.stream().filter(s -> s.contains("J")).collect(Collectors.toList());
		System.out.println("toList : " + list);
	}

	@Test
	public void toSet() {
		Set<String> set = listOfString.stream().filter(s -> s.startsWith("C")).collect(Collectors.toSet());
		System.out.println("toSet : " + set);
	}

	@Test
	public void toMap() {
		Map<String, Integer> map = listOfString.stream().collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println("toMap : " + map);
	}

	// to convert Stream to any collection
	// A class constructor reference (ClassName::new) like ArrayList::new
	@Test
	public void toCollection() {
		ArrayList<String> arrayList = listOfString.stream().filter(s -> s.length() > 2)
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println("toColletion : " + arrayList);
	}

}
