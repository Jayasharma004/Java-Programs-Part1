package com.problems.commonJavaPrograms;

public class P3_StringPalindrome {

    void stringPalindrome(String str) {
        String reverse = "";
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
//            reverse = reverse + str.charAt(i);
            result.append(str.charAt(i));
        }
        if (result.toString().equals(str)) {
            System.out.println("String is PALINDROME");
        } else {
            System.out.println("String is not PALINDROME");
        }

        System.out.println(str.equals(str));
    }

    public static void main(String[] args) {
        String str1 = "jayaj";
        String str2 = "naman";
        new P3_StringPalindrome().stringPalindrome(str1);
//        new P3_StringPalindrome().stringPalindrome(str2);
    }
}
