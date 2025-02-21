package com.Revision;

import java.util.Arrays;

// https://leetcode.com/problems/apply-operations-to-an-array/
public class R20_ApplyOperationsToAnArray {

	public int[] moveZeroesToLast(int [] nums)
	{
		System.out.println("nums before : "+Arrays.toString(nums));
		int swapPos = 0;
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] != 0)
			{
				nums[swapPos] = nums[i];
				swapPos++;
			}
		}
		
		for (int i = swapPos; i < nums.length; i++)
		{
			nums[i] = 0;
		}
		System.out.println("moveZeroesToLast : "+Arrays.toString(nums));
		return nums;
	}
	
	public int[] applyOperations(int[] nums) {
		for(int i=0; i<nums.length-1; i++)
		{
				if(nums[i] == nums[i + 1])
				{
					nums[i] = nums[i]*2;
					nums[i+1]=0;
				}
		}
		int []resultArray = moveZeroesToLast(nums);
		return resultArray;
	}
	
	public static void main(String[] args) {
		int []nums = {1,2,2,1,1,0};
		//int []nums = {0,1};
		int []resultArray = new R20_ApplyOperationsToAnArray().applyOperations(nums);
		System.out.println("resultArray : "+Arrays.toString(resultArray));
	}
}
