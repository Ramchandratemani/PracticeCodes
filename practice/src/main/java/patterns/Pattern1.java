package patterns;

import java.util.Scanner;

public class Pattern1 {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please Enter a number for the pattern: ");
		int n = sc.nextInt();
		
		for(int i= 1; i<=n; i++) {

			for(int j = n; j>=1; j--) {
				if(j<=i) {
					System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
			}
			for(int k =2; k<=i; k++) {
				System.out.print(k);
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int i = 0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k<=i; k++) {
				System.out.print(k+1);
			}
			for(int l = i-1;l>=0; l--) {
				System.out.print(l+1);
			}
			System.out.println();
		}
		
		sc.close();
	}

}
