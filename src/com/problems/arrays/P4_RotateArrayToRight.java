package com.problems.arrays;

import java.util.*;

public class P4_RotateArrayToRight {
	public void rotateArray(int[] arr, int n) {
		for (int i = 0; i < n; i++)
		{
			int j, last;
			last = arr[arr.length - 1];
			for (j = arr.length - 1; j > 0; j--)
			{
				arr[j] = arr[j - 1];
			}
			arr[0] = last;
		}
		System.out.println("Rotated Array : " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int numberOfTimes = 2;
		System.out.println("Original Array : " + Arrays.toString(arr));
		new P4_RotateArrayToRight().rotateArray(arr, numberOfTimes);
	}
}
