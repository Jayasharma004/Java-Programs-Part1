package com.problems.arrays;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/duplicate-zeros/
 */
public class P25_DuplicateZeroes {
	public void duplicateZeros(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == 0) {
				for (int j = arr.length - 1; j > i; j--) {
					arr[j] = arr[j-1];
				}
				i = i + 1;
			}
		}
		System.out.println("arr : " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
		new P25_DuplicateZeroes().duplicateZeros(arr);
	}

}
