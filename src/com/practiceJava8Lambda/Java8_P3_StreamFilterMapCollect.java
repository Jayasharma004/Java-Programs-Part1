package com.practiceJava8Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_P3_StreamFilterMapCollect {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Aakash");
		List<String> result = names.stream()
				                      .filter(name -> name.startsWith("A"))
				                      .map(String::toUpperCase)
				                      .sorted()
				                      .collect(Collectors.toList());
		System.out.println(result); // Output: [ALICE]
	}
	
}
