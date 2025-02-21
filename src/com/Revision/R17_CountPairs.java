package com.Revision;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/
public class R17_CountPairs {
	
	public int countPairs(List<Integer> nums, int target) {
	int count=0;
		for(int i=0; i<nums.size(); i++)
		{
			for(int j=i; j<nums.size(); j++)
			{
				if((i < j) &&(nums.get(i)+nums.get(j) < target) )
				{
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		/*int []nums = {-1,1,2,3,1};
		int target = 2;*/
		int []nums = {-6,2,5,-2,-7,-1,3};
		int target = -2;
		List<Integer> listNums = new ArrayList<>();
		for(int num : nums)
		{
			listNums.add(num);
		}
		
		int result = new R17_CountPairs().countPairs(listNums,target);
		System.out.println("Result : "+result);
	}
}
