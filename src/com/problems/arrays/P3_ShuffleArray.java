package com.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class P3_ShuffleArray {

	public void shuffle(int arr[], int length)
	{
		Random random = new Random();
		//List<Integer> arrList = new ArrayList<Integer>(length);
		for(int i=0; i<length; i++)
		{
			int randomIndex = random.nextInt(arr.length);
			int temp = arr[randomIndex];
			arr[randomIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println("shuffled array : "+Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		int length = arr.length;
		new P3_ShuffleArray().shuffle(arr,length);
	}
}
