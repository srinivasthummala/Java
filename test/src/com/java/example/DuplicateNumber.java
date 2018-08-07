package com.java.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class DuplicateNumber {

	// Program: Find out duplicate number between 1 to N numbers.

	// @Test
	public void method1() {

		List<Integer> numbers = new ArrayList<>();
		for (int i = 1; i < 20; i++) {
			numbers.add(i);
		}
		numbers.add(12);

		System.out.println(findDuplicateNumber(numbers));

	}

	public int findDuplicateNumber(List<Integer> numbers) {

		int highestNumber = numbers.size() - 1;
		int total = getSum(numbers);
		int duplicate = total - (highestNumber * (highestNumber + 1) / 2);
		return duplicate;
	}

	public int getSum(List<Integer> numbers) {

		int total = 0;
		for (int n : numbers) {
			total += n;
		}
		return total;
	}

	// Program: Find out duplicate numbers present in a given array.
	// @Test
	public void method2() {

		int[] numbers = { 1, 3, 5, 7, 3, 2, 5, 7, 8, 4, 6, 2, 1, 7 };
		Set<Integer> unique = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();

		for (int num : numbers)
			(unique.contains(num) ? duplicate : unique).add(num);
		System.out.println("unique : " + unique);
		System.out.println("duplicate : " + duplicate);
	}

	// Program: Find out duplicate numbers present in a given array.
	// @Test
	public void method3() {

		Integer[] numbersList = new Integer[] { 1, 2, 1, 2, 1, 3 };
		List<Integer> listInteger = Arrays.asList(numbersList);
		listInteger.stream().filter(i -> Collections.frequency(listInteger, i) > 1).collect(Collectors.toSet())
				.forEach(System.out::println);
	}

	// Program: Find out duplicate numbers present in a given array.
	// @Test
	public void method4() {

		int[] numbers = { 1, 3, 5, 7, 3, 2, 5, 7, 8, 4, 6, 2, 1, 7 };

		Set<Integer> duplicate = new HashSet<>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j] && i != j) {
					duplicate.add(numbers[i]);
				}
			}
		}
		System.out.println(duplicate);
	}

	// Program: Find out duplicate numbers present in a given array.
	// @Test
	public void method5() {

		int[] numbers = { 1, 3, 5, 7, 3, 2, 5, 7, 8, 4, 6, 2, 1, 7 };

		Set<Integer> duplicate = new HashSet<>();
		for (int num : numbers) {
			if (!duplicate.add(num)) {
				System.out.print(num + " ");
			}
		}
	}

	// Program: Find out duplicate numbers present in a given array.
	// @Test
	public void method6() {

		int[] numbers = { 1, 3, 5, 7, 3, 2, 5, 7, 8, 4, 6, 2, 1, 7 };

		Arrays.sort(numbers);
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] == numbers[i - 1]) {
				System.out.println("Duplicate: " + numbers[i]);
			}
		}
	}

	// Program: Find out duplicate numbers present in a given array.
	//@Test
	public void method7() {

		int[] numbers = { 1, 3, 5, 7, 3, 2, 5, 7, 8, 4, 5, 6, 2, 1, 7, 7 };

		Map<Integer, Integer> unique = new HashMap<>();

		for (int i = 0; i < numbers.length; i++) {
			if (unique.containsKey(numbers[i])) {
				int count = unique.get(numbers[i]);
				unique.put(numbers[i], count + 1);
			} else {
				unique.put(numbers[i], 1);
			}
		}

		for (Map.Entry<Integer, Integer> num : unique.entrySet()) {
			if (num.getValue() > 1) {
				System.out.println("duplicate : key - " + num.getKey() + ", value : " + num.getValue());
			}
		}
		System.out.println(unique);
	}

	// Program: Find out duplicate numbers present in a given array.
	@Test
	public void method8() {

		Integer[] numbers = { 1, 3, 5, 7, 3, 2, 5, 7, 8, 4, 6, 2, 1, 7 };

		List<Integer> items = Arrays.asList(numbers);

        Map<Integer, Long> result = items.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
	}
}
