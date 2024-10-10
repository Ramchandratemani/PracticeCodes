package interviewprograms;

import java.util.Scanner;

public class ReverseAnArray {
	
	// To reverse an Array
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the numbers in array: ");
		for(int i =0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Original array is: ");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println("");
		reversearray(arr, size);
		
		sc.close();
		
	}

	public static void reversearray(int[] arr, int size) {
		
		int left = 0;
		int right = size-1;
		
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
			
		}
		
		System.out.println("Reversed array is: ");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

}
