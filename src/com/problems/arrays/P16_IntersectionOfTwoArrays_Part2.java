package com.problems.arrays;

import javax.xml.transform.sax.SAXSource;
import java.util.*;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */
public class P16_IntersectionOfTwoArrays_Part2 {
	public int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer,Integer> map1 = new HashMap<>();
		Map<Integer,Integer> map2 = new HashMap<>();
		int countMap1=-1;
		int countMap2=-1;
		List<Integer> resultList = new ArrayList<>();
		for(int i=0; i<nums1.length; i++)
		{
			if(map1.containsKey(nums1[i]))
			{
				map1.put(nums1[i],map1.get(nums1[i])+1);
			}
			else
			{
				map1.put(nums1[i],1 );
			}
		}

		for(int i=0; i<nums2.length; i++)
		{
			if(map2.containsKey(nums2[i]))
			{
				map2.put(nums2[i],map2.get(nums2[i])+1);
			}
			else
			{
				map2.put(nums2[i],1 );
			}
		}
		for(int key : map1.keySet())
		{
			if(map2.containsKey(key))
			{
				countMap1 = map1.get(key);
				countMap2 = map2.get(key);
				int minimumCount = Math.min(countMap1,countMap2);
				for(int i=0; i<minimumCount; i++)
				{
					resultList.add(key);
				}
			}
		}
		return resultList.stream().mapToInt(Integer::intValue).toArray();
	}

	public int[] intersectUsingSingleMap(int[] nums1, int[] nums2) {
		Map<Integer,Integer> map1 = new HashMap<>();
		List<Integer> resultList = new ArrayList<>();
		for(int i=0; i<nums1.length; i++)
		{
			if(map1.containsKey(nums1[i]))
			{
				map1.put(nums1[i],map1.get(nums1[i])+1);
			}
			else
			{
				map1.put(nums1[i],1 );
			}
		}
		for(int num : nums2)
		{
			if(map1.containsKey(num) && map1.get(num)!=0)
			{
				resultList.add(num);
				map1.put(num, map1.get(num)-1);
			}
		}
		return resultList.stream().mapToInt(Integer::intValue).toArray();
	}
	
	public int[] intersectUsingMapAndList(int[] nums1, int[] nums2)
	{
		Map<Integer,Integer> map1 = new HashMap<>();
		List<Integer> resultList = new ArrayList<>();
		for(int i=0; i<nums1.length; i++)
		{
			if(map1.containsKey(nums1[i]))
			{
				map1.put(nums1[i],map1.get(nums1[i])+1);
			}
			else
			{
				map1.put(nums1[i],1 );
			}
		}
		System.out.println("map before : "+map1);
		for(int num : nums2) //{9,4,9,8,4}
		{
			if(map1.containsKey(num) && map1.get(num)!=0)
			{
				resultList.add(num);
				map1.put(num, map1.get(num)-1);
				System.out.println("map : "+map1);
			}
		}
		return resultList.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		int []nums1 = {4,9,5};
		int []nums2 = {9,4,9,8,4};
		int []results1 = new P16_IntersectionOfTwoArrays_Part2().intersect(nums1,nums2);
		int []results2 = new P16_IntersectionOfTwoArrays_Part2().intersectUsingSingleMap(nums1,nums2);
		int []results3 = new P16_IntersectionOfTwoArrays_Part2().intersectUsingMapAndList(nums1,nums2);
		//System.out.println("results using 2 maps : "+ Arrays.toString(results1));
		//System.out.println("results using single map : "+ Arrays.toString(results2));
		System.out.println("results intersectUsingMapAndList : "+ Arrays.toString(results3));
	}
}
