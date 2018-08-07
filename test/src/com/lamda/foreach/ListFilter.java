package com.lamda.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class ListFilter {

	// @Test
	public void java8() {

		List<String> names = Arrays.asList("srinu", "thummala", "vasu");
		List<String> namesAfterFilter = getNamesList(names, "vasu");
		System.out.println(namesAfterFilter);

		System.out.println("****************** java8 *****************");
		names.stream().filter(s -> !s.equals("vasu")).forEach(System.out::println);

		System.out.println("****************** java8 *****************");
		List<String> result = names.stream().filter(s -> !s.equals("vasu")).collect(Collectors.toList());
		result.forEach(System.out::println);
	}

	public static List<String> getNamesList(List<String> list, String filter) {
		List<String> filterList = new ArrayList<String>();
		for (String s : list) {
			if (!s.equals(filter)) {
				filterList.add(s);
			}
		}
		return filterList;
	}

	//@Test
	public void classAsList() {
		List<Person> persons = Arrays.asList(new Person(31, "srinu"), new Person(26, "thummala"),
				new Person(29, "babu"), new Person(29, "srinu"));
		System.out.println("persons : " + persons);

		Person p1 = persons.stream().filter(x -> x.getName().equals("srinu")).findAny().orElse(null);
		System.out.println(p1);

		Person p2 = persons.stream().filter(x -> x.getName().equals("srinu") && x.getAge() == 31).findAny()
				.orElse(null);
		System.out.println(p2);

		// or like this
		Person result = persons.stream().filter(p -> {
			if ("babu".equals(p.getName()) && 29 == p.getAge()) {
				return true;
			}
			return false;
		}).findAny().orElse(null);
		System.out.println("result :" + result);

		String name = persons.stream().filter(x -> x.getName().equals("srinu")).map(Person::getName).findAny()
				.orElse(null);
		System.out.println("name : " + name);

		List<Person> collect = persons.stream().filter(x -> x.getName().equals("srinu")).collect(Collectors.toList());
		collect.forEach(p -> System.out.println(p.getName()+" and "+p.getAge()));
		collect.forEach(System.out::println);
	}
	
	@Test
	public void listToUpperCase(){
		 List<String> alpha = Arrays.asList("a", "b", "c", "d");
		 List<String> collect = alpha.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		 System.out.println(collect);
		 
		 List<String> collect1 = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
		 System.out.println(collect1);
		 
		// Extra, streams apply to any data type.
	        List<Integer> num = Arrays.asList(1,2,3,4,5);
	        List<Integer> collect2 = num.stream().map(n -> n * 2).collect(Collectors.toList());
	        System.out.println(collect2); //[2, 4, 6, 8, 10]
	}

}
