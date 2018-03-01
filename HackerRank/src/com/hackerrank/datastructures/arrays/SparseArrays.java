package com.hackerrank.datastructures.arrays;

import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nStrings = Integer.parseInt(scanner.nextLine());
		String[] strArray = new String[nStrings];
		for (int strIndex = 0; strIndex < nStrings; strIndex++) {
			strArray[strIndex] = scanner.nextLine();
		}
		int nQueries = Integer.parseInt(scanner.nextLine());

		String[] querArray = new String[nQueries];
		for (int querIndex = 0; querIndex < nQueries; querIndex++) {
			querArray[querIndex] = scanner.nextLine();
		}
		for (int queryIndex = 0; queryIndex < querArray.length; queryIndex++) {
			int querCount = 0;
			for (int strgIndex = 0; strgIndex < strArray.length; strgIndex++) {
				if (querArray[queryIndex].equals(strArray[strgIndex])) {
					querCount++;
				}
			}
			System.out.println(querCount);
			querCount = 0;
		}
		scanner.close();
	}

}
