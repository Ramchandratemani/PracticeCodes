package practice.corejava;

import java.util.Scanner;

public class Calculator {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		double n1,n2;
		
		do {
		System.out.println("Welcome to the first Java Program Calculator!!");
		
		System.out.println("Please enter first number: ");
		n1 = sc.nextDouble();
		
		System.out.println("Please enter second number: ");
		n2 = sc.nextDouble();
		
		System.out.println("Pelase select an option from 1-6: ");
		System.out.println("1. Addition (+)");
		System.out.println("2. Subtraction (-) ");
		System.out.println("3. Multiplication (*) ");
		System.out.println("4. Division (/) ");
		System.out.println("5. Modulus to find Reminder (%)");
		System.out.println("6. Exit");
		
		System.out.println("Enter the choice: ");
		choice = sc.nextInt();
		
		} while (choice > 7);
		
		switch(choice) {
		
		case(1):
			add(n1, n2);
			break;
			
		case(2):
			sub(n1, n2);
			break;
			
		case (3):
			multiply(n1, n2);
			break;
		
		case(4):
			div(n1, n2);
			break;
		
		case(5):
			mod(n1, n2);
			break;
		
		case(6):
			System.out.println("Exiting the program!");
			System.exit(0);
			break;
		}
		
		if (choice > 6 || choice < 1) {
			System.out.println("Invalid choice please choose from 1-6");
			do {
				choice = sc.nextInt();
			}while(choice < 7);
		}
			
	}

	
	public static void mod(double a, double b) {
		double c;
		c = a%b;
		System.out.println("Reminder of the two number "+ a +" and " + b + " is " + c);
	}

	public static void div(double a, double b) {
		double c;
		c = a/b;
		System.out.println("Division of the two number "+ a +" and " + b + " is " + c);
	}

	public static void multiply(double a, double b) {
		double c;
		c = a*b;
		System.out.println("Multiplication of the two number "+ a +" and " + b + " is " + c);
	}

	public static void sub(double a, double b) {
		double c;
		c = a-b;
		System.out.println("Subtraction of the two number "+ a +" and " + b + " is " + c);
		
	}

	public static void add(double a, double b) {
		double c;
		c = a+b;
		System.out.println("Addition of the two number "+ a +" and " + b + " is " + c);
	}
	
}
