package com.problems.strings;

import java.util.*;

/**
 * https://leetcode.com/problems/minimum-index-sum-of-two-lists/
 */
public class P7_FindRestaurant {
	public String[] findRestaurant(String[] list1, String[] list2) {

		Map<String, Integer> map1 = new HashMap<>();
		int minCommonIndex = Integer.MAX_VALUE;
		List<String> restaurants = new ArrayList<>();

		for (int i = 0; i < list1.length; i++) {
			map1.put(list1[i], i);
		}
		for (int i = 0; i < list2.length; i++) {
			if (map1.containsKey(list2[i])) {
				if (minCommonIndex > map1.get(list2[i]) + i) {
					minCommonIndex = map1.get(list2[i]) + i;
					restaurants.clear();
					restaurants.add(list2[i]);
				} else if (minCommonIndex == map1.get(list2[i]) + i) {
					restaurants.add(list2[i]);
				}
			}
		}
		String[] stringArray = restaurants.stream().toArray(String[]::new);
		return stringArray;
	}

	public static void main(String[] args) {
		String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
		String[] list2 = {"KFC", "Shogun", "Burger King"};
		String[] stringArray = new P7_FindRestaurant().findRestaurant(list1, list2);
		System.out.println("stringArray : " + Arrays.toString(stringArray));
	}
}
