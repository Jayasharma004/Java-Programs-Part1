package com.Revision;

public class R3_FibonacciSeries {
	public void fibonacci()
	{
		int n1=0, n2=1, count=10;
		System.out.print(n1+" "+n2);
		for(int i=2; i<count; i++)
		{
			int n3 = n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	public static void main(String[] args) {
		new R3_FibonacciSeries().fibonacci();
	}
}
