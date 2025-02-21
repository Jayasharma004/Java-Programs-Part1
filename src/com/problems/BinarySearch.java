package com.problems;

import java.util.Arrays;

//Binary Search in a sorted array
public class BinarySearch {

//APPROACH 1 :
	private static int checkIfPresentJava(int[] nums, int numToSearch) {
		return Arrays.binarySearch(nums, numToSearch);
	}
	
//APPROACH 2 :
	private static boolean checkIfPresentRecursion(int[] nums, int numToSearch) {
		boolean result = checkIfPresentRecursionHelper(nums, numToSearch, 0, nums.length - 1);
		return result;
	}
	
	private static boolean checkIfPresentRecursionHelper(int[] nums, int numToSearch, int left, int right) {
		if (left > right) {
			return false;
		}
		int middle = (left + right) / 2;
		if (nums[middle] == numToSearch) {
			return true;
		}
		if (nums[middle] < numToSearch) {
			return checkIfPresentRecursionHelper(nums, numToSearch, middle + 1, right);
		} else {
			return checkIfPresentRecursionHelper(nums, numToSearch, left, middle - 1);
		}
	}
	
//APPROACH 3 : O(log n)
	private static boolean checkIfPresentIteration(int[] nums, int numToSearch) {
		int left = 0;
		int right = nums.length - 1;
		
		while (left <= right)
		{
			int middle = (left + right) / 2;
			if (nums[middle] == numToSearch)
			{
				return true;
			}
			if (nums[middle] < numToSearch)
			{
				left = middle + 1;
			}
			else
			{
				right = middle - 1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] nums = {2, 3, 7, 12, 23, 51, 64, 75, 93, 101, 120};
		int numToSearch = 1;
		boolean isNumPresent1 = checkIfPresentRecursion(nums, numToSearch);
		boolean isNumPresent2 = checkIfPresentIteration(nums, numToSearch);
		int isNumPresent3 = checkIfPresentJava(nums, numToSearch);
		System.out.println("Number " + numToSearch + " is present? " + isNumPresent1);
		System.out.println("Number " + numToSearch + " is present? " + isNumPresent2);
		System.out.println("Number " + numToSearch + " is present? " + isNumPresent3);
	}
}
