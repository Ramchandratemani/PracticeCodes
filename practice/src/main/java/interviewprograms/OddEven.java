package interviewprograms;

import java.util.Scanner;

public class OddEven {

	//to check if a number is odd or even
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check if its ODD or EVEN: ");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println(num + " is an even number.");
		}
		else {
			System.out.println(num + " is an odd number.");
		}
	sc.close();
	}

}
