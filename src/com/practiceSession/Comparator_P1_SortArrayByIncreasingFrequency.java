package com.practiceSession;

import java.util.*;

public class Comparator_P1_SortArrayByIncreasingFrequency {

	public Map<Integer,Integer> getFrequencyMap(int[] nums)
	{
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i< nums.length; i++)
		{
			if(map.containsKey(nums[i]))
			{
				map.put(nums[i], map.get(nums[i])+1);
			}
			else
			{
				map.put(nums[i], 1);
			}
		}
		return map;
	}
	public List<Map.Entry<Integer,Integer>> sortTheMapEntries(Map<Integer,Integer> map)
	{
		List<Map.Entry<Integer, Integer>> list =
				new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				if (o1.getValue() == o2.getValue()) {
					return (o2.getKey().compareTo(o1.getKey()));
				} else if (o1.getValue() > o2.getValue()) {
					return (o1.getValue().compareTo(o2.getValue()));
				} else {
					return (o1.getValue().compareTo(o2.getValue()));
				}
			}
		});
		return list;
	}

	public int[] frequencySort(int[] nums)
	{
		Map<Integer,Integer> map = getFrequencyMap(nums);
		List<Map.Entry<Integer, Integer>> list = sortTheMapEntries(map);
		List<Integer> resultArray = new ArrayList<>();
		
		for(Map.Entry<Integer,Integer> entry : list)
		{
			for(int i=0; i< entry.getValue(); i++)
			{
				resultArray.add(entry.getKey());
			}
		}
		int[] result = new int[resultArray.size()];
		for (int i = 0; i < resultArray.size(); i++)
		{
			result[i] = resultArray.get(i);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {2, 3, 1, 3, 2,3};
		int[] result = new Comparator_P1_SortArrayByIncreasingFrequency().frequencySort(nums);
		new Comparator_P1_SortArrayByIncreasingFrequency().frequencySort(nums);
		System.out.println("result : " + Arrays.toString(result));
	}
}
