package com.Revision;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/shuffle-the-array/
 * //Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 */
public class R4_ShuffleArray {

	public int[] shuffle(int[] nums, int n) {
		int[] resultArray = new int[nums.length];
		for(int i=0;i<n;i++)
		{
			resultArray[2*i] = nums[i];
			resultArray[2*i+1] = nums[i+n];
		}
		return resultArray;
	}


	public static void main(String[] args) {
		int []nums = {2,5,1,3,4,7};
		//[2,5,1,3,4,7]
		//[2,3,5,4,1,7]
		int n = 3;
		int[] resultArray = new R4_ShuffleArray().shuffle(nums,n);
		System.out.println("resultArray : "+ Arrays.toString(resultArray));
	}
}
