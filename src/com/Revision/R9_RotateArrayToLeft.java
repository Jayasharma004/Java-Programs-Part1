package com.Revision;

import java.util.Arrays;

public class R9_RotateArrayToLeft {

	public void rotateArrayToLeft(int []arr, int n)
	{
		for(int i=0; i<n; i++)
		{
			int first = arr[0];
			for(int j=0; j<arr.length-1; j++)
			{
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = first;
		}
		System.out.println("Rotated Array : "+Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int []arr = {1, 2, 3, 4, 5, 6, 7};
		int n = 3;
		System.out.println("Original Array : "+ Arrays.toString(arr));
		new R9_RotateArrayToLeft().rotateArrayToLeft(arr,n);
	}
}
