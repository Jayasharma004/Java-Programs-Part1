package com.problems.collections;


import sun.reflect.generics.tree.Tree;

import java.util.*;

public class P1_FinMinCountElementInArray {

    public char finMinCountElementInArray(String str) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }
        }
        //iterate over the map
        int minCount = Integer.MAX_VALUE;
        char finalChar = 0;
        for (char mapKey : countMap.keySet()) {
            int finalCount = countMap.get(mapKey);
            if (finalCount < minCount) {
                minCount = finalCount;
                finalChar = mapKey;
            }
        }
        /*for(int i=0; i<str.length(); i++)
        {
            List<Character> chrList = new ArrayList<>();
            chrList.add(str.charAt(i));
        }*/
        System.out.println("Character " + finalChar + " with minimum count is : " + minCount);
        return finalChar;
    }

    public Map<String, Integer> returnMap() {
        System.out.println("this returns a map");
        Map<String, Integer> myMap = new TreeMap<>();
        myMap.put("cj", 2);
        myMap.put("g", 5);
        myMap.put("x", 2);
        myMap.put("hello", 7);
        myMap.put("sa", 8);

        for (String s: myMap.keySet()) {
            System.out.println("keys : "+s);
        }
        for(Integer v : myMap.values())
        {
            System.out.println("values : "+v);
        }
        return myMap;
    }

    public static void main(String[] args) {
        String str = "aabbbccaad";
//        char result = new P1_FinMinCountElementInArray().finMinCountElementInArray(str);
//        System.out.println("Character with minimum count is : " + result);

        Map<String, Integer> map = new P1_FinMinCountElementInArray().returnMap();
        System.out.println("Map is: " + map);

    }

}
