package com.Revision;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/find-the-difference/description/
public class R22_FindDifferenceBetweenStrings {
	public char findTheDifference(String s, String t) {
		Map<Character, Integer> map_t = new HashMap<>();
		for (char cht : t.toCharArray()) {
			if (map_t.containsKey(cht)) {
				map_t.put(cht, map_t.get(cht) + 1);
			} else {
				map_t.put(cht, 1);
			}
		}
		
		for (char chs : s.toCharArray()) {
			if (map_t.containsKey(chs)) {
				int count = map_t.get(chs);
				map_t.put(chs, count - 1);
				if (count - 1 == 0) {
					map_t.remove(chs);
				}
			} else {
				return chs;
			}
		}
		Character result = null;
		if (map_t.keySet().size() != 1) {
			return result;
		}
		for (char ch : map_t.keySet()) {
			result = ch;
		}
		return result;
	}
	
	public static void main(String[] args) {
		String s = "", t = "y";
		char result = new R22_FindDifferenceBetweenStrings().findTheDifference(s, t);
		System.out.println(result);
	}
}
