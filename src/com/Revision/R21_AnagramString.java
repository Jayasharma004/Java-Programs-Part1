package com.Revision;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/valid-anagram/
public class R21_AnagramString {
	
	public Map<Character, Integer> getCharacterFrequencyMap(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println("map for string s : " + map);
		return map;
	}
	
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		Map<Character, Integer> map1 = getCharacterFrequencyMap(s);
		Map<Character, Integer> map2 = getCharacterFrequencyMap(t);
		for (char c : map1.keySet()) {
			if (!map2.containsKey(c)) {
				return false;
			}
			if (map1.get(c) != map2.get(c)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
//		String s = "anagram", t = "nagaram";
		//String s = "cat", t = "rat";
		//String s = "a", t = "ab";
		String s = "a", t = "aa";
		Boolean isAnagram = new R21_AnagramString().isAnagram(s, t);
		System.out.println("isAnagram : " + isAnagram);
	}
}
