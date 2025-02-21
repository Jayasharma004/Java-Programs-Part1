package com.Revision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/description/
public class R10_TwoSum {
	
	public int[] testTwoSum(int[] nums, int target) {
		int[] postions = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i< nums.length; i++)
		{
			if(map.containsKey(target - nums[i]))
			{
				postions[0]=i;
				postions[1]=map.get(target-nums[i]);
				break;
			}
			map.put(nums[i], i);
		}
		return postions;
	}

	public int[] twoSum(int[] nums, int target) {
		int[] positions = new int[2];
		Map<Integer, Integer> map = new HashMap<>(); // space = O(N) , as the map would take entire array values as keys in worst case
		for (int i = 0; i < nums.length; i++) //O(N)
		{
			if (map.containsKey(target - nums[i])) //O(1)
			{
				positions[0] = i; //O(1)
				positions[1] = map.get(target - nums[i]); //O(1)
				break;
			}
			map.put(nums[i], i);
		}
		return positions;
	}

	public int[] twoSumWithoutExtraSpace(int[] nums, int target) {
		int[] positions = new int[2]; //space = O(1), bcoz the result space is constant
		for (int i = 0; i < nums.length; i++) //time = O(N^2), bcoz in worst case we are traversing thru entire array
		{
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					positions[0] = i;
					positions[1] = j;
				}
			}
		}
		return positions;
	}

	public int[] twoSumWithoutExtraSpaceReducedTimeComplexity(int[] nums, int target) {
		int[] numbers = new int[2];
		numbers[0] = -1;
		numbers[1] = -1;
		Arrays.sort(nums);
		int first = 0;
		int last = nums.length - 1;

		while (first < last) {
			if (nums[first] + nums[last] == target) {
				numbers[0] = nums[first];
				numbers[1] = nums[last];
				return numbers;
			} else if (nums[first] + nums[last] > target) {
				last--;
			} else if (nums[first] + nums[last] < target) {
				first++;
			}
		}
		return numbers;
	}

	public static void main(String[] args) {
		int[] nums = {2, 5, 4, 11, 7, 15}; //2,3,5,7,11,15
		int target = 15;
		//int []resultArray = new R10_TwoSum().twoSum(nums,target);
		//System.out.println("result Array : "+ Arrays.toString(resultArray));
		int[] resultArray = new R10_TwoSum().testTwoSum(nums, target);
		System.out.println("result Array : " + Arrays.toString(resultArray));
	}
}
