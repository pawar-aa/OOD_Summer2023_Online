// Author: Aashay Pawar
// NUID: 002134382

package edu.northeastern.csye6200;

import java.util.Scanner;

public class LAB3_P1 {
	public static void main(String[] args) {
		// TODO: write your code here
		System.out.print("Enter a credit card number as a long integer: ");
		try (Scanner sc = new Scanner(System.in)) {
			long cardNo = sc.nextLong();
			boolean check = isValid(cardNo);
			if(check)
				System.out.println(cardNo + " is valid");
			else
				System.out.println(cardNo + " is invalid");
		}
	}

	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		// TODO: write your code here
		int size = getSize(number);
		boolean pValue = (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number, 6));
		int evenSum = sumOfDoubleEvenPlace(number);
		int oddSum = sumOfOddPlace(number);
		if((size >= 13 && size <= 16) && (pValue) && (pValue) && ((evenSum+oddSum)%10 == 0))
			return true;
		return false;
	}

	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		// TODO: write your code here
		String mString = number+"";
		int evenSum = 0;
		for(int i = mString.length()-2; i>=0; i-=2)
			evenSum += getDigit(Integer.parseInt(mString.charAt(i) + "")*2);
		return evenSum;
	}

	/**
	 * Return this number if it is a single digit, otherwise, return the sum of
	 * the two digits
	 */
	public static int getDigit(int number) {
		// TODO: write your code here
		if(number < 9)
			return number;
		return number/10 + number%10;
	}

	/** Return sum of odd place digits in number */
	public static int sumOfOddPlace(long number) {
		// TODO: write your code here
		String mString = number+"";
		int oddSum = 0;
		for(int i = mString.length()-1; i>=0; i-=2)
			oddSum += Integer.parseInt(mString.charAt(i) + "");
		return oddSum;
	}

	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		// TODO: write your code here
		long n = getPrefix(number, getSize(d));
		if(n == d)
			return true;
		return false;
	}

	/** Return the number of digits in d */
	public static int getSize(long d) {
		// TODO: write your code here
		String mString = d + "";
		return mString.length();
	}

	/**
	 * Return the first k number of digits from number. If the number of digits
	 * in number is less than k, return number.
	 */
	public static long getPrefix(long number, int k) {
		// TODO: write your code here
		if(getSize(number) > k) {
			String mString= number + "";
			return Long.parseLong(mString.substring(0, k));
		}
		return number;
	}
}
