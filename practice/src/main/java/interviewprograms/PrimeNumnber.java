package interviewprograms;

import java.util.Scanner;

public class PrimeNumnber {

	//to check if the number is a prime number.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check: ");
		int num = sc.nextInt();
		boolean b = true;
		
		if(num <= 1) {
			b = false;
		}
		else if(num >= 3) {
			for(int i = 2; i <= num/2; i++) {
				if(num % i ==0) {
					b = false;
					}
				}
		}
		else { 
			b = true;
		}
		
		if(b == true) {
			System.out.println(num + " is a prime number.");
		}
		else {
			System.out.println(num + " is not a prime number.");
		}
		
		sc.close();
	}
	
	
}

