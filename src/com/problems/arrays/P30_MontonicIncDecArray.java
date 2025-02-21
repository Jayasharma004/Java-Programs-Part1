package com.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//  https://leetcode.com/problems/monotonic-array/description/
public class P30_MontonicIncDecArray {

	public boolean isMonotonic(int[] nums) {

		if(isIncreasing(nums) == true)
		{
			return true;
		}
		int[]reveresedArray = reverse(nums);
		if(isIncreasing(reveresedArray) == true)
		{
			return true;
		}
		return false;
	}
	public boolean isIncreasing(int[] nums)
	{
		boolean isIncreasing = true;
		for(int i=1; i< nums.length; i++)
		{
			if(!(nums[i-1] <= nums[i]))
			{
				isIncreasing = false;
				break;
			}
		}
		return isIncreasing;
	}
	public int[] reverse(int a[])
	{
		/*Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.asList(Arrays.toString(a)));*/
		int[] reversedArr = new int[a.length];
		int j=0;
		for(int i=a.length-1; i>=0 ; i--)
		{
			reversedArr[j] = a[i];
			j++;
		}
		return reversedArr;
	}

	public static void main(String[] args) {
		int []nums = {6,5,4,4};
		boolean isMonotonic = new P30_MontonicIncDecArray().isMonotonic(nums);
		System.out.println("isMonotonic : "+isMonotonic);
	}
}
