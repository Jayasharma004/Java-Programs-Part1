package com.practiceSession;

import java.util.Arrays;

public class Array_P8_MinimumNumberOfPlatforms {
	
	// Function to calculate the minimum number of platforms required
	public static int findMinimumPlatforms(int[] arrival, int[] departure) {
		// Sort both arrays
		Arrays.sort(arrival);
		Arrays.sort(departure);
		
		int platformsNeeded = 0;
		int maxPlatforms = 0;
		int i = 0, j = 0;
		
		// Traverse arrival and departure arrays
		while (i < arrival.length && j < departure.length)
		 {
			// If a train arrives before the next train departs, increase platform count
			if (arrival[i] <= departure[j])
			{
				platformsNeeded++;
				i++;
				// Update the maximum platforms needed
				maxPlatforms = Math.max(maxPlatforms, platformsNeeded);
			}
			
			else // Train departs, decrease platform count
			{
				platformsNeeded--;
				j++;
			}
		}
		
		return maxPlatforms;
	}
	
	public static void main(String[] args) {
		// Example input
		int[] arrival = {900, 940, 950, 1100, 1500, 1800};
		int[] departure = {910, 1200, 1120, 1130, 1900, 2000};
		
		// Calculate and print the result
		int result = findMinimumPlatforms(arrival, departure);
		System.out.println("Minimum number of platforms required: " + result);
	}
}
