package com.practiceSession;

public class Array_P4_BinarySearch {
	
	public static boolean checkIfNumberPresent(int []nums, int numToSearch)
	{
		int left = 0;
		int right = nums.length-1;
		
		while(left<=right)
		{
			int middle = (left + right) / 2;
			if(nums[middle] == numToSearch)
			{
				return true;
			}
			if(nums[middle] < numToSearch)
			{
				left = middle+1;
			}
			else
			{
				right = middle-1;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] nums = {2, 3, 7, 12, 23, 51, 64, 75, 93, 101, 120};
		int numToSearch = 51;
		boolean isNumPresent = checkIfNumberPresent(nums, numToSearch);
		System.out.println("Number " + numToSearch + " is present? " + isNumPresent);
	}
}
