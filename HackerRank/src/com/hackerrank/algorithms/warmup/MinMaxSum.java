package com.hackerrank.algorithms.warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        long[] sumArray = new long[5];
        long[] longArray = new long[5];
        int index =0;
        for(int number : arr){
          longArray[index++] = number;
        }
        sumArray[0] = longArray[1] + longArray[2] + longArray[3] + longArray[4];
        sumArray[1] = longArray[0] + longArray[2] + longArray[3] + longArray[4];
        sumArray[2] = longArray[0] + longArray[1] + longArray[3] + longArray[4];
        sumArray[3] = longArray[0] + longArray[1] + longArray[2] + longArray[4];
        sumArray[4] = longArray[0] + longArray[1] + longArray[2] + longArray[3];
        Arrays.sort(sumArray);
        System.out.print(sumArray[0]+" "+sumArray[4]);
        in.close();
    }
}
