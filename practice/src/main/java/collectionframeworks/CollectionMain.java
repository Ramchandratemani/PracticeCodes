package collectionframeworks;

import java.util.Scanner;

public class CollectionMain {
	
	public static void main(String[] args) {
		
		System.out.println("This program will describe the Collection Frameworks:");
		System.out.println("There are three interfaces implementing collection framework.");
		
		Options();


	}

	public static void Options() {
		
		CollectionMain cm = new CollectionMain();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose from menu to know more: ");
		System.out.println("1. List");
		System.out.println("2. Queue");
		System.out.println("3. Set");
		System.out.println("4. Exit");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		
		case(1) :
			cm.ListClass();
			break;
		
		case(2):
			cm.QueueClass();
			break;
		
		case(3):
			cm.SetClass();
			break;
			
		case(4):
			System.exit(0);
			break;
		
		default:
			System.out.println("");
			System.out.println("Wrong choice, please choose from 1 - 4: ");
			Options();
			break;
		}
		
		sc.close();
	}
	



	public void ListClass() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("");
			System.out.println("This is List Interface, It inhibits a list type data structure in which we can store the ordered collection of objects. "
					+ "It can have duplicate values.");
			System.out.println("There are few types of lists available in java. ");
			System.out.println("Choose from menu to know more: ");
			System.out.println("1. Array List");
			System.out.println("2. Linked List");
			System.out.println("3. Stack");
			System.out.println("4. Previous Menu");
			
			int choice = sc.nextInt();
			
			switch (choice) {
					
					case(1) :
						ArrayListClass alc = new ArrayListClass();
						alc.ArrayListMethod();
						break;	
					case(2):
						LinkedListClass llc = new LinkedListClass();
						llc.LinkedListMethod();
						break;
					case(3):
						SetListClass slc = new SetListClass();
						slc.SetMethod();
						break;
					case(4):
						Options();
						break;
					default:
						System.out.println("");
						System.out.println("Wrong choice, please choose from 1 - 5: ");
						ListClass();
						break;
					}
			sc.close();
		}
	
	
	public void QueueClass() {
		
		
	}
	
	
	public void SetClass() {
		
		
	}
	
}
