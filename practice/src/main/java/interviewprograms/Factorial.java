package interviewprograms;

import java.util.Scanner;

public class Factorial {
	
	//factorial number
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to get the factorial: ");
		
		int num = sc.nextInt();
		int fact = 1;
		
		if(num == 1) {
			System.out.println(num + "is the factorial of 1.");
		}
		else {
			for(int i = 2; i<=num; i++) {
				fact *= i;
			}
			System.out.println("Factorial of "+ num + " is " + fact);
		}
		
		sc.close();
	}
}
