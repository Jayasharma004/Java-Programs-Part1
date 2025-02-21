package com.problems.strings;

import java.util.HashMap;

public class P1_LongestSubstring {

	int lengthOfLongestSubstring(String s) {

		int maximum_length = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		int i = 0;
		for(int j=0; j<s.length(); j++)
		{
			if(map.containsKey(s.charAt(j)))
			{
				j = Math.max(i, map.get(s.charAt(j)) + 1);
			}
			map.put(s.charAt(j), j);
			maximum_length = Math.max(maximum_length, j-i + 1);
		}
		return maximum_length;
	}
	public static void main(String[] args) {
		String s = "abcabcbb";
		int length = new P1_LongestSubstring().lengthOfLongestSubstring(s);
		System.out.println("maximum_length : "+length);
	}
}


