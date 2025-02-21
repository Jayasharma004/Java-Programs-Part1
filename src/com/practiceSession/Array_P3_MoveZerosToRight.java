package com.practiceSession;

import java.util.Arrays;

public class Array_P3_MoveZerosToRight {
	
	public static void moveZeroes(int[] nums) {
		int index=0;
		for(int i=0; i< nums.length; i++)
		{
			if(nums[i]!=0)
			{
				nums[index]=nums[i];
				index++;
			}
		}
		while(index< nums.length)
		{
			nums[index]=0;
			index++;
		}
	}
	
	public static void main(String[] args) {
		//int[] nums1 = {0, 1, 0, 3, 12};
		int[] nums1 = {0};
		moveZeroes(nums1);
		System.out.println("Output: " + Arrays.toString(nums1));
	}
}
