package datastructures;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main op = new Main ();
		
		System.out.println("");
		System.out.println("This program will provide the Searching and Sorting Techniques.");
		System.out.println("");
		
		op.insertingArray();
	}

	
	public void insertingArray() {
		
		Main op = new Main();
		Scanner sc = new Scanner(System.in);
		
		int size;
		System.out.println("Please Enter the size of an array you want: ");
		
		size = sc.nextInt();
		int arr [] = new int [size];
		
		System.out.println("");
		System.out.println("Enter the number in Array and press enter: ");
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("");
		System.out.println("Printing the Array.");
		for(int i =0; i<arr.length; i++) {
			System.out.print(" " + arr[i]);
		}		
		
		op.Options(arr, size);
		sc.close();
	}
	
	public void Options(int arr[], int size) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Please choose from menu: ");
		System.out.println("1. Searching");
		System.out.println("2. Sorting");
		System.out.println("3. Inserting Array");
		System.out.println("4. Exit");
		int choice = sc.nextInt();
	
		switch(choice) {
		case(1): 
			Searching s = new Searching();
			s.Searching1(arr,size);
			break;
		case(2):
			Sorting so = new Sorting();
			so.Sorting1(arr,size);
			break;
		case(3):
			Main op = new Main();
			op.insertingArray();
			break;
		case(4):
			System.exit(0);
			break;
		default: 
			System.out.println("Wrong Choice!! Please select from the menu: ");
			System.out.println("");
			Options(arr, size);
			break;
		}
		sc.close();
		
	}
	
}
