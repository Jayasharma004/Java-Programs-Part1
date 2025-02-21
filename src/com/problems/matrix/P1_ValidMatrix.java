package com.problems.matrix;

import java.util.HashSet;
import java.util.Set;

public class P1_ValidMatrix {

	public Set<Integer> bucket (int length)
	{
		Set<Integer> set = new HashSet<>();
		for(int i=1; i<=length; i++)
		{
			set.add(i);
		}
		return set;
	}
	public boolean checkValid(int[][] matrix) {
		int n= matrix.length;

		//ROW BASED
		for(int i=0; i<matrix.length;i++)
		{
			Set<Integer> rowSet = bucket(matrix.length);
			Set<Integer> colSet = bucket(matrix.length);

			for(int j=0; j<matrix[i].length; j++)
			{
				if(rowSet.contains(matrix[i][j]))
				{
					rowSet.remove(matrix[i][j]);
				}
				else
				{
					return false;
				}
				if(colSet.contains(matrix[j][i]))
				{
					colSet.remove(matrix[j][i]);
				}
				else
				{
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int [][]matrix = {{1,1,1},{1,2,3},{1,2,3}};
		boolean result = new P1_ValidMatrix().checkValid(matrix);
		System.out.println("result : "+result);
	}
}
