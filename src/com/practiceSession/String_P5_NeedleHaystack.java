package com.practiceSession;

public class String_P5_NeedleHaystack {
	
	public static int strStr(String haystack, String needle) {
		return haystack.indexOf(needle);
	}
	
	public static int needleInAHaystack(String haystack, String needle) {
		if (needle.isEmpty()) return 0;
		int hLen = haystack.length();
		int nLen = needle.length();
		
		// Iterate through haystack
		for (int i = 0; i <= hLen - nLen; i++)
		{
			int j = 0;
			// Compare substring with needle
			while (j < nLen && haystack.charAt(i + j) == needle.charAt(j))
			{
				j++;
			}
			// If all characters match, return the starting index
			if (j == nLen)
				return i;
		}
		
		return -1; // If no match is found
	}
	public static void main(String[] args) {
		// Test cases
		/*System.out.println(strStr("sadbutsad", "sad")); // Output: 0
		System.out.println(strStr("leetcode", "leeto")); // Output: -1*/
		
		System.out.println(needleInAHaystack("sadbutsad", "sad")); // Output: 0
		System.out.println(needleInAHaystack("leetcode", "leeto")); // Output: -1
	}
}
