package interviewprograms;

import java.util.Scanner;

public class StringReverse {

	// to reverse a string
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String a = sc.next();
		String b = "";
		
		for(int i = 0; i < a.length(); i++) {
			
			char ch = a.charAt(i);
			b = ch + b;
		}
		
		
		System.out.println("Original String: " + a);
		System.out.println("Reversed String: " + b);
		sc.close();
	}
	

}
