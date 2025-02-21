package com.problems.arrays;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximum-product-of-three-numbers/
 */
public class P27_MaximumProductOfThreeElements {

	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int product1 = nums[0] * nums[1] * nums[nums.length-1];
		int product2 = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
		int result = Math.max(product1,product2);
		return result;
	}


	public static void main(String[] args) {
		int []nums = {1,2,3};
		int result = new P27_MaximumProductOfThreeElements().maximumProduct(nums);
		System.out.println("result : "+result);
	}
}
