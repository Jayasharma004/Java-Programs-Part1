package com.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  https://leetcode.com/problems/array-partition/description/
public class P31_ArrayPairSum {

	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		List<Integer> sumList = new ArrayList<>();
		int sum = 0;
		for(int i=0; i<nums.length; i=i+2)
		{
			System.out.println("Pairs : "+nums[i]+","+nums[i+1]+"");
			sum = sum + Math.min(nums[i],nums[i+1]);
		}
		return sum;
	}

	public static void main(String[] args) {
		int []nums = {-470, 66, -4835, -5623};
		int result = new P31_ArrayPairSum().arrayPairSum(nums);
		System.out.println("result : "+result);
	}
}
