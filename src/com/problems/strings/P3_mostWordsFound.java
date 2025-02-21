package com.problems.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P3_mostWordsFound {

	/**
	 * https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
	 * @param sentences
	 * @return
	 */

	public int mostWordsFound(String[] sentences) {
		int counter= 0;
		List<Integer> count = new ArrayList<>();
		for(int i=0;i< sentences.length;i++)
		{
			String[] words = sentences[i].split(" ");
			counter = words.length;
			count.add(counter);
		}
		Collections.sort(count);
		return count.get(sentences.length-1);
	}

	public static void main(String[] args) {
		String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		int maxCount = new P3_mostWordsFound().mostWordsFound(sentences);
		System.out.println("number of words in each sentence : "+maxCount);
	}
}
