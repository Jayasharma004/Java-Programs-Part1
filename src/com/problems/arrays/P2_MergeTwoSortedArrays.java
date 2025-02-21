package com.problems.arrays;

import java.util.Arrays;

public class P2_MergeTwoSortedArrays {

	public int[] sortArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public int[] testsort(int [] arr)
	{
		for(int i=0; i< arr.length; i++)
		{
			for(int j=i+1; j< arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr1[] = {1, 3, 5, 7};
		int arr2[] = {2, 4, 6, 8};
		int []sortedArr1 = new P2_MergeTwoSortedArrays().sortArray(arr1);
		int []sortedArr2 = new P2_MergeTwoSortedArrays().sortArray(arr2);
		System.out.println("sorted array : " + Arrays.toString(sortedArr1));
		System.out.println("sorted array : " + Arrays.toString(sortedArr2));

		int arr3[] = new int[arr1.length+arr2.length];
		for(int i=0; i< arr1.length; i++)
		{
			arr3[i] = arr1[i];
		}
		for(int i=0; i< arr2.length; i++)
		{
			arr3[arr1.length+i] = arr2[i];
		}
		System.out.println("Final array : " + Arrays.toString(arr3));
		int []sortedArr3 = new P2_MergeTwoSortedArrays().sortArray(arr3);
		System.out.println("Final Merged array : " + Arrays.toString(sortedArr3));
	}
}
