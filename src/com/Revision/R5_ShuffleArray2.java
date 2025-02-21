package com.Revision;

import com.problems.arrays.P3_ShuffleArray;

import java.util.Arrays;
import java.util.Random;

public class R5_ShuffleArray2 {

	public void shuffle(int arr[], int length)
	{
		Random random = new Random();
		for(int i=0; i<length;i++)
		{
			int randomIndex = random.nextInt(arr.length);
			System.out.println("randomIndex : "+randomIndex);
			int temp = arr[randomIndex]; //temp=6 | temp=5
			arr[randomIndex] = arr[i]; //arr[5]=arr[0]=1 | arr[4]=arr[1]=2
			arr[i] = temp; //arr[0]=6 | arr[1]=
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		int length = arr.length;
		new R5_ShuffleArray2().shuffle(arr,length);
	}
}
