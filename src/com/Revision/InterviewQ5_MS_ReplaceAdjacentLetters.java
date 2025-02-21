package com.Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.geeksforgeeks.org/minimum-replacements-in-a-string-to-make-adjacent-characters-unequal/
public class InterviewQ5_MS_ReplaceAdjacentLetters {
	
	public int minimumCount(String word) {
		int length = word.length();
		int count = 0;
		int i = 0;
		while (i < length) {
			int j = i;
			while (j < length && word.charAt(j) == word.charAt(i)) {
				j++;
			}
			// diff stores the length of the substring such that all the characters are equal in it
			int diff = j - i;
			// We need atleast diff/2 operations for this substring
			count = count + (diff / 2);
			i = j;
		}
		System.out.println(count);
		return count;
	}
	
	public int[] minimumOccurences(List<String> words) {
		int[] counterArray = new int[words.size()];
		for (int i = 0; i < words.size(); i++) {
			int count = minimumCount(words.get(i));
			counterArray[i] = count;
		}
		return counterArray;
	}
	
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		words.add("aaaad");
		words.add("boook");
		words.add("break");
		int[] result = new InterviewQ5_MS_ReplaceAdjacentLetters().minimumOccurences(words);
		System.out.println("result : " + Arrays.toString(result));
		
		//new MS_ReplaceAdjacentLetters().minimumCount("break");
		
	}
}
