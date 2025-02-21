package com.problems.arrays;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
 */
public class P28_MaxProductDifference {
	public int maxProductDifference(int[] nums) {
		Arrays.sort(nums); //nlog(n)
		System.out.println(Arrays.toString(nums));
		int product1 = nums[0]*nums[1];
		int product2 = nums[nums.length-1]*nums[nums.length-2];
		int result = product2-product1;
		return result;
	}

	public static void main(String[] args) {
		int []nums = {4,2,5,9,7,4,8};
		int result = new P28_MaxProductDifference().maxProductDifference(nums);
		System.out.println("result : "+result);
	}
}
