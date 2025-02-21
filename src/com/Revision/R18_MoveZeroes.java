package com.Revision;

import java.util.Arrays;

// https://leetcode.com/problems/move-zeroes/
public class R18_MoveZeroes {

	//Jaya's solution : 2ms
	public void moveZeroes(int[] nums) {
		int zeroPosition = 0;
		for (int i = 0; i < nums.length; i++) {
			while (zeroPosition < nums.length && nums[zeroPosition] != 0) {
				zeroPosition++;
			}
			if (i > zeroPosition && nums[i] != 0) {
				nums[zeroPosition] = nums[i];
				nums[i] = 0;
			}
		}
	}
	
	//Saurav's solution : 1ms
	public void moveZeroes1(int[] nums) {
		int swapPos = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[swapPos] = nums[i];
				swapPos++;
			}
		}
		
		for (int i = swapPos; i < nums.length; i++)
		{
			nums[i] = 0;
		}
		System.out.println(Arrays.toString(nums));
	}
	
	public static void main(String[] args) {
//		int[] nums = {0};
		int[] nums = {1, 0, 2, 3, 0, 1, 0, 4};
//		int[] nums = {0, 1, 0, 3, 12};
		new R18_MoveZeroes().moveZeroes1(nums);
	}
}
