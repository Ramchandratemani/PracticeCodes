package patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please Enter a number for the pattern: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
		sc.close();
	}

}
