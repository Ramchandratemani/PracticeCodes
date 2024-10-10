package practiceproject;

import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] ops = sc.nextLine().split(" ");
		System.out.println(SolutionBaseball.calPoints(ops));
		
		sc.close();
	}

}
