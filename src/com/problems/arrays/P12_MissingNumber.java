package com.problems.arrays;

import java.util.*;

//https://leetcode.com/problems/missing-number/description/
public class P12_MissingNumber {

	public int missingNumber(int[] nums) {
	int missingNum=-1; //o(1)
		Arrays.sort(nums); // o(nlog(n))
		System.out.println("sorted array : "+Arrays.toString(nums));
		for(int i=1; i<nums.length;i++) //o(n)
		{
			if(!((nums[i-1]+1) == nums[i])) //o(1)
			{
				missingNum = nums[i-1]+1;
			}
		}
		if(missingNum== -1)
		{
			missingNum = nums.length;
		}
		if(nums.length==1)
		{
			missingNum=nums.length-1;
		}
		return missingNum;
	}

	public int missingNumberUsingSet(int[] nums)
	{
		int missingNumber=-1;
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<nums.length; i++)
		{
			set.add(nums[i]);
		}
		for(int i=0; i<=nums.length; i++)
		{
			if(!set.contains(i))
			{
				missingNumber = i;
				break;
			}
		}
		return missingNumber;
	}

	public static void main(String[] args) {
		int[] nums = {0};
		int missingNum = new P12_MissingNumber().missingNumberUsingSet(nums);
		System.out.println("missingNumber : "+missingNum);
	}
}
