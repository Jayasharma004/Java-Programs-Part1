package com.Revision;

import java.util.Arrays;

//In an array of temperatures, find the lowest positive temperature to zero
public class InterviewQ1_FindClosestTemperature {

	public int findClosestTemperature(int[] temperature)
	{
		Arrays.sort(temperature);
		int result =0;
		for(int i=0; i<temperature.length; i++)
		{
			if(temperature[i]>0)
			{
				result = temperature[i];
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] temperature = {-1, 0, -2, 3, 40};
		int result = new InterviewQ1_FindClosestTemperature().findClosestTemperature(temperature);
		System.out.println("result : "+result);
	}
}
