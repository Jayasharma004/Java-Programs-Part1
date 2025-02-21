package com.Revision;

//https://leetcode.com/problems/degree-of-an-array/

import sun.awt.image.IntegerComponentRaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class R13_FindShortestSubArray {
	
	public int findShortestSubArray(int[] nums) {
		Map<Integer, Integer> degreeStoreMap = createDegreeStoreMap(nums);
		int degree = findDegreeOfArray(nums, degreeStoreMap);
		List<Integer> highestDegreeCandidates = findHighestDegreeCandidates(degree, degreeStoreMap);
		int minLength = findShortestLength(highestDegreeCandidates, nums);
		return minLength;
	}
	public Map<Integer, Integer> createDegreeStoreMap(int[] nums) {
		Map<Integer, Integer> degreeStore = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (degreeStore.containsKey(nums[i])) {
				degreeStore.put(nums[i], degreeStore.get(nums[i]) + 1);
			} else {
				degreeStore.put(nums[i], 1);
			}
		}
		System.out.println("degreeStore map : "+degreeStore);
		return degreeStore;
	}
	private int findDegreeOfArray(int[] nums, Map<Integer, Integer> degreeStore) {
		int highestDegree = Integer.MIN_VALUE;
		for (int key : degreeStore.keySet()) {
			highestDegree = Math.max(highestDegree, degreeStore.get(key));
		}
		System.out.println("highestDegree : "+highestDegree);
		return highestDegree;
	}
	private List<Integer> findHighestDegreeCandidates(int degree, Map<Integer, Integer> degreeStore) {
		List<Integer> highestDegreeCandidates = new ArrayList<>();
		for (int key : degreeStore.keySet()) {
			if (degree == degreeStore.get(key)) {
				highestDegreeCandidates.add(key);
			}
		}
		System.out.println("highestDegreeCandidates : "+highestDegreeCandidates);
		return highestDegreeCandidates;
	}
	private int findShortestLength(List<Integer> highestDegreeCandidates, int[] nums) {
		int minLength = Integer.MAX_VALUE;
		for (int candidate : highestDegreeCandidates) {
			int first = 0;
			int last = nums.length - 1;
			for (int i = 0; i < nums.length; i++) {
				if (candidate == nums[i]) {
					first = i;
					break;
				}
			}
			for (int i = nums.length - 1; i >= 0; i--) {
				if (candidate == nums[i]) {
					last = i;
					break;
				}
			}
			int candidateLength = last - first + 1;
			minLength = Math.min(minLength, candidateLength);
		}
		return minLength;
	}
	
	public static void main(String[] args) {
//		int[] nums = {1,2,2,3,1};
		int[] nums = {1,2,2,3,1,4,2};
		int result = new R13_FindShortestSubArray().findShortestSubArray(nums);
		System.out.println("result : " + result);
	}
}
