package com.problems.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
 */
public class P19_CheckIfExists {

	public boolean checkIfExist(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i< arr.length; i++)
		{
			if(arr[i] == 0 && map.containsKey(arr[i]))
			{
				return true;
			}
			if(!map.containsKey(arr[i]))  {
				map.put(arr[i], i);
			}
		}
		System.out.println("map : "+map);
		for(Integer num : map.keySet())
		{
			if(map.containsKey(2*num))
			{
				int i = map.get(2*num);
				System.out.println("i : "+i);
				int j = map.get(num);
				System.out.println("j : "+j);
				if((i!=j) && (0<=i) && (j<arr.length) )
				{
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int []arr = {0,0};
		boolean ifexists = new P19_CheckIfExists().checkIfExist(arr);
		System.out.println("ifexists : "+ifexists);
	}
}
