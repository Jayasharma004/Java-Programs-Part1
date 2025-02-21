package com.problems.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays/description/
 */
public class P15_IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> resultSet = new HashSet<>();

		for(int i=0; i< nums1.length; i++)
		{
			set1.add(nums1[i]); //4,9,5
		}
		for(int j=0; j< nums2.length;j++)
		{
			if(set1.contains(nums2[j]))
			{
				resultSet.add(nums2[j]);
			}
		}
		int[] resultArray = new int[resultSet.size()];
		int counter =0;
		for(int n : resultSet)
		{
			resultArray[counter] = n;
			counter++;
		}
		return resultArray;
	}

	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		int[] resultArray = new P15_IntersectionOfTwoArrays().intersection(nums1,nums2);
		System.out.println("resultArray : "+ Arrays.toString(resultArray));
	}
}
