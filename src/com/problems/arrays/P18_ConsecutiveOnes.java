package com.problems.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*
https://leetcode.com/problems/max-consecutive-ones/
 */
public class P18_ConsecutiveOnes {

	public int findMaxConsecutiveOnes(int[] nums) {
		int result = 0;
		int countOfOne = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				countOfOne++;
			}
			if (nums[i] != 1) {
				result = Math.max(result, countOfOne);
				countOfOne = 0;
			}
		}
		result = Math.max(result, countOfOne);
		return result;
	}

	public static void main(String[] args) {
		int[] nums = {1, 1, 0, 1, 1, 1};
		int result = new P18_ConsecutiveOnes().findMaxConsecutiveOnes(nums);
		System.out.println("result : " + result);
	}
}
