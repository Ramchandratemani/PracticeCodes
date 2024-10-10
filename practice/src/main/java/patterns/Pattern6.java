package patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to create pattern: ");
		int n = sc.nextInt();
		
		System.out.println("Enter a number of diamond: ");
		int dia = sc.nextInt();
		
		
		for(int i = 1; i<=n; i++) {
			for(int d =1; d<=dia; d++) {
				if(d>=2) {
					for(int j =i; j<n; j++) {
						System.out.print(" ");
					}	
				}
				for(int j =i; j<n; j++) {
					System.out.print(" ");
				}
				for(int k=1; k<=(2*i-1); k++) {
					if(k==1 || k==(2*i-1)) {
						System.out.print(1);
						}	
					else {
						System.out.print(" ");
						}
					}
					System.out.print(" ");
				}
				System.out.println("");
		}
		
		for(int i = n-1; i>=1; i--) {
			for(int d =1; d<=dia; d++) {
				if(d>=2) {
					for(int j =n; j>i; j--) {
						System.out.print(" ");
					}
				}
			for(int j =n; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=(2*i-1); k++) {
				if(k==1 || k==(2*i-1)) {
					System.out.print(1);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			}
			System.out.println("");
		}
		
		
		sc.close();

	}

}
