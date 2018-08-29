package com.collectors.grouping.by;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class GroupingBy {

	// @Test
	public void goupingBy() {
		// 3 apple, 2 banana, others 1
		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");

		Map<String, Long> result = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(result);

	}

	@Test
	public void goupingBy1() {

		// 3 apple, 2 banana, others 1
		List<Item> items = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 20, new BigDecimal("19.99")), new Item("orang", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")), new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")), new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 20, new BigDecimal("9.99")));

		Map<String, Long> counting = items.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.counting()));

		System.out.println(counting);

		Map<String, Integer> sum = items.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));

		System.out.println(sum);

		// group by price
		Map<BigDecimal, List<Item>> groupByPriceMap = items.stream().collect(Collectors.groupingBy(Item::getPrice));

		System.out.println(groupByPriceMap);

		// group by price, uses 'mapping' to convert List<Item> to Set<String>
		Map<BigDecimal, Set<String>> result = items.stream()
				.collect(Collectors.groupingBy(Item::getPrice, Collectors.mapping(Item::getName, Collectors.toSet())));

		System.out.println(result);

	}
}
