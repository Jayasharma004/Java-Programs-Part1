package com.practiceSession;

import java.util.HashMap;

public class String_P2_FirstUniqueCharacter {

	public static int firstUniqChar(String str)
	{
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		for(char c : str.toCharArray())
		{
			if(charCountMap.containsKey(c))
			{
				charCountMap.put(c,charCountMap.get(c)+1);
			}
			else
			{
				charCountMap.put(c,1);
			}
		}
		for(int i=0; i<str.length(); i++)
		{
			if(charCountMap.get(str.charAt(i)) == 1)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String s1 = "leetcode";
		String s2 = "loveleetcode";
		String s3 = "aabb";
		
		System.out.println("Input: \"" + s1 + "\" Output: " + firstUniqChar(s1)); // Output: 0
		System.out.println("Input: \"" + s2 + "\" Output: " + firstUniqChar(s2)); // Output: 2
		System.out.println("Input: \"" + s3 + "\" Output: " + firstUniqChar(s3)); // Output: -1
		
	}
}
