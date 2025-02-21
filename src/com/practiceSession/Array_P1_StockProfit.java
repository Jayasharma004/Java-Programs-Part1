package com.practiceSession;

//  https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class Array_P1_StockProfit {
		private static int calculateMaxProfit(int[] prices) {
			if (prices == null || prices.length == 0) {
				return 0;
			}
			int maxProfit = 0;
			int minPrice = Integer.MAX_VALUE;
			for(int i=0; i< prices.length;i++)
			{
				minPrice = Math.min(minPrice,prices[i]);
				maxProfit = Math.max(maxProfit,prices[i]-minPrice);
			}
			return maxProfit;
		}
	public static void main(String[] args) {
		int[] prices = {7, 1, 5, 3, 6, 4};
		//7,6,4,3,1 : output=0
		int maxProfit = calculateMaxProfit(prices);
		System.out.println("Maximum Profit: " + maxProfit);
	}
}
