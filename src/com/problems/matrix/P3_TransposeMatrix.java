package com.problems.matrix;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/transpose-matrix/
 */
public class P3_TransposeMatrix {

	public int[][] transpose(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		int[][] resultGrid = new int[cols][rows];
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				resultGrid[col][row] = matrix[row][col];
			}
		}

		return resultGrid;
	}

	public int[][] transpose1(int[][] A) {
		int M = A.length;
		int N = A[0].length;

		int[][] B = new int[N][M];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				B[j][i] = A[i][j];
			}
		}
		return B;
	}

	public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		int[][] result = new P3_TransposeMatrix().transpose(matrix);
		int[][] result1 = new P3_TransposeMatrix().transpose1(matrix);
		System.out.println("result : " + Arrays.toString(result));

		for (int[] arr : result) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println();
		for (int[] arr : result1) {
			System.out.println(Arrays.toString(arr));
		}
	}

}
