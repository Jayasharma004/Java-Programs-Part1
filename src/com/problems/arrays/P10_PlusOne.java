package com.problems.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/plus-one/description/
public class P10_PlusOne {
	public int[] plusOne(int[] digits) {
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
		}
		// If all digits were 9, create a new array with an extra leading 1
		int[] result = new int[n + 1]; //whenever we declare an integer array, default value of int is 0
		result[0] = 1;
		return result;
	}

	public static void main(String[] args) {
		int[] digits = {1,9,9};
		System.out.println("Result for "+Arrays.toString(digits) +" : " +Arrays.toString(new P10_PlusOne().plusOne(digits)));
	}
}
