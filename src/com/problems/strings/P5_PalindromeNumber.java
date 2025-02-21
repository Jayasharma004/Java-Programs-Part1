package com.problems.strings;

/*
 *https://leetcode.com/problems/palindrome-number/
 *
 * */
public class P5_PalindromeNumber {

	public boolean isPalindrome(int x) {
		String num = Integer.toString(x);
		int n = num.length(); //n=6 | n/2=3
		for(int i=0; i<n/2; i++) //i=0,1,2 | n-1-i=5,4,3
		{
			if(num.charAt(i) != num.charAt(n-1-i))
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int x = 123421;
		boolean result = new P5_PalindromeNumber().isPalindrome(x);
		System.out.println("result : "+result);
	}
}
