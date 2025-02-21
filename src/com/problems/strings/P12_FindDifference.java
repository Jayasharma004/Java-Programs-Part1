package com.problems.strings;

import java.util.HashMap;
import java.util.Map;

public class P12_FindDifference {

	public char findTheDifference(String s, String t) {
		char[] s1 = s.toCharArray();
		char[] t1 = t.toCharArray();
		Map<Character, Integer> map_s_chars = new HashMap<>();
		Map<Character, Integer> map_t_chars = new HashMap<>();
		char result = '\0';

		for (int i = 0; i < s1.length; i++) {
			if (map_s_chars.containsKey(s1[i])) {
				map_s_chars.put(s1[i], map_s_chars.get(s1[i]) + 1);
			} else {
				map_s_chars.put(s1[i], 1);
			}
		}

		for(int i=0; i< t1.length; i++)
		{
			System.out.println("map_s_chars : "+map_s_chars);
			if(!map_s_chars.containsKey(t1[i]))
			{
				result = t1[i];
			}
			if(map_s_chars.containsKey(t1[i]) && map_s_chars.get(t1[i])!=0)
			{
				int count = map_s_chars.get(t1[i]) -1;
				map_s_chars.put(t1[i],count);
			}
			else if(map_s_chars.containsKey(t1[i]) && map_s_chars.get(t1[i])==0)
			{
				map_s_chars.remove(t1[i]);
				result = t1[i];
			}
		}

//		for (int i = 0; i < t1.length; i++) {
//			if (map_t_chars.containsKey(t1[i])) {
//				map_t_chars.put(t1[i], map_t_chars.get(t1[i]) + 1);
//			} else {
//				map_t_chars.put(t1[i], 1);
//			}
//		}


//		for (char key : map_t_chars.keySet()) {
//			if ((!map_s_chars.containsKey(key)) || (map_t_chars.get(key) == map_s_chars.get(key) + 1)) {
//				result = key;
//				break;
//			}
//		}
		return result;
	}

	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
//		String s = "a";
//		String t = "aa";
		char result = new P12_FindDifference().findTheDifference(s, t);
		System.out.println("result : " + result);
	}
}
