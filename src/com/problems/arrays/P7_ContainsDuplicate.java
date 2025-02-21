package com.problems.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P7_ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer num : nums) {
			if (map.containsKey(num)) {
				return true;
			} else {
				map.put(num, 1);
			}
		}
		return false;
	}


	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1};
		boolean result = new P7_ContainsDuplicate().containsDuplicate(arr);
		System.out.println("array " + Arrays.toString(arr) + " contains duplicate? " + result);
	}
}
