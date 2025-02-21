package com.practiceSession;

import java.util.Arrays;

public class Array_P2_PlusOne {
	public static int[] incrementByOne(int[] digits) {
		int n = digits.length;
		
		// Traverse the array from right to left
		for (int i = n - 1; i >= 0; i--)
		{
			if (digits[i] < 9)
			{
				// If the current digit is less than 9, simply increment it and return the array
				digits[i]++;
				return digits;
			}
			// If the current digit is 9, set it to 0
			digits[i] = 0;
			System.out.println("digits : "+Arrays.toString(digits));
		}
		System.out.println("digits : "+Arrays.toString(digits));
		// If all digits were 9, create a new array with an extra leading 1
		int[] result = new int[n + 1]; //whenever we declare an integer array, default value of int is 0
		result[0] = 1;
		return result;
	}
	
	
	public static void main(String[] args) {
		int[] digits = {9,9,9};
		int[] digits1 = {1,9,9};
		int[] digits2 = {9,9,2};
	/*	int[] result = incrementByOne(digits);
		int[] result1 = incrementByOne(digits1);
		int[] result2 = incrementByOne(digits2);
	*/
		
		System.out.println("Result for "+Arrays.toString(digits) +" : " +Arrays.toString(incrementByOne(digits)));
		System.out.println("Result for "+Arrays.toString(digits1) +" : " +Arrays.toString(incrementByOne(digits1)));
		System.out.println("Result for "+Arrays.toString(digits2) +" : " +Arrays.toString(incrementByOne(digits2)));
	}
}
