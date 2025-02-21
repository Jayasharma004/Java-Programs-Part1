package com.Revision;

import java.util.Arrays;

public class R2_MergeTwoSortedArrays {
	public int[] testSort(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int arr1[] = {1, 3, 5, 7};
		int arr2[] = {8, 4, 6, 2, 0};
		int arr1Sorted[] = new R2_MergeTwoSortedArrays().testSort(arr1);
		int arr2Sorted[] = new R2_MergeTwoSortedArrays().testSort(arr2);
		System.out.println("Sorted Array 1 : "+Arrays.toString(arr1Sorted));
		System.out.println("Sorted Array 2 : "+Arrays.toString(arr2Sorted));

		int[] arr3 = new int [arr1.length + arr2.length];
		for(int i=0; i< arr1Sorted.length; i++)
		{
			arr3[i] = arr1Sorted[i];
		}
		for(int i=0 ; i< arr2Sorted.length ; i++)
		{
			arr3[arr1.length+i] = arr2Sorted[i];
		}
		System.out.println("Merged Array  : "+Arrays.toString(arr3));
	}
}
