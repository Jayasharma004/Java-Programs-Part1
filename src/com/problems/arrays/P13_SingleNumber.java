package com.problems.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/single-number/
 */
public class P13_SingleNumber {

	public int singleNumber(int[] nums) {
		Map<Integer,Integer> map = new HashMap<>();
		int result=0;
		for(int i=0; i<nums.length; i++)
		{
			if(map.containsKey(nums[i]))
			{
				map.put(nums[i], map.get(nums[i])+1);
			}
			else
			{
				map.put(nums[i], 1);
			}
		}
		for(int n : map.keySet())
		{
			if(map.get(n)==1)
			{
				result=n;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		int result = new P13_SingleNumber().singleNumber(nums);
		System.out.println("result : "+result);
	}
}
