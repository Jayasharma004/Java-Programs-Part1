package com.Revision;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

// https://leetcode.com/problems/kth-largest-element-in-a-stream/
// some issue with this leetcode question

class OrderComparator implements Comparator<Integer> {
	
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
	
}

public class PriorityQueue_Q1_KthLargest {
	
	PriorityQueue<Integer> pq = new PriorityQueue<>(new OrderComparator());
	int k;
	int[] nums;
	
	public PriorityQueue_Q1_KthLargest(int k, int[] nums) {
		this.k = k;
		this.nums = nums;
		List<Integer> list = new ArrayList<>();
		for (int number : nums) {
			list.add(number);
		}
		pq.addAll(list);
	}
	
	
	
	public int add(int val) {
		List<Integer> list = new ArrayList<>();
		pq.add(val);
		
		int i = 0;
		while (i < k - 1) {
			int polledNum = pq.poll();
			list.add(polledNum);
			i++;
		}
		
		int result = pq.poll();
		pq.addAll(list);
		return result;
	}
	
	public static void main(String[] args) {
		int k = 3;
		int[] nums = {4, 5, 8, 2};
		PriorityQueue_Q1_KthLargest r27_kthLargest = new PriorityQueue_Q1_KthLargest(k, nums);    // 8, 5, 4, 2
		int result = r27_kthLargest.add(3);
		System.out.println(result); 		// 8, 5, 4, 3, 2 -> 4
		result = r27_kthLargest.add(5);
		System.out.println(result);         // 8, 5, 5, 3, 2 -> 5
		result = r27_kthLargest.add(10);
		System.out.println(result);         // 10, 8, 5, 3, 2 -> 5
		result = r27_kthLargest.add(9);
		System.out.println(result);         // 10, 9, 8, 3, 2 -> 8
		result = r27_kthLargest.add(4);
		System.out.println(result);         // 10, 9, 4, 3, 2 -> 4
		// 8, 5, 4, 4, 2 -> 4
		// 8, 7, 5, 4, 2 -> 5
	}
}
