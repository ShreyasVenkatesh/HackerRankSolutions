package com.hackerrank.algorithms.warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDiff {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int sum1=0;
        int sum2=0;

        for(int i = 0, j = n - 1; i < n; ++i, j --){
          System.out.println("a[i][i] :: " + a[i][i]);
          System.out.println("a[i][j] :: " + a[i][j]);
           sum1=sum1+a[i][i];
           sum2=sum2+a[i][j];
        }

        System.out.println(Math.abs(sum1-sum2));
        in.close();
    }
}
