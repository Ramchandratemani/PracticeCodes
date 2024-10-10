package interviewprograms;

import java.util.Scanner;

public class FibonacciNumber {

		//program to create Fibonacci Number series 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the limit for Fibonacci series: ");
			int n = sc.nextInt();
			int a = 0;
			int b = 1;
			int c;
			
			for(int i = 1; i <= n; i++) {
				
				System.out.print(a + " ");
				c = a+b;
				a = b;
				b = c;
		}
		sc.close();
		
	}

}
