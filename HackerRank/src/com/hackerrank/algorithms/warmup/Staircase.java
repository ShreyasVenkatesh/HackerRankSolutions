package com.hackerrank.algorithms.warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int j=n-1;j >= 0;j--){
        int tempIndex = 0;
        int tempJ = n-1;
      while(tempIndex < j){
        System.out.print(" ");
        tempIndex++;
      }
      while(tempJ >= j){
        System.out.print("#");
        tempJ--;
      }
      System.out.print("\n");
    }
    in.close();
  }

}
