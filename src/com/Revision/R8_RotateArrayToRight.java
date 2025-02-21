package com.Revision;

import java.util.Arrays;

public class R8_RotateArrayToRight {

	public void rotateArrayToRight(int []arr, int n)
	{
		for(int i=0; i<n; i++)
		{
			int last = arr[arr.length-1];
			for(int j=arr.length-1; j>0; j--)
			{
				arr[j] = arr[j-1];
			}
			arr[0] = last;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int []arr = {1, 2, 3, 4, 5, 6, 7};
		int numberOfTimes = 3;
		System.out.println("Original Array : "+ Arrays.toString(arr));
		new R8_RotateArrayToRight().rotateArrayToRight(arr,numberOfTimes);
	}
}
