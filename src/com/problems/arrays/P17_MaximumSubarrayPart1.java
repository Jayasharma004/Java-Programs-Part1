package com.problems.arrays;

/*
* https://leetcode.com/problems/maximum-average-subarray-i/
* */

public class P17_MaximumSubarrayPart1 {

	public double findMaxAverage(int[] nums, int k) {
		//4,2,1,3,3 | k=2
		double sum = 0;
		for (int j = 0; j < k; j++) {
			sum = sum + nums[j]; //6
		}
		double max_average = sum / k; // 6/2=3
		for (int i = 1; i + k <= nums.length; i++) {
			sum = sum - nums[i - 1] + nums[i + k - 1];
			System.out.println("sum : " + sum);
			max_average = Math.max((sum / k), max_average);
		}
		return max_average;
	}

	public double findMaxAverage_usingNestedForLoops(int[] nums, int k) {
		double max_average = Integer.MIN_VALUE;
		for (int i = 0; i + k <= nums.length; i++) {
			double sum = 0;
			for (int j = i; j < i + k; j++) {
				sum = sum + nums[j];
			}
			max_average = Math.max((sum / k), max_average);
		}
		return max_average;
	}


	public static void main(String[] args) {
		int[] nums = {4, 2, 1, 3, 3};
		int k = 2;
		double result = new P17_MaximumSubarrayPart1().findMaxAverage(nums, k);
		System.out.println("result : " + result);
	}
}
