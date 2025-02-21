package com.Revision;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


// https://leetcode.com/problems/kth-largest-element-in-an-array/description/
public class PriorityQueue_Q4_KthLargestInArray {
	
	class KthHighestComparator implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o1 - o2;
		}
		
	}
	
	public int findKthLargest(int[] nums, int k) {
		Queue<Integer> pq = new PriorityQueue<>(new PriorityQueue_Q4_KthLargestInArray.KthHighestComparator());
		for (int n : nums) {
			pq.add(n);
			
			if(pq.size()>k)
			pq.poll();
		}
		return pq.poll();
	}
	
	public static void main (String[]args){
	//	int []nums = {3,2,1,5,6,4}; int k = 2;
		int []nums = {3,2,3,1,2,4,5,5,6}; int k=4;
		int result = new PriorityQueue_Q4_KthLargestInArray().findKthLargest(nums,k);
		System.out.println("result : "+result);
	}
}


