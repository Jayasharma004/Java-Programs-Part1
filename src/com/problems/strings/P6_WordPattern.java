package com.problems.strings;


/*
 * https://leetcode.com/problems/word-pattern/
 *
 * */

import java.util.HashMap;
import java.util.Map;

public class P6_WordPattern {

	public boolean wordPattern(String pattern, String s) {
		String[] words = s.split(" ");
		if (words.length != pattern.length()) {
			return false;
		}

		Map<Character, String> charToWord = new HashMap<>();
		Map<String, Character> wordToChar = new HashMap<>();

		for (int i = 0; i < pattern.length(); i++) {
			char c = pattern.charAt(i);
			String word = words[i];

			if (!charToWord.containsKey(c)) {
				charToWord.put(c, word);
			}

			if (!wordToChar.containsKey(word)) {
				wordToChar.put(word, c);
			}
			System.out.println("charToWord : "+charToWord);
			System.out.println("wordToChar : "+wordToChar);
			System.out.println("********************************************");

			if (!charToWord.get(c).equals(word) || !wordToChar.get(word).equals(c)) {
				return false;
			}
		}

		return true;
	}


	public static void main(String[] args) {
		String pattern = "aaaa";
		String s = "dog cat cat dog";
		boolean result = new P6_WordPattern().wordPattern(pattern,s);
		System.out.println("result : "+result);
	}
}
