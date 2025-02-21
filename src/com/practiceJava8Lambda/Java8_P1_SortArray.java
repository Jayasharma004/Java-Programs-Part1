package com.practiceJava8Lambda;

import java.util.Arrays;

public class Java8_P1_SortArray {
	
	public static void main(String[] args) {
		String[] names = {"John", "Alice", "Bob"};
		Arrays.sort(names, String::compareToIgnoreCase);
		Arrays.stream(names).forEach(System.out::println);
	}
}
