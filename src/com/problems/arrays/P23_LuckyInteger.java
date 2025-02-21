package com.problems.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/find-lucky-integer-in-an-array/
 */

public class P23_LuckyInteger {

	public int findLucky(int[] arr) {
		Map<Integer,Integer> map = new HashMap<>();
		int count = 0;
		for(int i=0; i< arr.length; i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i],map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i],1);
			}
		}
		System.out.println("map : "+map);
		int luckyNum = -1;
		for (int key : map.keySet())
		{
			if(key == map.get(key)) {
				luckyNum = Math.max(luckyNum, key);
			}
		}
		if(luckyNum!= -1)
			return luckyNum;
		else
			return -1;
	}

	public static void main(String[] args) {
		int []arr = {1,2,2,3,3,3};
		int result = new P23_LuckyInteger().findLucky(arr);
		System.out.println("result : "+result);
	}
}
