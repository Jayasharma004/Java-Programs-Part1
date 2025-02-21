package com.problems.collections;

import java.util.HashSet;
import java.util.Set;

public class P1_RemoveDuplicateElementFromArray {
    void removeDuplicates(int a[])
    {
        Set<Integer> duplicatesSet = new HashSet<>();
        for(int num : a)
        {
            duplicatesSet.add(num);
        }
            System.out.println("Duplicate numbers are removed : "+duplicatesSet);
    }

    public static void main(String[] args) {
        int a[] = {5,2,6,8,6,7,5,2,8};
        new P1_RemoveDuplicateElementFromArray().removeDuplicates(a);
    }
}
