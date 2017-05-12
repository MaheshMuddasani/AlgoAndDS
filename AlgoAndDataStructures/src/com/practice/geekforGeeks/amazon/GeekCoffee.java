package com.practice.geekforGeeks.amazon;

import java.util.Scanner;

public class GeekCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int testcases = s.nextInt();
		while(testcases>0){
			int initialunits = s.nextInt();
			int refillCount = s.nextInt();
			System.out.println(calculateUnitsOfCoffe(initialunits,refillCount,1));
			testcases--;
		}
	}

	private static int calculateUnitsOfCoffe(int initialunits, int refillCount, int countunits) {
		// TODO Auto-generated method stub
		if(countunits==refillCount){
			return initialunits;
		}
		return calculateUnitsOfCoffe(initialunits/2, refillCount,++countunits);
	}

}
