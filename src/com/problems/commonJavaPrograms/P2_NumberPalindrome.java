package com.problems.commonJavaPrograms;

public class P2_NumberPalindrome {
    void palindrome(int n)
    {
        int temp;
        int sum=0;
        int r;

        temp=n;
        while(n>0)
        {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }

        if(temp==sum)
        {
            System.out.println("Number is PALINDROME");
        }
        else
        {
            System.out.println("Number is not PALINDROME");
        }
    }
    public static void main(String[] args) {
        int n=676;
        new P2_NumberPalindrome().palindrome(n);
    }
}
