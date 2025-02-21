package com.practiceSession;

public class String_P4_PalindromeChecker {
	
	public static boolean isPalindrome(String s) {
		// Filter the string: retain only alphanumeric characters and convert to lowercase
		StringBuilder filtered = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (Character.isLetterOrDigit(c)) {
				filtered.append(Character.toLowerCase(c));
			}
		}
		// Reverse the filtered string and compare
		String original = filtered.toString();
		String reversed = filtered.reverse().toString();
		return original.equals(reversed);
	}
	
	public static void main(String[] args) {
		String s1 = "A man, a plan, a canal: Panama";
		String s2 = "race a car";
		
		System.out.println(isPalindrome(s1)); // Output: true
		System.out.println(isPalindrome(s2)); // Output: false
	}
}
