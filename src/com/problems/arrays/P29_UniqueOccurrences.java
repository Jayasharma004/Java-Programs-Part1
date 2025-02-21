package com.problems.arrays;

import java.util.*;

/**
 * https://leetcode.com/problems/unique-number-of-occurrences/description/
 */

public class P29_UniqueOccurrences {

	public boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++)
		{
			if (map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i]) + 1);
			} else
			{
				map.put(arr[i], 1);
			}
		}
		Set<Integer> set = new HashSet<>();
		for(int key : map.keySet())
		{
			if(!set.contains(map.get(key)))
			{
				set.add(map.get(key));
			}
			else
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int [] arr = {1,2};
		boolean result = new P29_UniqueOccurrences().uniqueOccurrences(arr);
		System.out.println("result : "+result);
	}
}
