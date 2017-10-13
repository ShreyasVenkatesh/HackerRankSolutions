package com.hackerrank.algorithms.dynamprgming;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Equal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int[] inpArr = new int[n];
			for (int j = 0; j < n; j++) {
				inpArr[j] = in.nextInt();
			}
			System.out.println(equalDistribution(inpArr));
		}
	}

	private static int equalDistribution(int[] inpArr) {
		int noOfOperations = 0;
		while (!isAllEqual(inpArr)) {
			Arrays.sort(inpArr);
			int lastIndex = inpArr.length - 1;
			int maxValue = inpArr[lastIndex];
			int minValue = inpArr[0];
			int diffVal = maxValue - minValue;
			switch (diffVal) {
			case 1:
				incrementByNumber(inpArr,1);
				noOfOperations++;
				break;
			case 2:
			case 3:
			case 4:
				incrementByNumber(inpArr,2);
				noOfOperations++;
				break;
			case 5:
				incrementByNumber(inpArr,5);
				noOfOperations++;
				break;
			default:
				incrementByNumber(inpArr,5);
				noOfOperations++;
				break;
			}
		}
		return noOfOperations;
	}

	private static void incrementByNumber(int[] inpArr, int number) {
		for (int index = 0; index < inpArr.length - 1; index++) {
			inpArr[index] += number;
		}
	}

	public static boolean isAllEqual(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[0] != a[i]) {
				return false;
			}
		}
		return true;
	}

}
