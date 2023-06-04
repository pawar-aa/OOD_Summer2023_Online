// Author: Aashay Pawar
// NUID: 002134382

package edu.northeastern.csye6200;

import java.util.Scanner;

public class LAB3_P2 {
	public static void main(String[] args) {
		// TODO: write your code here
		System.out.println("Enter the number of values:");
		try (Scanner sc = new Scanner(System.in)) {
			int mVal[] = new int[sc.nextInt()];
			System.out.println("Enter the numbers: ");
			for(int i=0; i<mVal.length; i++)
				mVal[i] = sc.nextInt();
			boolean check = isConsecutiveFour(mVal);
			if(check)
				System.out.println("The list has consecutive fours");
			else
				System.out.println("The list has no consecutive fours");
		}
	}

	public static boolean isConsecutiveFour(int[] values) {
		// TODO: write your code here
		int mCount = 0;
		int mLast = values[0];
		for (int i = 1; i < values.length; i++){
			if (values[i] == mLast) {
				mCount++;
			} else {
				mCount = 1;
				mLast = values[i];
			}
			if (mCount == 4) {
				return true;
				}
			}
			return false;
		}
}

