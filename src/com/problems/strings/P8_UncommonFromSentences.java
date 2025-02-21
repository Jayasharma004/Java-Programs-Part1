package com.problems.strings;

import java.util.*;

/**
 * https://leetcode.com/problems/uncommon-words-from-two-sentences/
 */
public class P8_UncommonFromSentences {

	public String[] uncommonFromSentences(String s1, String s2) {
		String[] sen1 = s1.split(" ");
		String[] sen2 = s2.split(" ");
		Map<String,Integer> map1 = new HashMap<>();
		Map<String,Integer> map2 = new HashMap<>();
		List<String> result = new ArrayList<>();

		for(int i=0; i<sen1.length; i++)
		{
			if(map1.containsKey(sen1[i]))
			{
				map1.put(sen1[i], map1.get(sen1[i])+1);
			}
			else
			{
				map1.put(sen1[i],1 );
			}
		}
		System.out.println("map1 : "+map1);

		for(int i=0; i<sen2.length; i++)
		{
			if(map2.containsKey(sen2[i]))
			{
				map2.put(sen2[i], map2.get(sen2[i])+1);
			}
			else
			{
				map2.put(sen2[i],1 );
			}
		}
		System.out.println("map2 : "+map2);

		for(int i=0; i<sen2.length; i++)
		{
			if(!map1.containsKey(sen2[i]) && map2.get(sen2[i])==1)
			{
				result.add(sen2[i]);
			}
		}

		for(int i=0; i<sen1.length; i++)
		{
			if(!map2.containsKey(sen1[i]) && map1.get(sen1[i])==1)
			{
				result.add(sen1[i]);
			}
		}

		String[] resultArray = result.stream().toArray(String[]:: new);
		return resultArray;

	}

	public static void main(String[] args) {
		String s1 = "this apple is sweet";
		String s2 = "this apple is sour";

		//String s1 ="apple apple";
		//String s2 = "banana";
		String[] resultArray = new P8_UncommonFromSentences().uncommonFromSentences(s1,s2);
		System.out.println("resultArray : "+Arrays.toString(resultArray));
	}
}
