package interviewprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("How many items you would like to add in the list.");
		int a = sc.nextInt();
		System.out.println("Please enter the list numbers: ");
		
		for(int i = 1; i <= a; i++) {
			list.add(sc.nextInt());
		}
		
		System.out.print("List is " + list);
		System.out.println(" ");
		boolean b = true;				
		for(int i : list) {
			if(i % 2 == 0) {
				b = false;
				System.out.println(i + " is an even number in the list.");
			}
		}
		if (b == true) {
			System.out.println("List has only odd numbers.");
		}
		
	}

}
