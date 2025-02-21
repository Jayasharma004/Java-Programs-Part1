package com.problems.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class P4_PairObjects {
    int num1;
    int num2;

    P4_PairObjects(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "P4_PairObjects{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}

public class P4_SortingArray {
        List<P4_PairObjects> sortingArray(Integer[] arr, int target) {
        Collections.sort(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
        List<P4_PairObjects> resultList = new ArrayList<>();
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int sum = arr[first] + arr[last];
            if (sum == target) {
                resultList.add(new P4_PairObjects(arr[first], arr[last]));
                first++;
                last--;
            } else if (sum < target) {
                first++;
            } else if (sum > target) {
                last--;
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        Integer[] arr = {2, 78, 90, 34, 55, 44, 321};
        int target = 134;
        List<P4_PairObjects> resultList= new P4_SortingArray().sortingArray(arr, target);
        System.out.println("resultList : "+resultList);
    }
}
