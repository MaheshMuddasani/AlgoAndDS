package com.mypractice.trees;

import java.util.Scanner;

public class FindProfession {
	public static void main(String args[]){
		
		Scanner st = new Scanner(System.in);
		int testcases = st.nextInt();
		
		while(testcases-->0){
			int level = st.nextInt();
			int pos = st.nextInt();
			System.out.println(findProfession(level, pos)=='E'?"Engineer":"Doctor");
		}
		st.close();
	}
	public static char findProfession(int level,int pos){
		if(level == 1){
			return 'E';
		}
		
		char prof = findProfession(level-1,(pos+1)/2);
				if(prof=='E'){
					return pos%2==1?'E':'D';
				}else{
					return pos%2==1?'D':'E';
				}
		
	}
}



