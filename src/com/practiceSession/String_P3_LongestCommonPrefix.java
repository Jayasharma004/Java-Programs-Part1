package com.practiceSession;

public class String_P3_LongestCommonPrefix {
	
	public static String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length==0)
		{
			return "";
		}
		// Loop through characters of the first string
		for (int i = 0; i < strs[0].length(); i++)
		{
			char currentChar = strs[0].charAt(i);
			// Compare the current character with all other strings
			for (int j = 1; j < strs.length; j++)
			{
				// Check if we are out of bounds or characters don't match
				if (i >= strs[j].length() || strs[j].charAt(i) != currentChar)
				{
					return strs[0].substring(0, i); // Return prefix up to the mismatch
				}
			}
		}
		return strs[0]; // Entire first string is the prefix
	}
	
	public static void main(String[] args) {
		String[] strs1 = {"flower", "flow", "flight"};
		String[] strs2 = {"dog", "racecar", "car"};
		
		System.out.println("Example 1: " + longestCommonPrefix(strs1)); // Output: "fl"
		System.out.println("Example 2: " + longestCommonPrefix(strs2)); // Output: ""
	}
}
