package com.hackerrank.java.strings;
import java.util.*;

public class Solution {

	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        String B=sc.next();
//        String result = A.compareTo(B) > 0 ? "Yes":"No" ;
//        System.out.println(A.length()+B.length());
//        System.out.println(result);
//        System.out.println(camelCase(A)+" " + camelCase(B));
        
        String S = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(S.substring(start, end));
        
        sc.close();
	}

	private static String camelCase(String inputStr) {
		char[] tempArr = inputStr.toCharArray();
		String str = Character.valueOf(tempArr[0]).toString().toUpperCase();
		tempArr[0] = str.toCharArray()[0];
		String outputStr = String.copyValueOf(tempArr);
		return outputStr;
	}
	
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] strArr = new String[100];
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'   
        int startIndex = 0;
        int endIndex = k;
        for(int i = 0; i < s.length()-1 ; i++){
        	startIndex += i;
        	endIndex += i;
        	if(endIndex - startIndex == k){
        		strArr[i]= s.substring(startIndex, endIndex);
        	}
        }
        for(int index = 0; index < strArr.length; index++){
        	for(int indexN = index + 1 ; indexN < strArr.length; indexN++){
//            	if(strArr[index] < strArr[])
        		
        	}
        }
        return smallest + "\n" + largest;
    }
}
