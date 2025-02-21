package com.Revision;

import java.util.Arrays;

//https://leetcode.com/problems/array-partition/description/
public class R23_ArrayPartition {
	
	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int sum=0;
		for(int i=1; i<nums.length; i=i+2)
		{
			sum = sum + Math.min(nums[i-1],nums[i]);
		}
		return sum;
	}
	
	public static void main(String[] args) {
	//	int[]nums = {1,4};
	//	int[]nums = {1,4,3,2};
		int[]nums = {6,2,6,5,1,2};
		int result = new R23_ArrayPartition().arrayPairSum(nums);
		System.out.println("result : "+result);
	}
}


/*1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
So the maximum possible sum is 4.*/

