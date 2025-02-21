package com.Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  https://leetcode.com/problems/plus-one/description/
public class R11_PlusOne {
	
	public int[] plusOne(int[] digits) {
		int lastDigit = digits[digits.length - 1];
		boolean flag = true;

		for (int i = 0; i < digits.length; i++) {
			if (digits[i] != 9) {
				flag = false;
				break;
			}
		}
		if(flag)
		{
			int[] resultArray = new int[digits.length+1];
			resultArray[0]=1;
			for(int i=1; i<resultArray.length; i++)
			{
				resultArray[i]=0;
			}
			return resultArray;
		}


		if (lastDigit != 9) {
			digits[digits.length - 1] = lastDigit + 1;
			return digits;
		} else {
			for (int i = digits.length - 1; i >= 0; i--) {
				if (digits[i] == 9) {
					digits[i] = 0;
				} else {
					digits[i] = digits[i] + 1;
					break;
				}
			}
			return digits;
		}

	}

	public static void main(String[] args) {
		//int[] digits = {8,9,9,9}; //2147483647 -- max value of INTEGER in java
		int[] digits = {9};
		int[] result = new R11_PlusOne().plusOne(digits);
		System.out.println("result : " + Arrays.toString(result));
	}
}
