package com.problems.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class P32_DissappearedElementInArray {

	public List<Integer> findDisappearedNumbers(int[] nums) {
		Set<Integer> existingArraySet = new HashSet<>();
		List<Integer> resultList = new ArrayList<>();
		for (int num : nums)
		{
			existingArraySet.add(num);
		}
		for(int i=1; i<=nums.length; i++)
		{
			if(!existingArraySet.contains(i))
			{
				resultList.add(i);
			}
		}
		return resultList;
	}

	public static void main(String[] args) {
		int []nums = {4,3,2,7,8,2,3,1};
		List<Integer> resultList = new P32_DissappearedElementInArray().findDisappearedNumbers(nums);
		System.out.println("resultList : "+resultList);
	}
}
