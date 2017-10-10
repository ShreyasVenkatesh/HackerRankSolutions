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
	    for(int i=0;i < t;i++){
	    	int n = in.nextInt();
	    	int[] inpArr = new int[n]; 
	    	for(int j=0 ; j< n ; j++){
	    		inpArr[j] = in.nextInt();
	    	}
	    	equalDistribution(inpArr);
	    }
	}

	private static void equalDistribution(int[] inpArr) {
		while(!isAllEqual(inpArr)){
		Arrays.sort(inpArr);
		int maxValue = inpArr[inpArr.length -1];
		int minValue = inpArr[0];
		int diffVal = maxValue - minValue;
		switch (diffVal) {
		case 1:
			incrementByOne(inpArr.length -1);
			break;
		case 2:
			incrementByTwo(inpArr.length -1);
			break;
		case 5:
			incrementByFive(inpArr.length -1);
			break;
		default:
			incrementByFive(inpArr.length -1);
			break;
		}
		}
	}
	
	
    private static void incrementByFive(int i) {
		// TODO Auto-generated method stub
		
	}

	private static void incrementByTwo(int i) {
		// TODO Auto-generated method stub
		
	}

	private static void incrementByOne(int i) {
		// TODO Auto-generated method stub
		
	}

	public static boolean isAllEqual(int[] a){
        for(int i=1; i<a.length; i++){
            if(a[0] != a[i]){
                return false;
            }
        }

        return true;
    }

}
