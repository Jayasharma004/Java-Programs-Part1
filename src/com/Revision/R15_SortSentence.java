package com.Revision;

//https://leetcode.com/problems/sorting-the-sentence/
public class R15_SortSentence {
	public String sortSentence(String s) {
		String[] words = s.split(" ");
		String[] resultArr = new String[words.length];
		
		for (int i = 0; i < words.length; i++) {
			String positionWord = words[i].substring(words[i].length() - 1);
			int position = Integer.parseInt(positionWord);
			resultArr[position - 1] = words[i].substring(0, words[i].length() - 1);
		}
		return String.join(" ", resultArr);
	}
	
	public static void main(String[] args) {
		String s = "is2 sentence4 This1 a3";
		String result = new R15_SortSentence().sortSentence(s);
		System.out.println("result : " + result);
	}
}
