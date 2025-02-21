package com.Revision;

import java.util.Arrays;
import java.util.HashMap;

public class R7_ContainsDuplicate {

	public boolean containsDuplicate(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (Integer num : arr) {
			if (map.containsKey(num)) {
				return true;
			} else {
				map.put(num, 1);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 1};
		boolean result = new R7_ContainsDuplicate().containsDuplicate(arr);
		System.out.println("array " + Arrays.toString(arr) + " contains duplicate? " + result);
	}
}
