package com.hackerrank.algorithms.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for (int arr_i = 0; arr_i < n; arr_i++) {
      arr[arr_i] = in.nextInt();
    }
    DecimalFormat decimalFormat = new DecimalFormat("0.000000");
    double posCount = 0,negCount = 0,zeroCount = 0;
    for(int number : arr){
      if(number > 0){
        posCount++;
      }
      else if(number < 0){
        negCount++;
      }
      else{
        zeroCount++;
      }
    }
    System.out.println(decimalFormat.format(posCount/n));
    System.out.println(decimalFormat.format(negCount/n));
    System.out.println(decimalFormat.format(zeroCount/n));
    in.close();
  }

}
