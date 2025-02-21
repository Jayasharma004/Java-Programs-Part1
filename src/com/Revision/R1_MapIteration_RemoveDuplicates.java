package com.Revision;

import java.util.*;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class R1_MapIteration_RemoveDuplicates {

	public List<Integer> testhashSet(int[] arr) {
		HashSet<Integer> hashSet = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			hashSet.add(arr[i]);
		}
		for (int n : hashSet) {
			list.add(n);
		}
		return list;
	}

	public List<Integer> testHashMap(int[] arr) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for (int n : arr) {
			if (hashMap.containsKey(n)) {
				int count = hashMap.get(n);
				hashMap.put(n, count + 1);
			} else {
				hashMap.put(n, 1);
			}
		}
		for (int i : hashMap.keySet())
		{
			list.add(i);
			System.out.println("key : "+i);
			System.out.println("value : "+hashMap.get(i));
		}
		return list;
	}

	public int removeDuplicatesWithExtraSpace(int[] nums) {
		int[] resultArray = new int[nums.length];
		resultArray[0] = nums[0];
		int pos = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != resultArray[pos]) {
				pos += 1;
				resultArray[pos] = nums[i];
			}
		}
		System.out.println("resultArray : " + Arrays.toString(resultArray));
		return pos+1;
	}

	public int removeDuplicatesInPlace(int[] nums) {
		int pos=0;
		for(int i=1;i<nums.length; i++)
		{
			if(nums[pos]!=nums[i])
			{
				nums[pos+1]= nums[i];
				pos++;
			}
		}
		return pos+1;
	}

	public static void main(String[] args) {
		int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		//System.out.println(new R1_RemoveDuplicates().testhashSet(arr));
		System.out.println(new R1_MapIteration_RemoveDuplicates().testHashMap(arr));
		//System.out.println(new R1_RemoveDuplicates().removeDuplicatesWithExtraSpace(arr));
		//System.out.println(new R1_RemoveDuplicates().removeDuplicatesInPlace(arr));
	}
}
