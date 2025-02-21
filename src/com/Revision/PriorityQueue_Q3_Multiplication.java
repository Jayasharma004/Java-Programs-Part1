package com.Revision;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
public class PriorityQueue_Q3_Multiplication {
	class HighestNumberComparator implements Comparator<Integer> {
		
		@Override
		public int compare(Integer o1, Integer o2) {
			if (o1 < o2) {
				return -1;
			} else if (o1 > o2) {
				return 1;
			} else {
				return 0;
			}
		}
	}
	
	public int maxProduct(int[] nums) {
		Queue<Integer> pq = new PriorityQueue<>(new HighestNumberComparator());
		for (int n : nums) {
			pq.add(n);
/*
Below IF condition :
it will pop out the minimum numbers, this is more efficient solution as it takes only log(2) space complexity.

If we remove this IF condition :
it will pop out the maximum numbers, this is less efficient solution as it takes log(n) space complexity.
 */
			if (pq.size() > 2) {
				pq.poll();
			}
		}
		return (pq.poll() - 1) * (pq.poll() - 1);
		
	}
	
	public static void main(String[] args) {
		int[] nums = {4, 8, 2, 9, 12, 3, 2};
		int result = new PriorityQueue_Q3_Multiplication().maxProduct(nums);
		System.out.println(result);
	}
}
