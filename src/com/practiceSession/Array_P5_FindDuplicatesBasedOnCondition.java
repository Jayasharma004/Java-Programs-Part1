package com.practiceSession;


import java.util.HashMap;

//   https://leetcode.com/problems/contains-duplicate-ii/
public class Array_P5_FindDuplicatesBasedOnCondition {
	
	public static boolean containsNearbyDuplicate(int[] nums, int k)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++)
		{
			if (map.containsKey(nums[i]))
			{
				if (i - map.get(nums[i]) <= k)
				{
					return true;
				}
			}
			map.put(nums[i], i);
		}
		return false;
	}
	
	public static void main(String[] args) {
		//int[] nums = {1,0,1,1};
		int[] nums = {1,2,3,1,2,3};
		int k = 2;
		boolean isDifferenceCorrect = containsNearbyDuplicate(nums, k);
		System.out.println("Given condition of the difference is correct ? : " + isDifferenceCorrect);
	}
	
}
