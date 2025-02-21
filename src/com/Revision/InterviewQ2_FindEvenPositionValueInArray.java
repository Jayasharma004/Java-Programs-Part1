package com.Revision;

//Retrun true if value is found in array and value is at an even position
//Return true even if value is found in array multiple times but value must be at even position
//Return false if value is not found in array
//Return false if value is not found at even position

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterviewQ2_FindEvenPositionValueInArray {
	public boolean findEvenPositionValueInArray(int[] numbers, int value)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		boolean isPresent = false;
		for(int i=0; i<numbers.length; i++)
		{
			map.put(numbers[i], i);
		}
		System.out.println("map : "+map);
		for(int key : map.keySet())
		{
			if(key == value && (map.get(key)%2==0))
			{
				System.out.println("key : "+key);
				System.out.println("value : "+map.get(key));
				isPresent = true;
				break;
			}
			else
				isPresent = false;
		}
		return isPresent;
	}
	public static void main(String[] args) {
		int[] numbers =  {1, 4, 3, 21};
		boolean isPresent = new InterviewQ2_FindEvenPositionValueInArray().findEvenPositionValueInArray(numbers,4);
		System.out.println("isPresent : "+isPresent);
	}
	
}
