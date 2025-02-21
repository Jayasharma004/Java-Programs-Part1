package com.oracle;

import java.util.Arrays;

public class Oracle_ChessBoard {

	public void BlackWhiteChessBoard(int size)
	{
		String[][] board = new String[size][size];
		boolean isWhite = false;
		for(int y = 0; y < board.length; y++)
		{
			isWhite = !isWhite;
			for(int x = 0; x < board[y].length; x++)
			{
				if(isWhite)
				{
					board[y][x] = "W";
				}
				if(!isWhite)
				{
					board[y][x] = "B";
				}
				isWhite = !isWhite;
			}
		}
		
		/*This is the print statment*/
		for(int i = 0; i < board.length; i++)
		{
			System.out.println(Arrays.toString(board[i]));
		}
	}
	
	public static void main(String[] args) {
		new Oracle_ChessBoard().BlackWhiteChessBoard(5);
	}
}
