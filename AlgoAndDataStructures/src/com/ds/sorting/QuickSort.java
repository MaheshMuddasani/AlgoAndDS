package com.mypractice.sorting;

public class QuickSort {

	private static int a[] = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort(a);
		for(int i:a){
			System.out.println(a[i]);
		}
	}

	private static void sort(int[] a) {
		// TODO Auto-generated method stub
		int length=a.length;
		int low = 0;
		int high = length;
		quickSort(low,high-1);
	
	}

	private static void quickSort(int i, int j) {
		int low=i;
		int high=j;
		// TODO Auto-generated method stub
		int pivotEle = a[low+(high-low)/2];
		while(low<=high){
			while(a[low]<pivotEle){
				low++;
			}
			while(a[high]>pivotEle){
				high--;
			}
			if(low<=high){
				swap(low,high);
				low++;
				high--;
			}
		}
		if(j<low){
			quickSort(j, low);
		}
		if(high<i){
			quickSort(high, i);
		}
		
	}

	private static void swap(int low, int high) {
		// TODO Auto-generated method stub
		int temp = a[low]; 
		a[low] = a[high]; 
		a[high] = temp;
	}

}
