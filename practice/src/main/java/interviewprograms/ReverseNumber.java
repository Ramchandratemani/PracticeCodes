package interviewprograms;

import java.util.Scanner;

public class ReverseNumber {
	
	// To reverse a Number
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number to be reversed: ");
		int num = sc.nextInt();
		int rev = 0;
		System.out.println("Original Number: " + num);
		
		while(num > 0) {
			int b = num % 10;
			rev = rev * 10 + b;
			num /= 10;
		}

		System.out.println("Reversed number is: " + rev);
		
		sc.close();

	}

}
