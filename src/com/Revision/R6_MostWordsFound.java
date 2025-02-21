package com.Revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
 */

public class R6_MostWordsFound {

	public int mostFoundWords(String []sentences)
	{
		int count=0;
		List<Integer> countlist = new ArrayList<>();
		for(int i=0; i<sentences.length; i++)
		{
			String[] words = sentences[i].split(" ");
			count = words.length;
			countlist.add(count);
		}
		Collections.sort(countlist);
		return countlist.get(sentences.length-1);
	}

	public static void main(String[] args) {
		String []sentences = {"alice and bob love leetcode", "i think so too",
		"this is great thanks very much"};
		int result = new R6_MostWordsFound().mostFoundWords(sentences);
		System.out.println("result : "+result);
	}
}
