package com.Revision;

import java.util.*;

//https://leetcode.com/problems/top-k-frequent-elements/description/
class CountComparator implements Comparator<KeyCount> {
	
	@Override
	public int compare(KeyCount o1, KeyCount o2) {
		return o1.getCount() - o2.getCount();
	}
}

class KeyCount {
	private int count;
	private int key;
	
	public int getCount() {
		return count;
	}
	
	public int getKey() {
		return key;
	}
	
	public KeyCount(int count, int key) {
		this.count = count;
		this.key = key;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		KeyCount keyCount = (KeyCount) o;
		return count == keyCount.count && key == keyCount.key;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(count, key);
	}
}

public class PriorityQueue_Q2_TopKFrequentElements {
	
	public int[] topKFrequent(int[] nums, int k) {
		PriorityQueue<KeyCount> pq = new PriorityQueue<>(new CountComparator());
		Map<Integer, Integer> map = new HashMap<>();
		for (int number : nums) {
			if (map.containsKey(number)) {
				map.put(number, map.get(number) + 1);
			} else {
				map.put(number, 1);
			}
		}
		System.out.println("map : " + map);
		for (int key : map.keySet()) {
			pq.add(new KeyCount(map.get(key), key));   // 3, 2, 1
		}
		
		while (pq.size() > k) {
			pq.poll();              // 1
		}
		List<Integer> result = new ArrayList<>();
		while (!pq.isEmpty()) {
			result.add(pq.poll().getKey());
		}
		int[] res = new int[k];
		for (int i = 0; i < result.size(); i++) {
			res[i] = result.get(i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] nums = {4, 4, 3, 3, 3, 1, 1};
		int k = 2;
		int[] res = new PriorityQueue_Q2_TopKFrequentElements().topKFrequent(nums, k);
		System.out.println(Arrays.toString(res));
	}
}
