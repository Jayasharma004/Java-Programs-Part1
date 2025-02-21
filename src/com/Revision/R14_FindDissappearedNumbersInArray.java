package com.Revision;

import java.util.*;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class R14_FindDissappearedNumbersInArray {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		Set<Integer> numbersSet = new HashSet<>();
		List<Integer> disappearedNumbersList = new ArrayList<>();
		for(int i=0; i< nums.length; i++)
		{
			numbersSet.add(nums[i]);
		}
		System.out.println("numbersSet : "+numbersSet);
		for(int i=1; i<=nums.length;i++)
		{
			if(!numbersSet.contains(i))
			{
				disappearedNumbersList.add(i);
			}
		}
		return disappearedNumbersList;
	}
	
	//The below method should not take an extra space and time complexity should be O(N)
	//Below method is still INCOMPLETE
	public List<Integer> findDisappearedNumbersWithoutExtraSpace(int[] nums){
		List<Integer> disappearedNumbersList = new ArrayList<>();
		Arrays.sort(nums); //1,1,2,3
		for(int i=0;i<nums.length;i++)
		{
			if( (nums[i]==(i+1)))
			{
				disappearedNumbersList.add(i+1);
			}
		}
		return disappearedNumbersList;
	}
	
	public static void main(String[] args) {
		int[]nums = {1,1,2,3};
		//List<Integer> dissappearedNumbersList = new R14_FindDissappearedNumbersInArray().findDisappearedNumbers(nums);
		List<Integer> dissappearedNumbersList = new R14_FindDissappearedNumbersInArray().findDisappearedNumbersWithoutExtraSpace(nums);
		System.out.println("dissappearedNumbersList : "+dissappearedNumbersList);
	}
}
