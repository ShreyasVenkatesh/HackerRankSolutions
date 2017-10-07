package com.hackerrank.algorithms.warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    static String timeConversion(String s) {
    	SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
    	SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
    	Date inpDate = null;
		try {
			inpDate = inputFormat.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return outputFormat.format(inpDate);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }

}
