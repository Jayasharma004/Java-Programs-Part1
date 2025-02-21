package com.problems.arrays;

import java.util.Arrays;

/*
* https://leetcode.com/problems/move-zeroes/
 */

public class P14_MoveZeroes {

	public void moveZeroes(int[] nums) {
		int zeroPosition = 0;
		for(int i=0; i< nums.length;i++)
		{
			while (zeroPosition< nums.length && nums[zeroPosition]!=0 ){
				zeroPosition++;
			}
			if(i>zeroPosition && nums[i]!=0){
				nums[zeroPosition] = nums[i];
				nums[i]=0;
			}
		}

		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		new P14_MoveZeroes().moveZeroes(nums);
	}
}
