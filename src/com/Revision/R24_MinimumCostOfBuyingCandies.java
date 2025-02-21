package com.Revision;

import java.util.Arrays;

// https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/description/
public class R24_MinimumCostOfBuyingCandies {
	
	public int minimumCost(int[] cost) {
		Arrays.sort(cost);
		System.out.println("Sorted Array : " + Arrays.toString(cost));
		int minCost = 0;
		
		if (cost.length <= 2) {
			for (int i = 0; i < cost.length; i++) {
				minCost = minCost + cost[i];
			}
			return minCost;
		}
		
		for (int i = cost.length - 1; i >= 0; i = i - 3) {
			if (i == 0) {
				minCost = minCost + cost[0];
				break;
			}
			minCost = minCost + cost[i] + cost[i - 1];
		}
		return minCost;
	}
	
	public static void main(String[] args) {
		//int []cost = {6,5,7,9,2,2};
		//int []cost = {2,3,3,3,1};
		int[] cost = {5, 5};
		int result = new R24_MinimumCostOfBuyingCandies().minimumCost(cost);
		System.out.println("result : " + result);
	}
}
