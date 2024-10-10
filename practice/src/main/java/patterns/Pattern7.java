package patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to create pattern: ");
		int n = sc.nextInt();
		
		
		for(int i = n; i>=1; i--) {
			for(int j =i; j>=1; j--) {
				System.out.print(j);
			}
			
			for(int k =1; k<=(2*(n-i)); k++) {
				System.out.print(" ");
			}
			
			for(int l=1; l<=i; l++) {
				System.out.print(l);
			}
			
			
			System.out.println("");
		}
		
		
		sc.close();
	}

}
