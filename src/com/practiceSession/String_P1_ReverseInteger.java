package com.practiceSession;

public class String_P1_ReverseInteger {
	public static int reverse(int x) {
		int reversed = 0;
		while (x != 0)
		{
			int digit = x % 10;
			x = x/10;
			
			// Check for overflow before multiplying and adding
			if (reversed > Integer.MAX_VALUE / 10 ||
			(reversed == Integer.MAX_VALUE / 10 && digit > 7))
			{
				return 0; // Overflow
			}
			
			if (reversed < Integer.MIN_VALUE / 10 ||
			(reversed == Integer.MIN_VALUE / 10 && digit < -8))
			{
				return 0; // Underflow
			}
			reversed = reversed * 10 + digit;
		}
		return reversed;
	}
	
	public static void main(String[] args) {
		int x1 = 123;
		int x2 = -123;
		int x3 = 120;
		
		System.out.println("Input: " + x1 + " Output: " + reverse(x1)); // Output: 321
		System.out.println("Input: " + x2 + " Output: " + reverse(x2)); // Output: -321
		System.out.println("Input: " + x3 + " Output: " + reverse(x3)); // Output: 21
	}
}
