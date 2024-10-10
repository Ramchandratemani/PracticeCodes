package interviewprograms;

import java.util.Scanner;

public class PalindromeNumber {

		//Palindrome Number
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a numbe to check if it is Palindrome or not: ");
		int num = sc.nextInt();
		int num1 = num;
		int rev = 0;
		
		while(num > 0) {
			int b = num % 10;
			rev = rev * 10 + b;
			num /= 10;
		}
		
		if(rev == num1) {
			System.out.println(num1 + " is a palindrome number as it's reverse is same: " + rev);
		}
		else {
			System.out.println(num1 + " is not a palindrome number as it's reverse is " + rev);
		}
		sc.close();
	}

}
