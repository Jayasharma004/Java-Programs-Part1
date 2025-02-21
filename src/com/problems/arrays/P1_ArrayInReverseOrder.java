package com.problems.arrays;

public class P1_ArrayInReverseOrder {
    void reverseArray(int[] arr)
    {
        for(int i= arr.length-1; i>=0; i--)
        {
            System.out.println(arr[i]);
        }
    }

    void testReverse(int[] arr)
    {
        for(int i= arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,6,7,7,0,9};
        //new P1_ArrayInReverseOrder().reverseArray(arr);
        new P1_ArrayInReverseOrder().testReverse(arr);
    }
}
