package com.problems.arrays;

import java.util.*;

public class P8_ContainsDuplicate2 {
	/**
	 * https://leetcode.com/problems/contains-duplicate-ii/
	 *
	 * @param nums
	 * @param k
	 * @return
	 */
	/*public boolean containsNearbyDuplicate(int[] nums, int k) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					int result = Math.abs(i - j);
					if (result <= k) {
						return true;
					}
				}
			}
		}
		return false;
	}*/
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		System.out.println("Array of nums : "+ Arrays.toString(nums));
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				List<Integer> positions = new ArrayList<>();
				positions.add(i);
				map.put(nums[i], positions);
			} else {
				List<Integer> positions = map.get(nums[i]);
				positions.add(i);
				map.put(nums[i], positions);
			}
		}
		System.out.println("map : "+map);
		for (int i = 0; i < nums.length; i++) {
			List<Integer> positions = map.get(nums[i]);
			for (int position : positions) {
				if( ((Math.abs(position - i)) <= k) && position!=i) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = {1,0,1,1};
		int k = 1;
		boolean isDifferenceCorrect = new P8_ContainsDuplicate2().containsNearbyDuplicate(nums, k);
		System.out.println("Given condition of the difference is correct ? : " + isDifferenceCorrect);
	}
}
