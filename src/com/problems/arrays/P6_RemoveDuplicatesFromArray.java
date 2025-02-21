package com.problems.arrays;

import java.util.*;

public class P6_RemoveDuplicatesFromArray {

	public void removeDuplicatesUsingHashSet(int[] arr) {
		HashSet<Integer> arrSet = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			arrSet.add(arr[i]);
		}
		System.out.println("Removed duplicates : " + arrSet);
	}


	public List<Integer> removeDuplicatesUsingMap(int[] arr) {
		Map<Integer, Integer> numbersStore = new HashMap<>();
		for (Integer num : arr) {
			if (numbersStore.containsKey(num)) {
				int count = numbersStore.get(num);
				numbersStore.put(num, count + 1);
			} else {
				numbersStore.put(num, 1);
			}
		}

		List<Integer> result = new ArrayList<>();

		/*for (int key : numbersStore.keySet()) {
			int value = numbersStore.get(key);
			System.out.println("key: " + key + " value: " + value);
		}*/

		result.addAll(numbersStore.keySet());
		return result;
	}

	public void testhashset(int []arr)
	{
		HashSet testhash = new HashSet<>();
		for(int i=0; i< arr.length; i++)
		{
			testhash.add(arr[i]);
		}
		System.out.println("Removed Duplicates by set : "+testhash);
	}

	public List<Integer> testHashmap(int []arr)
	{
		HashMap<Integer,Integer> testmap = new HashMap<>();
		for(Integer num : arr)
		{
			if(testmap.containsKey(num))
			{
				int count = testmap.get(num);
				testmap.put(num, count+1);
			}
			else
			{
				testmap.put(num, 1);
			}
		}
		List<Integer> result = new ArrayList<>();
		result.addAll(testmap.keySet());
		System.out.println("Removed Duplicates by map : "+result);
		return result;
	}

	public static void main(String[] args) {
		int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		//new P6_RemoveDuplicatesFromArray().removeDuplicatesUsingHashSet(arr);
		//List<Integer> result = new P6_RemoveDuplicatesFromArray().removeDuplicatesUsingMap(arr);
		//System.out.println("List without duplicates using Map approach " + result);
		new P6_RemoveDuplicatesFromArray().testhashset(arr);
		List<Integer> result = new P6_RemoveDuplicatesFromArray().testHashmap(arr);
	}
}
