package com.mypractice.trees;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st = new Scanner(System.in);
		int testCases = st.nextInt();
		while(testCases>0){
			int arraySize = st.nextInt();
			int array[] = new int[arraySize];
			for(int i=0;i<array.length;i++){
				array[i] = st.nextInt();
			}
			int findElement = st.nextInt();
			System.out.println(bin_search(array, 0, array.length-1, findElement));
		}
		
	}

	public static int bin_search(int a[], int left, int right,  int k)
	{
		// Your code here
		
		
		while(left<=right){
			int mode = left+(right-left)/2;
			if(a[mode]==k){
				return 0;
			}else if(a[mode]<k){
				left = mode+1;
			}else{
				right=mode-1;
			}
		}
		return -1;
	}
}
