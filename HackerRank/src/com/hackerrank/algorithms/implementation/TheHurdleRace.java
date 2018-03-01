package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheHurdleRace {

	static int hurdleRace(int k, int[] height) {
		int max = 0, noOfBev = 0;
		for (int i = 0; i < height.length; i++) {
			max = Math.max(max, height[i]);
		}
		if (max - k > 0) {
			noOfBev = Math.abs(max - k);
		}
		return noOfBev;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] height = new int[n];
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
		}
		int result = hurdleRace(k, height);
		System.out.println(result);
		in.close();
	}

}
