package datastructures;

import java.util.Scanner;
import java.util.Arrays;

public class Searching extends Main {
	
	Scanner sc = new Scanner(System.in);
	Main op = new Main();
	
	public void Searching1(int arr[], int size) {
		
		System.out.println("");
		System.out.println("Please select the options from Searching menu.");
		System.out.println("");
		System.out.println("1. Linear Search");
		System.out.println("2. Binary Search");
		System.out.println("3. Previous Menu");
		int choice  = sc.nextInt();
		
		switch (choice) {
		case (1): 
			LinearSearch(arr, size);
			break;
		case (2):
			BinarySearch(arr,size);
			break;
		case (3):
			op.Options(arr,size);
			break;
		default: 
			System.out.println("Wrong Choice!! Please choose from the Menu: ");
			System.out.println(" ");
			Searching1(arr, size);
			break;
		}
	}
	

	public void LinearSearch (int arr[], int size) {
		
		System.out.println("");
		System.out.println("This is a Linear search method to find a value from an array. ");
		System.out.println("Please Enter the value to be searched: ");
		int value = sc.nextInt();
		int i;
		
		for(i = 0; i<size; i++) {
			
			if (value == arr[i]) {
				System.out.println("The number " + value + " is at " + i + " index." );
				break;
			}	
		}
		
		if(i==size) {
			System.out.println("The number " + value + " is not present in array.");
		}
		
		System.out.println("");
		System.out.println("Do you want to search more value using linear search choose Y/y else choose N/n");
		String ch = sc.next();
		
		if( ch.contentEquals("Y") || ch.contentEquals("y")) {
			
			LinearSearch(arr, size);
		}
		else if (ch.contentEquals("n") || ch.contentEquals("n"))
			Searching1(arr, size);
		
		
		
	}

	public void BinarySearch(int[] arr, int size) {
		
		System.out.println("");
		System.out.println("This is a Binary search method to find a value from an array. ");
		System.out.println(" ");
		Arrays.sort(arr);
		System.out.println("Sorted Array: ");
		for (int i: arr) {
            System.out.print(i + " ");
        }
		System.out.println(" ");
		System.out.println("Please Enter the value to be searched: ");
		int value = sc.nextInt();
		int first = 0; 
		int last = size-1;
		int mid = (first+last)/2;
		
		while(first<=last) {
			
			if(arr[mid] < value) {
				first = mid + 1;
			}
			else if (arr[mid] == value) {
				System.out.println("The number " + value + " is found at "+ mid);
				break;
			}
			else {
				last=mid-1;
			}
			mid=(first + last)/2;
		}
		if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
		System.out.println("");
		System.out.println("Do you want to search more value using Binary search choose Y/y else choose N/n");
		String ch = sc.next();
		
		if( ch.contentEquals("Y") || ch.contentEquals("y")) {
			
			BinarySearch(arr, size);
		}
		else if (ch.contentEquals("n") || ch.contentEquals("n"))
			Searching1(arr, size);
		
	}


	
}
