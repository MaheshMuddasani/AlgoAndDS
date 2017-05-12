package com.practice.geekforGeeks.amazon;

import java.util.Scanner;

public class CheckFirstAndLastNumbersSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int testcases = s.nextInt();
		while(testcases>0){
			int fromNumber = s.nextInt();
			int toNumber = s.nextInt();
			System.out.println(checkFirstAndLastNumbersSame(fromNumber,toNumber));
			testcases--;
		}
		s.close();
	}

	private static int checkFirstAndLastNumbersSame(int fromNumber,int toNumber) {
		// TODO Auto-generated method stub
		int count=0;
		
		if(fromNumber<10){
			count=count+(10-fromNumber);
			fromNumber=11;
		}
		
	for(int num=fromNumber;num<=toNumber;num++){
		
		int firstnum = num%10;
		int temp = num;
		int value = 0;
		while(temp>0){
			value = temp%10;
			temp = temp/10;
		}
		if(firstnum==value){
			count++;
		}
		
	}
	return count;
	}
	
	
}
