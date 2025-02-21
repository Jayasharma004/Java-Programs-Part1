package com.problems.strings;


/**
 * https://leetcode.com/problems/repeated-substring-pattern/
 */
public class P13_RepeatedSubstringPattern {

	public boolean repeatedSubstringPattern(String s) {
		boolean isRepeated =  false;
		int length = s.length(); //12
		for(int i=length/2; i>=1; i--) //i=6;i>=1
		{
			if(length%i == 0) //12%6=0
			{
				int m = length/i; // m=12/6=2
				String subStr = s.substring(0,i); //substr=(0,2) = ab
				StringBuilder stb = new StringBuilder();
				for(int j=0; j<m; j++)
				{
					stb.append(subStr);
				}
				if(stb.toString().equals(s))
				{
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String s = "abcabcabcabc";
		boolean isRepeated = new P13_RepeatedSubstringPattern().repeatedSubstringPattern(s);
		System.out.println("isRepeated : "+isRepeated);
	}
}
