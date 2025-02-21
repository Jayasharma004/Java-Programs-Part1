package com.Revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://www.youtube.com/watch?v=Y24ZbvX3Je4
//Morgan Stanley Bangalore Hackerrank Test
/*
Given an array of distinct integers, determine the minimum absolute difference between any 2 elements.
Print all element pairs in ascending order
example :
INPUT : [6,2,4,10]
OUTPUT :
[2,4]
[4,6]
 */
public class InterviewQ4_MS_ClosestNumbers {
	public void closestNumbers(List<Integer> nums) {
		Collections.sort(nums);
		System.out.println("sorted : " + nums);
		
		int minDiff = Integer.MAX_VALUE;
		
		for (int i = 1; i < nums.size(); i++) {
			int diff = Math.abs(nums.get(i) - nums.get(i - 1));
			minDiff = Math.min(minDiff, diff);
		}
		
		List<List<Integer>> resultList = new ArrayList<>();
		for (int i = 1; i < nums.size(); i++) {
			if ((nums.get(i) - nums.get(i - 1)) == minDiff)
			{
				List<Integer> innerList = new ArrayList<>();
				int n1 = nums.get(i);
				int n2 = nums.get(i - 1);
				if (n1>n2) {
					innerList.add(n2);
					innerList.add(n1);
				} else {
					innerList.add(n1);
					innerList.add(n2);
				}
				resultList.add(innerList);
			}
		}
		System.out.println("resultList : " + resultList);
	}
	
	public static void main(String[] args) {
		int[] nums = {6, 2, 4, 10};
		List<Integer> listOfNumbers = new ArrayList<>();
		for (int num : nums) {
			listOfNumbers.add(num);
		}
		new InterviewQ4_MS_ClosestNumbers().closestNumbers(listOfNumbers);
	}
	
}
