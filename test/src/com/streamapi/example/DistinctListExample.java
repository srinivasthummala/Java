package com.streamapi.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctListExample {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10,10,12,12,34,24,23,34,56,55);
		System.out.println(nums);
		List<Integer> collect = nums.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
	}
}
