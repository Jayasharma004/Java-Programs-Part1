package com.Revision;

//GE HealthCare
//https://www.geeksforgeeks.org/find-minimum-element-in-a-sorted-and-rotated-array/
//Binary Search approach
public class R25_MinimunInRotatedSortedArray {

	public int minimumInRotatedSortedArray(int []arr)
	{
		int low = 0, high = arr.length - 1;
		
		while (low < high)
		{
			if (arr[low] <= arr[high])
				return arr[low];
			
			int mid = (low+high)/2;
			
			if (arr[mid] > arr[high])
				low = mid + 1;
			else
				high = mid;
		}
		return arr[low];
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 6, 0, 1, 2, 3, 4};
		R25_MinimunInRotatedSortedArray obj = new R25_MinimunInRotatedSortedArray();
		int result = obj.minimumInRotatedSortedArray(arr);
		System.out.println("result : "+result);
	}
}
