package com.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
https://leetcode.com/problems/running-sum-of-1d-array/description/
 */

public class P20_RunningSum {

	public int[] runningSum(int[] nums) {
		List<Integer> resultArray = new ArrayList<>();
		int sum = nums[0];
		resultArray.add(sum);
		for( int i=1; i< nums.length; i++ )
		{
			sum = sum + nums[i];
			resultArray.add(sum);
		}
		System.out.println("resultArray : "+resultArray);
		int[] finalArray = resultArray.stream()
				.mapToInt(Integer::intValue)
				.toArray();
		return finalArray;
	}

	public static void main(String[] args) {
		int []nums = {3,1,2,10,1};
		new P20_RunningSum().runningSum(nums);
	}
}
