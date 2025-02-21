package com.problems.arrays;

import java.util.HashSet;
import java.util.Set;

public class P24_CommonMinimumElement {

	/**
	 * https://leetcode.com/problems/minimum-common-value/
	 *
	 */
	public int getCommon(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		for (int i=0; i<nums1.length; i++)
		{
			set.add(nums1[i]);
		}
		System.out.println("set : "+set);
		int commonSmallNum = Integer.MAX_VALUE;
		System.out.println("Integer.MAX_VALUE : "+Integer.MAX_VALUE);
		for(int i=0; i<nums2.length; i++)
		{
			if(set.contains(nums2[i]))
			{
				commonSmallNum = Math.min(commonSmallNum,nums2[i]);
			}
		}
		if(commonSmallNum!= Integer.MAX_VALUE)
			return commonSmallNum;
		else
			return -1;
	}

	public static void main(String[] args) {
		int []nums1 = {1,2,3,6};
		int []nums2 = {2,3,4,5};
		int result = new P24_CommonMinimumElement().getCommon(nums1,nums2);
		System.out.println("result : "+result);
	}
}
