package com.problems.strings;

public class P10_ImplementationOfStartsWith {

	public static void main(String[] args) {
		String s = "aruhfwhefkw";
		String pref = "ar";
		boolean flag = true;
		for(int i=0; i<pref.toCharArray().length; i++)
		{
			if(!(s.charAt(i) == pref.charAt(i)))
			{
				flag = false;
				break;
			}
		}
		System.out.println("flag : "+flag);
	}
}
