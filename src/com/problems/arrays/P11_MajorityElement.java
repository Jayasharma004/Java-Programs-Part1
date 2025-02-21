package com.problems.arrays;

import java.util.HashMap;
import java.util.Map;

public class P11_MajorityElement {

	public int majorityElement(int[] nums) {
		int maxCount = 0;
		int index = -1;
		int n = nums.length;
		int value = 0;
		for(int i=0; i<n; i++)
		{
			int count = 0;
			for(int j=0; j< n; j++)
			{
				if(nums[i] == nums[j])
				{
					count++;
				}
			}
			if(count > maxCount)
			{
				maxCount = count;
				index = i;
			}
		}
		if(maxCount> n/2)
		{
			value = nums[index];
		}
			return value;

	}

	public static void main(String[] args) {
		int[] nums = {2,2,1,1,1,2,2};
		int value = new P11_MajorityElement().majorityElement(nums);
		System.out.println("Majority Element : "+value);
	}
}
