package com.hackerrank.algorithms.warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCandles {

	static int birthdayCakeCandles(int n, int[] ar) {
		Arrays.sort(ar);
		int maxCandleCount = 0, maxValue =0;
		for (int index = ar.length - 1; index >= 0; index--) {
			if (index == ar.length - 1) {
				maxCandleCount++;
				maxValue = ar[index];
			}
			else if (maxValue == ar[index]) {
				maxCandleCount++;
			}
		}
		return maxCandleCount;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = birthdayCakeCandles(n, ar);
		System.out.println(result);
		in.close();
	}

}
