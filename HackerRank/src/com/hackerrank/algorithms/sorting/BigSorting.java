package com.hackerrank.algorithms.sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigSorting {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	    List<BigInteger> bigIntArr = new ArrayList<BigInteger>();
	    for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
			bigIntArr.add(new BigInteger(in.next()));
		}
		Collections.sort(bigIntArr);
		bigIntArr.forEach((element) -> System.out.println(element));
		in.close();
	}
}