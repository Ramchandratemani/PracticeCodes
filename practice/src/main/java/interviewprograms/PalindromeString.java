package interviewprograms;

import java.util.Scanner;

public class PalindromeString {

	//Palindrome String
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a string to check if it is a Palindrome String: ");
		String str = sc.next();
		String str1 = str;
		String b = "";
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			b = ch + b;
		}
		
		if(str1.equals(b)) {
			System.out.println(str1 + " is a Palindrome String as its reverse is " + b);
		}
		else
			System.out.println(str1 + " is not a Palindrome String as its reverse is not same: " + b);
		
		sc.close();
	}
	
}
