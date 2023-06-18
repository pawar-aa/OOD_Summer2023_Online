package edu.northeastern.csye6200;

public class LAB5P1 {
	public static void main(String[] args) {
		// TODO: write your code here
		try {
			//create two objects of type MyInteger
			MyInteger m1 = new MyInteger(7);
			MyInteger m2 = new MyInteger(24);
			char[] charArr = { '4', '3', '7', '8'};
			System.out.println("n1 is even? " + m1.isEven());
			System.out.println("n1 is prime? " + m1.isPrime()); 
			System.out.println("15 is prime? " + MyInteger.isPrime(15)); 
			System.out.println("parseInt(char[]) for \"{ '4', '3', '7', '8' }\" = " + MyInteger.parseInt(charArr)); 
			System.out.println("parseInt(String) for \"4378\" = " + MyInteger.parseInt("4378"));
			System.out.println("n2 is odd? " + MyInteger.isOdd(45));
			System.out.println("45 is equal to n2? " + m1.equals(m2));
			System.out.println("n1 is equal to 5? " + m1.equals(5)); 
			System.out.println("n1 is odd? " + m2.isOdd());
		}
		catch(Exception e) { 
			System.out.print(e);
		}
	}
}

class MyInteger {
	
	// TODO: write your code here
	int mValue;
	
	public int getValue() {
		// TODO: write your code here
		return mValue;
	}

	public MyInteger(int value) {
		// TODO: write your code here
		this.mValue = value;
	}

	public boolean isPrime() {
		// TODO: write your code here
		return isPrime(this.mValue);
	}

	public static boolean isPrime(int num) {
		// TODO: write your code here
		if(num < 1 || num == 1) return false;
		for(int i = 2; i < num/2; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}

	public static boolean isPrime(MyInteger o) {
		// TODO: write your code here
		return isPrime(o.mValue);
	}

	public boolean isEven() {
		// TODO: write your code here
		return mValue % 2 == 0;
	}

	public boolean isOdd() {
		// TODO: write your code here
		return mValue % 2 != 0;
	}

	public static boolean isEven(int n) {
		// TODO: write your code here
		return n%2 == 0;
	}

	public static boolean isOdd(int n) {
		// TODO: write your code here
		return !isEven(n);
	}

	public static boolean isEven(MyInteger n) {
		// TODO: write your code here
		return n.isEven();
	}

	public boolean equals(int anotherNum) {
		// TODO: write your code here
		return this.mValue == anotherNum;
	}

	public boolean equals(MyInteger o) {
		// TODO: write your code here
		return this.mValue == o.mValue;
	}

	public static int parseInt(char[] numbers) {
		// numbers consists of digit characters.
		// For example, if numbers is {'1', '2', '5'}, the return value
		// should be 125. Please note that
		// numbers[0] is '1'
		// numbers[1] is '2'
		// numbers[2] is '5'

		// TODO: write your code here
		return Integer.parseInt(new String(numbers));

	}

	public static int parseInt(String s) {
		// s consists of digit characters.
		// For example, if s is "125", the return value
		// should be 125.
		
		// TODO: write your code here
		return Integer.parseInt(s);
	}
}