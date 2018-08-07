package com.lamda.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachExample {
	public static void main(String[] args) {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		System.out.println("*******************map iteration******************");
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}

		System.out.println("*******************map iteration with lambda expression******************");
		items.forEach((k, v) -> System.out.println("key : " + k + " value : " + v));

		System.out.println("*******************map iteration with lambda expression******************");
		items.forEach((k, v) -> {
			System.out.println("key : " + k + " value : " + v);
			if ("E".equals(k)) {
				System.out.println("Hello E ");
				System.out.println("value : " + v);
			}
		});

		System.out.println("*******************list iteration******************");
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		for (String item : list) {
			System.out.println(item);
		}

		System.out.println("*******************list iteration with lambda expression******************");
		list.forEach(s -> System.out.println(s));

		System.out.println("*******************list iteration with lambda expression******************");
		list.forEach(System.out::println);

		System.out.println("*******************list iteration with lambda expression return C******************");
		list.forEach(item -> {
			if ("C".equals(item)) {
				System.out.println(item);
			}
		});

		System.out.println("*******************list iteration with lambda expression return B******************");
		list.stream().filter(s -> s.contains("B")).forEach(System.out::println);
	}

}
