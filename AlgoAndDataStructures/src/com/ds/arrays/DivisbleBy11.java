package com.ds.arrays;

import java.util.*;
import java.lang.*;
import java.io.*;

public class DivisbleBy11 {
	public static int checkDivisible (String number) {
		//code
		
		char charArray[]=number.toCharArray();
		int evenSum=0,oddSum=0;
		for(int i=0;i<charArray.length;i++){
			if(i%2==0){
				evenSum+= Integer.parseInt(charArray[i]+"");
			}else{
				oddSum+= Integer.parseInt(charArray[i]+"");
			}
		}
		
		System.out.println("Evensum"+evenSum);
		if(((evenSum-oddSum)%11)==0){
		    return 1;
		}else{
		      return 0;
		}
		
		
	}
	
	  public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t > 0)
        {
        	String num = sc.next();
            System.out.println(checkDivisible(num));
            t--;
        }
    }
}
