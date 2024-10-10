package interviewprograms;

import java.util.Scanner;

public class RemoveWhiteSpace {
	
	//program to remove white space from string
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to remove white spaces from a string: ");
		String str = "as di  gb asas";
		System.out.println("String with sapces: " + str);
		
		str = str.strip();
		
		System.out.println("String without spaces: " + str);

	}

}
