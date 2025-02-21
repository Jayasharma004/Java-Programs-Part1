package com.problems.collections;

import java.util.*;

class PairObjects {
    int num1;
    int num2;

    public PairObjects(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public PairObjects() {
    }

    public PairObjects(int num1) {
        this.num1 = num1;
    }

    @Override
    public String toString() {
        return "PairObjects{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PairObjects that = (PairObjects) o;
//        return num1 * num2 == that.num1 * that.num2;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(num1 * num2);
//    }
}

public class P3_FindPairOfNumbersInArray {


    List<PairObjects> findPairOfNumbersInArray(int[] numbers, int targetNumber) {
        List<Integer> numberList = new ArrayList<>();
        List<PairObjects> resultList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            numberList.add(numbers[i]);
        }
        for (int j = 0; j < numberList.size(); j++) {
            for (int k = j + 1; k < numberList.size(); k++) {
                if (numberList.get(j) + numberList.get(k) == targetNumber) {
                    resultList.add(new PairObjects(numberList.get(j), numberList.get(k)));
//                    System.out.println("Numbers " + numberList.get(j) + " and " + numberList.get(k) + " add up to be equal to the target number");
                }
            }
        }
        return resultList;
    }

    List<PairObjects> findPairs(int[] numbers, int targetNumber) {
        Set<Integer> numberSet = new HashSet<>();
        List<PairObjects> resultList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            numberSet.add(numbers[i]);
        }

        for (int num : numbers) {
            if (numberSet.contains(targetNumber - num)) {
                resultList.add(new PairObjects(num, targetNumber - num));
                numberSet.remove(num);
            }
        }
        return resultList;
    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 6, 8, 3, 4, 5, 7};
        int targetNumber = 9;
        List<PairObjects> result = new P3_FindPairOfNumbersInArray().findPairOfNumbersInArray(numbers, targetNumber);
        List<PairObjects> result1 = new P3_FindPairOfNumbersInArray().findPairs(numbers, targetNumber);
        System.out.println(result);
        System.out.println(result1);
    }
}


