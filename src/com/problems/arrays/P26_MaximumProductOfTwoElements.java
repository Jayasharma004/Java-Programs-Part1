package com.problems.arrays;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 */
public class P26_MaximumProductOfTwoElements {

	public int maxProduct(int[] nums) {
		Arrays.sort(nums);
		System.out.println("nums : "+Arrays.toString(nums));
		int result = (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
		System.out.println("result : "+result);
		return result;
	}

	public static void main(String[] args) {
		int []nums = {1,5,4,5};
		int result = new P26_MaximumProductOfTwoElements().maxProduct(nums);
		System.out.println("result : "+result);
	}
}
