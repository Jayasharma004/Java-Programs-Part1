package com.problems.strings;

public class P2_FinalValueAfterOperations {
	/**
	 * https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
	 * @param operations
	 * @return
	 */
	public int finalValueAfterOperations(String[] operations) {
		int value=0;
		for(int i=0;i<operations.length;i++)
		{
			 if(operations[i].charAt(1)=='+')
			 {
				 value++;
			 }
			 else
			 {
				 value--;
			 }
		}
		return value;
	}

	public static void main(String[] args) {
		String[] operations = {"--X","X++","X++"};
		int value = new P2_FinalValueAfterOperations().finalValueAfterOperations(operations);
		System.out.println("final value of X : "+value);
	}
}
