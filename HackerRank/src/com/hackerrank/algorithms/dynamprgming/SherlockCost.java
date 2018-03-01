package com.hackerrank.algorithms.dynamprgming;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class SherlockCost {

	public static void main(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int noOfTestCases = scanner.nextInt();
		for (int index = 0; index < noOfTestCases; index++) {
			int numOfValues = scanner.nextInt();
			int[] valuesArray = new int[numOfValues];
			int arraySum = 0;
			for (int numIndex = 0; numIndex < numOfValues; numIndex++) {
				valuesArray[numIndex] = scanner.nextInt();
			}
			int[] sherlockArray = new int[numOfValues];
			for (int sherIndex = 0; sherIndex < numOfValues; sherIndex++) {
				int tempVal = valuesArray[sherIndex];
				if (sherIndex == 0) {
					sherlockArray[sherIndex] = tempVal > 0 ? tempVal : 1;
				}else{
				}
			}
//			arraySum = IntStream.of(valuesArray).sum();
			System.out.println(arraySum);
		}
		scanner.close();

	}

}
