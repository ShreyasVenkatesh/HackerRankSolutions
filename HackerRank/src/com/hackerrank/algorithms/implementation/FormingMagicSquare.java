package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FormingMagicSquare {

	static int formingMagicSquare(int[][] s) {
		int costCount = 0;
		boolean isMs1Equal = false, isMs2Equal = false, isMs3Equal = false;
		int row1Sum = getRowCount(s, 0);
		int row2Sum = getRowCount(s, 1);
		int row3Sum = getRowCount(s, 2);
		int col1Sum = getColCount(s, 0);
		int col2Sum = getColCount(s, 1);
		int col3Sum = getColCount(s, 2);
		int diag1Sum = getDiagCount(s, 1);
		int diag2Sum = getDiagCount(s, 2);
		if (row1Sum == col1Sum && col1Sum == diag1Sum) {
			System.out.println("1st magic square is equal");
			isMs1Equal = true;
		}
		if (row2Sum == col2Sum) {
			System.out.println("2nd magic square is equal");
			isMs2Equal = true;
		}

		if (row3Sum == col3Sum && col3Sum == diag2Sum) {
			System.out.println("3rd magic square is equal");
			isMs3Equal = true;
		}

		if (!isMs1Equal || !isMs2Equal || !isMs3Equal) {
			System.out.println("NOt a magic square");
			// Magic Square 1 and 2 are equal, correct 3 Square
			if (!isMs1Equal && isMs2Equal && !isMs3Equal) {
				System.out.println("only magic square 2 is equal");
				if (row2Sum == row1Sum && row2Sum == col1Sum) {
					s[2][2] += row2Sum - diag1Sum;
					costCount += row2Sum - diag1Sum;
				} else if (row2Sum == diag1Sum && row2Sum == col1Sum) {
					s[0][2] += row2Sum - row1Sum;
					costCount += row2Sum - row1Sum;
				} else if (row2Sum == diag1Sum && row2Sum == row1Sum) {
					s[2][0] += row2Sum - col1Sum;
					costCount += row2Sum - col1Sum;
				}
			}
		}
		return costCount;
	}

	static int getRowCount(int[][] s, int rowNum) {
		return s[rowNum][0] + s[rowNum][1] + s[rowNum][2];
	}

	static int getColCount(int[][] s, int colNum) {
		return s[0][colNum] + s[1][colNum] + s[2][colNum];
	}

	static int getDiagCount(int[][] s, int diagNum) {
		int diagCount = 0;
		if (diagNum == 1) {
			diagCount = s[0][0] + s[1][1] + s[2][2];
		} else if (diagNum == 2) {
			diagCount = s[2][0] + s[1][1] + s[0][2];
		}
		return diagCount;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] s = new int[3][3];
		for (int s_i = 0; s_i < 3; s_i++) {
			for (int s_j = 0; s_j < 3; s_j++) {
				s[s_i][s_j] = in.nextInt();
			}
		}
		int result = formingMagicSquare(s);
		System.out.println(result);
		for (int s_i = 0; s_i < 3; s_i++) {
			for (int s_j = 0; s_j < 3; s_j++) {
				System.out.print(s[s_i][s_j]);
			}
			System.out.print("\n");
		}
		in.close();
	}
}
