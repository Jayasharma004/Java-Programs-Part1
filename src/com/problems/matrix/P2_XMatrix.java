package com.problems.matrix;

/**
 * https://leetcode.com/problems/check-if-matrix-is-x-matrix/description/
 */
public class P2_XMatrix {
	public boolean checkXMatrix(int[][] grid) {

		for(int i=0;i<grid.length;i++)
		{
			for(int j=0; j<grid[i].length;j++)
			{
				if(i==j)
				{
					if((grid[i][j]==0))
					{
						return false;
					}
				}
			}
		}
		for(int i=0; i<grid.length; i++)
		{
			for(int j=grid[i].length-1-i;j>=0;j--)
			{
				if((grid[i][j]==0))
				{
					return false;
				}
				break;
			}
		}
		for(int i=0; i<grid.length; i++)
		{
			for(int j=0; j<grid[i].length; j++)
			{
				if ((i!=j) && (j!=grid[i].length-1-i))
				{
					System.out.println("grid[i][j] : "+grid[i][j]+" i : "+i+" j : "+j);
					if (grid[i][j] != 0)
					{
						return false;
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		//int[][]grid = {{5,7,0},{0,3,1},{0,5,0}};
		//int[][]grid = {{5,0,0,1},{0,4,1,5},{0,5,2,0},{4,1,0,2}};
		int[][]grid = {{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
		boolean result = new P2_XMatrix().checkXMatrix(grid);
		System.out.println("result : "+result);
	}

}
