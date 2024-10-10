package practice.corejava;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[]= {1,3,4,5,6,4};
		int b[][] = {{12,4,5,2,8,9},{2,4,5,6,21,3}};
		String c[] = new String[3];
		int d[][][] = new int[2][2][3];
		String e[][] = new String[2][3];
		
		
		System.out.println("Program about Arrays;");
		System.out.println("");
		
		System.out.println("Prinitng a predefined single dimensional array : ");
		
		for(int i =0; i< a.length;i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Printing a predefined multi dimensional array : ");
		
		
		  for (int i=0; i < b.length; i++) { 
			  for(int j=0; j < b[i].length; j++) {
				  System.out.print(b[i][j] + " "); 
				  } 
			  System.out.println("");
			  }
		 
		System.out.println();
		System.out.println();
		System.out.println("Please insert the names of your 3 dream places : ");
		for(int i=0;i<c.length;i++) {
		c[i] = sc.nextLine();
		}
		
		System.out.println();
		System.out.println("Printing your preference of places: ");
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i] + ", ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Please insert numbers to create a 3D matrix :");
		for(int i =0; i < d.length; i++) {
			for(int j=0; j < d[i].length; j++) {
				for(int k=0; k < d[i][j].length; k++) {
					d[i][j][k] = sc.nextInt();
				}
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Printing the 3D matrix : " );
		for(int i =0; i < d.length; i++) {
			System.out.println("Layer " + (i+1) + " : ");
			for(int j=0; j < d[i].length; j++) {
				for(int k=0; k < d[i][j].length; k++) {
					System.out.print(d[i][j][k] + " ");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	
		System.out.println();
		System.out.println();
		System.out.println("Please insert 6 names to create a 2D matrix :");
		for(int i =0; i < e.length; i++) {
			for(int j=0; j < e[i].length; j++) {
					e[i][j] = sc.next();
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Printing the 2D matrix : " );
		for(int i =0; i < e.length; i++) {
			for(int j=0; j < e[i].length; j++) {
					System.out.print(e[i][j] + " ");
				}
				System.out.println("");
		}
		
	}
		
}
