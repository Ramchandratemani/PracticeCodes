package interviewprograms;

import java.util.Scanner;

public class ArmstrongNumber {

	// to check if a number is an Armstrong Number
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number to check if it is Armstrong Number: ");
		int num = sc.nextInt();
		int result = 0;
		int digit = 0;
		int num1 = num;
		int temp;
		
		while(num>0) {
			digit++;
			num= num/10;
		}
		
		num = num1;
		while(num > 0) {
			temp = num % 10;
			result += power(digit, temp);
			num /= 10;
		}
		
		if(result == num1) {
			System.out.println(num1 + " is an Armstrong Number");
		}
		else {
			System.out.println(num1 + " is not an Armstrong Number");
		}
		sc.close();
	}
	
	public static int power(int exp, int base) {
		
		int result = 1;
		for(int i = 1; i <= exp; i++) {
			result *= base;
		}
		return result;
	}
	
}
