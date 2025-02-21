package com.Revision;

public class InterviewQ6_FactorizeTwoStrings {
	
	public int factorizeTwoStrings(String str1, String str2) {
		int commonStringLength = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str2.contains(str1.substring(i))) {
				commonStringLength = str1.substring(i).length();
				break;
			}
		}
		return commonStringLength;
	}
	
	public String comparison(String str1, String str2) {
		int result1 = new InterviewQ6_FactorizeTwoStrings().factorizeTwoStrings(str1, str2);
		int result2 = new InterviewQ6_FactorizeTwoStrings().factorizeTwoStrings(str2, str1);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		if (result1 > result2) {
			return str1 + str2.substring(result1);
		} else {
			return str2 + str1.substring(result2);
		}
	}
	
	public static void main(String[] args) {
//		String str1 = "1234yyabc";
//		String str2 = "abcxxxx1234";
		String str1 = "something from something";
		String str2 = "something leaves something";
		String finalResult = new InterviewQ6_FactorizeTwoStrings().comparison(str1, str2);
		System.out.println("finalResult : " + finalResult);
	}
}
