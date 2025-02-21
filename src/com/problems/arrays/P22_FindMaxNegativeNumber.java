package com.problems.arrays;

import java.util.*;

//wrong solution
public class P22_FindMaxNegativeNumber {
	public int findMaxK(int[] nums) {
		int max_num = 0;

		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		list.add(0,1);
		list.set(2,2);

		for (int i = 0; i < nums.length; i++)
		{
			set.add(nums[i]);
		}

		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] < 0)
			{
				continue;
			}
			int negative = -nums[i];
			if (set.contains(negative))
			{
				max_num = Math.max(max_num, nums[i]);
			}
		}
		if (max_num == 0) {
			return -1;
		}
		return max_num;
	}

	public static void main(String[] args) {
		int[] nums = {-10, 8, 6, 3, 7, -2, -3, -7};
		int resultNum = new P22_FindMaxNegativeNumber().findMaxK(nums);
		System.out.println("resultNum : " + resultNum);
	}
}
