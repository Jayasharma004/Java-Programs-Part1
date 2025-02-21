package com.problems.commonJavaPrograms;

import java.util.Arrays;
import java.util.Locale;

public class P4_SortElements {
    void sortElements(int[] arr)
    {
    int temp=0;
        for(int i=0; i< arr.length; i++)
        {
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array : "+Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr= {98, 78, 90, 34, 55, 44, 321};
        System.out.println("Original Array : "+ Arrays.toString(arr));
        new P4_SortElements().sortElements(arr);
        String s = "Hello";
        System.out.println(s.charAt(2));
        String t=s.replace('l','s');
        System.out.println(s.hashCode());
        System.out.println(s.toLowerCase().hashCode());
        System.out.println(s);
    }
}
