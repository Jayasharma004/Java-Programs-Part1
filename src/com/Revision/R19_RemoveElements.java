package com.Revision;

import java.util.Arrays;

//https://leetcode.com/problems/remove-element/
public class R19_RemoveElements {
	
	public int removeElement(int[] nums, int val) {
		int j=0;
		for(int i=0; i< nums.length; i++)
		{
			if(nums[i]!=val)
			{
				nums[j] = nums[i];
				j++;
			}
		}
		System.out.println("expectedNums : "+ Arrays.toString(nums));
		return j;
	}
	
	public static void main(String[] args) {
		int[] nums = {0,1,2,2,3,0,4,2};
		int val = 2;
		/*int[] nums = {3,2,2,3};
		int val=3;*/
		int result = new R19_RemoveElements().removeElement(nums, val);
		System.out.println("result : "+result);
	}
}
