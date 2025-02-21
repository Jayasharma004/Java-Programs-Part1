package com.Revision;


import java.util.Arrays;

// https://leetcode.com/problems/sort-even-and-odd-indices-independently/description/
public class R16_SortEvenOddIndices {
	public int[] sortEvenOdd(int[] nums) {
		for(int i=0; i<nums.length; i++)
		{
			for (int j = 0; j < i; j++)
			{
				if (i % 2 == 0 && j % 2 == 0)
				{
					if (nums[i] < nums[j]) {
						int temp = nums[i];
						nums[i] = nums[j];
						nums[j] = temp;
					}
				}
				
				if (i % 2 != 0 && j % 2 != 0)
				{
					if (nums[i] > nums[j])
					{
						int temp = nums[i];
						nums[i] = nums[j];
						nums[j] = temp;
					}
				}
			}
		}
		return nums;
	}
	
	public static void main(String[] args) {
//		int []nums = {4,1,2,3};
		int []nums = {2,1};
		int []result = new R16_SortEvenOddIndices().sortEvenOdd(nums);
		System.out.println("result nums : "+ Arrays.toString(result));
	}

}
