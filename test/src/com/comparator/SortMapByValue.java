package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class SortMapByValue {

	// Program: Write a program to sort a map by value.
	@Test
	public void method1() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("java", 20);
		map.put("C++", 45);
		map.put("Java2Novice", 2);
		map.put("Unix", 67);
		map.put("MAC", 26);
		map.put("Why this kolavari", 93);
		Set<Entry<String, Integer>> set = map.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		System.out.println(list);
		
		Comparator<Entry<String, Integer>> valueComparator = (Entry<String, Integer> o1,
				Entry<String, Integer> o2) -> o1.getValue().compareTo(o2.getValue());
		Collections.sort(list, valueComparator);
		System.out.println(list);
	}

}
