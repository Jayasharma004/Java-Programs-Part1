package com.problems.strings;

public class P9_CountPrefixes {

	public int countPrefixes(String[] words, String s) {
		int count=0;
		for(String word : words)
		{
			if(s.startsWith(word))
			{
				count=count+1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String[] words = {"a","b","c","ab","bc","abc"};
		String s = "abc";
		int count = new P9_CountPrefixes().countPrefixes(words,s);
		System.out.println("count : "+count);
	}
}
