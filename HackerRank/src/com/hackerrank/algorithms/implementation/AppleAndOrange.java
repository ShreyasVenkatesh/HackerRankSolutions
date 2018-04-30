package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleAndOrange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] apple = new int[m];
		for (int apple_i = 0; apple_i < m; apple_i++) {
			apple[apple_i] = in.nextInt();
		}
		int[] orange = new int[n];
		for (int orange_i = 0; orange_i < n; orange_i++) {
			orange[orange_i] = in.nextInt();
		}
		countApplesAndOranges(s, t, a, b, apple, orange);
		in.close();
	}

	private static void countApplesAndOranges(int s, int t, int a, int b,
			int[] apple, int[] orange) {

		int appleCount = 0, orangeCount = 0;
		for (int appleIndex = 0; appleIndex < apple.length; appleIndex++) {
			if((a + apple[appleIndex]) >= s && (a + apple[appleIndex]) <= t){
				appleCount++;
			}
		}
		for (int orangeIndex = 0; orangeIndex < orange.length; orangeIndex++) {
			if((b + orange[orangeIndex]) >= s && (b + orange[orangeIndex]) <= t){
				orangeCount++;
			}
		}	
		System.out.println(appleCount);
		System.out.println(orangeCount);

	}
}
