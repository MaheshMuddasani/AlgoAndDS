package com.mypractice.arrays;

import java.util.Scanner;

public class palindrome {
	
	public static void main(String args[]){
		
		Scanner st = new Scanner(System.in);
		int testCases = st.nextInt();
		while(testCases-->0){
			int num = st.nextInt();
			int temp = num;
			int revnum=0;
			int sum=0;
			while(num>0){
				revnum = (num%10);
				sum=(sum*10)+revnum;
				num=num/10;
				
			}
			if(temp==sum){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			} 
		}
		
		st.close();
	}
}
