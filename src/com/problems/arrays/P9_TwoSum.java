package com.problems.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P9_TwoSum {

	/**
	 * https://leetcode.com/problems/two-sum/
	 *
	 * @param nums
	 * @param target
	 * @return
	 */

	public int[] twoSum(int[] nums, int target) {
		int[] position = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target) {
					position[0] = i;
					position[1] = j;
				}
			}
		}
		return position;
	}

	public int[] twoSumByHashmap(int[] nums, int target) {
	//nums = [11,7,15,2,10], target = 9
		Map<Integer,Integer> map = new HashMap<>();
		int[] finalPositions = new int[2];
		for(int i=0;i< nums.length; i++)
		{
			if(map.containsKey(target-nums[i]))
			{
				finalPositions[0]=i;
				finalPositions[1]= map.get(target-nums[i]);
				break;
			}
			map.put(nums[i],i);
		}
		return finalPositions;
	}

	public static void main(String[] args) {
		int[] nums = {3, 3};
		int target = 6;
		int[] positionResult = new P9_TwoSum().twoSum(nums,target);
		//int[] positionResult = new P9_TwoSum().twoSumByHashmap(nums, target);
		System.out.println("positionResult : " + Arrays.toString(positionResult));
	}
}
