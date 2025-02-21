package com.problems.commonJavaPrograms;

public class P1_Fibonacci {

    void fibonacci(int n)
    {
        int n1=0;
        int n2=1;
        int sum;

        System.out.println(n1+" "+n2);
        for(int i=2;i<=n;i++)
        {
            sum=n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        new P1_Fibonacci().fibonacci(n);
    }
}
