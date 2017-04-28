package com.ds.arrays;

public class FindFrequencyInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};
		int sortedArray[] = sortArray(a,0,0);
		findCountOfOccurence(sortedArray);
	}

	private static void findCountOfOccurence(int[] sortedArray) {
		// TODO Auto-generated method stub
		
	}

	private static int[] sortArray(int[] arr,int index,int counter) {
		
	     int n = arr.length;  
	        int temp = 0;  
	        int swapped = 1;
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i) && swapped==1; j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp; 
	                                 swapped=1;
	                         }  
	                          
	                 }  
	         }  
		return arr;
	}

}

/*int nextCounter  = 1;
int i=0;
while(i<a.length){
	if(a[i] == a[nextCounter]){
		int temp = a[nextCounter];
		a[i+1] = a[i];
		a[nextCounter]=temp;
		i++;
		System.out.println(a[i]);
	}else{
		nextCounter++;
	}
}*/
