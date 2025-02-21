package com.Revision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://www.youtube.com/watch?v=Y24ZbvX3Je4
//Morgan Stanley Bangalore Hackerrank Test
/*
Given a string that consists of only digits,
modify the first half of the string so that it is an anagram of the second half.
determine the minimum number of operations to complete the task
example :
INPUT : 123122
first half : 123
second half : 122
change the 3 in first half to 2, resulting in 122 for first half

INPUT : 123456
OUTPUT : 3
 */
public class InterviewQ3_MS_Anagrams {
	
	public int getAnagram(String s) {
		char[] ch = s.toCharArray();
		List<Character> listOfSecondHalfChars = new ArrayList<>();
		for (int j = ch.length / 2; j < ch.length; j++) {
			listOfSecondHalfChars.add(ch[j]);
		}
		int counter = 0;
		for (int i = 0; i < ch.length; i++) {
			if (!listOfSecondHalfChars.contains(ch[i])) {
				counter++;
			}
		}
		return counter;
	}
	
	public int getAnagramHashMap(String s) {
		char[] ch = s.toCharArray();
		if (ch.length % 2 == 1) {
			return 0;
		}
		if (ch.length == 1) {
			return 0;
		}
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < ch.length / 2; i++) {
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i]) + 1);
			} else {
				map.put(ch[i], 1);
			}
		}
		// 367 334
		int countNotContains = 0;
		for (int i = ch.length / 2; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				int value = map.get(ch[i]);
				if (value == 1) {
					map.remove(ch[i]);
				} else {
					map.put(ch[i], value - 1);
				}
			} else {
				countNotContains++;
			}
		}
		return countNotContains;
	}
	
	public static void main(String[] args) {
		String s = "1";
		int result = new InterviewQ3_MS_Anagrams().getAnagramHashMap(s);
		System.out.println("result : " + result);
	}
}
