package com.hackerrank.datastructures.arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayManipulation {

	public static int MAX_VALUE = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] intArray = new int[n + 1];
		for (int i = 0; i < n; i++)
			intArray[i] = 0;

		for (int a0 = 0; a0 < m; a0++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int k = in.nextInt();
			if (n >= 3) {
				intArray = arrayManipulation(intArray, a, b, k);
			}
		}

		for (int i = 0; i < n; i++)
			if (MAX_VALUE < intArray[i])
				MAX_VALUE = intArray[i];

		System.out.println(MAX_VALUE);
		in.close();
	}

	private static int[] arrayManipulation(int[] intArray, int a, int b, int k) {
		a--;
		b--;
		if (a <= b && a <= intArray.length && b <= intArray.length) {
			for (int index = a; index <= b; index++) {
				intArray[index] += k;
			}
		}
		return intArray;
	}
}
