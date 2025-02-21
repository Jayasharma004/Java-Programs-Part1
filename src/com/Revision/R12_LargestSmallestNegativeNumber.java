package com.Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class R12_LargestSmallestNegativeNumber {
	public int largestNegativeNumberUsingSorting(int[] nums)
	{
		Arrays.sort(nums);
		System.out.println("sorted array : "+Arrays.toString(nums));
		int largestNegativeNumber = 0;
		if(nums.length==1 && nums[0]>=0)
		{
			return -1;
		}
		if(nums.length==1 && nums[0]<0)
		{
			return nums[0];
		}
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i] >= 0)
			{
				largestNegativeNumber = nums[i-1];
				break;
			}
		}
		return largestNegativeNumber;
	}
	public int largestNegativeNumber(int[] nums)
	{
		int result = 0;
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i]<0)
			{
				if (result == 0 || nums[i] > result) {
					result = nums[i];
					System.out.println("result : "+result);
				}
			}
		}
		return result;
	}

	public int smallestNegativeNumber(int[] nums)
	{
		int result = 0;
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i]<0)
			{
				if (result == 0 || nums[i] < result) {
					result = nums[i];
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = {-10};
		//int largestNegativeNumber = new R12_LargestSmallestNegativeNumber().largestNegativeNumber(nums);
		//int smallestNegativeNumber = new R12_LargestSmallestNegativeNumber().smallestNegativeNumber(nums);
		int smallestNegativeNumber = new R12_LargestSmallestNegativeNumber().largestNegativeNumberUsingSorting(nums);
		//System.out.println("largestNegativeNumber : "+largestNegativeNumber);
		System.out.println("smallestNegativeNumber : "+smallestNegativeNumber);
	}
}
