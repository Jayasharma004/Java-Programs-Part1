package com.practiceSession;

import java.util.*;

//   https://leetcode.com/problems/3sum/description/
public class Array_P7_ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);//-4,-1,-1,0,1,2
		Set<List<Integer>> finalSet = new HashSet<>();
		for (int i = 0; i < nums.length; i++)
		{
			int c = nums[i];
			int left = i+1;
			int right = nums.length - 1;
			
			while (left < right)
			{
				if (nums[left] + nums[right] == -c)
				{
					List<Integer> list = new ArrayList<>();
					list.add(nums[left]);
					list.add(nums[right]);
					list.add(c);
					left++;
					right--;
					finalSet.add(list);
				}
				if (nums[left] + nums[right] < -c) {
					left++;
				}
				if (nums[left] + nums[right] > -c) {
					right--;
				}
			}
		}
		return new ArrayList<>(finalSet);
	}
	
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> resultList = threeSum(nums);
		System.out.println("resultList : "+resultList);
	}
}
