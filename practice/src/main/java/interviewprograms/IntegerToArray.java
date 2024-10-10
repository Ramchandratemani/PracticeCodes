package interviewprograms;

import java.util.Scanner;

public class IntegerToArray {
	
	// Taking integer digits and converting into array
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number more than 2 digits: ");
		long num = sc.nextLong();
		
		System.out.println("Number entered is: " + num);
		
		String numstr = Long.toString(num);
		int[] a = new int[numstr.length()];
		
		for(int i = 0; i < numstr.length(); i++) {
			a[i] = Character.getNumericValue(numstr.charAt(i));
		}
		
		System.out.println("Number converted to an array is: ");
		
		for(int i = 0; i<a.length; i++) {
			
			System.out.print(a[i] + ", ");
		}
		
		
		sc.close();
		
	}

}
