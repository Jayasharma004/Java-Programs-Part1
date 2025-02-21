package com.Revision;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/description/
public class R2_MergeTwoSortedArrays_II {

	//Wrong code
	public void merge(int[] nums1, int m, int[] nums2, int n) {
	
		while (m > 0) {
			if (nums2[n - 1] > nums1[m - 1]) {
				nums1[m + n - 1] = nums2[n - 1];
				n--;
			} else if (nums2[n - 1] < nums1[m - 1]) {
				nums1[m + n - 1] = nums1[m - 1];
				m--;
			} else {
				nums1[m + n - 1] = nums1[m - 1];
				m--;
			}
		}
		System.out.println("nums1 : " + Arrays.toString(nums1));
	}
	
	public void mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {
//	Time complexity: O((m+n)log(m+n)) : due to the sort() function
//	Space complexity: O(1) : We are not using any extra space, so the space complexity is O(1)
		int i = m;
		for (int j = 0; j < n; j++)
		{
			nums1[i] = nums2[j];
			i++;
		}
		Arrays.sort(nums1);
		System.out.println("sorted merged array : "+Arrays.toString(nums1));
	}
	
	public static void main(String[] args) {
		/*int[] nums1 = {1, 2, 3, 0, 0, 0};
		int[] nums2 = {2, 5, 6};
		int m = 3, n = 3;*/
		
		/*int[] nums1 = {1};
		int[] nums2 = {};
		int m = 1, n = 0;*/
		
		int[] nums1 = {0};
		int[] nums2 = {1};
		int m = 0, n = 1;
		new R2_MergeTwoSortedArrays_II().mergeSortedArrays(nums1, m, nums2, n);
	}
}
