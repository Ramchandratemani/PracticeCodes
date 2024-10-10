package interviewprograms;

import java.util.Scanner;

public class SwapNumber {
	
	//swap 2 numbers
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 1st number: ");
		int a = sc.nextInt();
		System.out.println("Please enter 2nd number: ");
		int b =sc.nextInt();
		
		System.out.println("1st Number a: " + a);
		System.out.println("2nd Number b: " + b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("");
		System.out.println("After swapping using 2 variable: ");
		System.out.println("1st Number a: " + a);
		System.out.println("2nd Number b: " + b);
	
		sc.close();
	}
}
