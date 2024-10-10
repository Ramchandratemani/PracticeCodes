package interviewprograms;

import java.util.Scanner;

public class NumberOfDigits {

	//program to count the number of digits in an integer number with two methods
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:- ");
		int a = sc.nextInt();
		
		System.out.println("Number entered is : " + a);
		
		// using string conversion
		String str = Integer.toString(a);
		int count = str.length();
		
		//using normal method
		int count1 =0;
		
		if(a == 0) {
			count1 = 1;
		}
		else {
			while(a > 0) {
				count1++;
				a /= 10;			
			}
		}
		System.out.println("Length of the digits entered by converting into String is: " + count);
		System.out.println("Length of the digits entered using for loop: " + count1);
		
		sc.close();
	}

}

