package patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to create pattern");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j = i; j<n; j++) {
				System.out.print(" ");
			}
			for(int k =1; k<(i*2);k++) {
				System.out.print(k);
			}
			System.out.println("");
		}
		for(int i=n-1; i>=1; i--) {
			for(int j= n; j>i;j--) {
				System.out.print(" ");
			}
			for(int k =1; k<(i*2); k++) {
				System.out.print(k);
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int i = 1; i <= n; i++ ) {
			for(int j =n; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(k);
			}
			for(int l = i-1; l>=1;l--) {
				System.out.print(l);
			}
			System.out.println("");
		}
		
		for(int i=n-1; i>=1;i--) {
			for(int j =n; j>i; j--) {
				System.out.print(" ");
			}
			for(int k =1; k<=i; k++) {
				System.out.print(k);
			}
			for(int l = i-1; l>=1; l--) {
				System.out.print(l);
			}
			System.out.println("");
		}
		
		sc.close();
	}

}
