package com.practiceSession;

import java.util.Arrays;

public class Array_P6_TwoSumWithSorting {

//Return numbers with sorting logic
	public static int[] towSum(int[]nums, int target)
	{
		Arrays.sort(nums); //o(nlogn)
		int left = 0;
		int right = nums.length-1;
		int []finalNumbers = new int[2];
		System.out.println("nums : "+Arrays.toString(nums)); //[3, 5, 6, 7, 8, 9, 9, 10, 15]
		
		while(left<right)
		{
			if(nums[left]+ nums[right] == target)
			{
				finalNumbers[0] = nums[left];
				finalNumbers[1] = nums[right];
				return finalNumbers;
			}
			if(nums[left]+ nums[right]<target)
			{
				left++;
			}
			if(nums[left]+ nums[right]> target)
			{
				right--;
			}
		}
		return finalNumbers;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {6,8,3,5,9,10,11,7,15};
		int target = 18;
		int[] finalNumbers = towSum(nums, target);
		System.out.println("result : "+Arrays.toString(finalNumbers));
	}
}
