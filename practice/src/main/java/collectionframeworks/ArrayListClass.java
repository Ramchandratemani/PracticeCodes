package collectionframeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListClass {

	public void ArrayListMethod() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This is Array List, It uses a dynamic array to store the duplicate element of different data types."
				+ "The ArrayList class maintains the insertion order and is non-synchronized."
				+ "The elements stored in the ArrayList class can be randomly accessed.");
		System.out.println("");
		System.out.println("Enter the number of items you would include in the list: ");
		int size = sc.nextInt();
		
		System.out.println("Please enter values in the list: ");
		
		ArrayList<String> al = new ArrayList<String>(); //Creating ArrayList
		
		//Adding Value in the list by user input
		for(int i = 0; i < size; i++) {
			
			String value = sc.next();
			al.add(value);
		}
		
		System.out.println("");
		System.out.println("The list items are as follows: " + al);
		System.out.println("");
		
		options(al);
		
		sc.close();
	}

	
	public void options(ArrayList<String> al) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("Choose any action from the menu: ");
		System.out.println("1. Add an item");
		System.out.println("2. Delete an item");
		System.out.println("3. Find an item");
		System.out.println("4. Update an item");	
		System.out.println("5. Sorting the list");
		System.out.println("6. Print the list");
		System.out.println("7. Check the size of the list");
		System.out.println("8. Return to the previous menu");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case(1):
			ArrayListAdd(al);
			break;
		case(2):
			ArrayListRemove(al);
			break;
		case(3):
			ArrayListSearch(al);
			break;
		case(4):
			ArrayListUpdate(al);
			break;
		case(5):
			ArrayListSort(al);
			break;
		case(6):
			System.out.println("");
			System.out.println("Printing the List ");
			for (String str : al)
				System.out.print(str + " ");
			System.out.println("");
			options(al);
			break;
		case(7):
			System.out.println("");
			System.out.println("The size of the list is : " + al.size());
			System.out.println("");
			options(al);
			break;
		case(8):
			CollectionMain cm = new CollectionMain();
			cm.ListClass();
			break;
		default: 
			System.out.println("Wrong Choice!! Please choose from 1-8: ");
			options(al);
			break;
		}
	
		sc.close();
	}
	
	public void ArrayListAdd(ArrayList<String> al) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("List: " + al);
		System.out.println("");
		System.out.println("Please insert the item to be added: ");
		
		String value =  sc.next();
		
		System.out.println("Select the item location: ");
		System.out.println("1. Press 1 to add at the end");
		System.out.println("2. Press 2 to add at a specifc location");

		int choice = sc.nextInt();
		
		if(choice == 1) {
			al.add(value);
		}
		else if(choice == 2){
			System.out.println("Enter the index of the item to be added: ");
			int in = sc.nextInt();
			al.add(in,value);
		}
		else {
			System.out.println("Wrong choice!!");
			ArrayListAdd(al);
		}
		
		System.out.println("Printing the updated list: " + al);
		System.out.println("");
		options(al);
		sc.close();
		
	}

	public void ArrayListRemove(ArrayList<String> al) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("List: " + al);
		System.out.println("");
		System.out.println("Select an option : ");
		System.out.println("1. Press 1 to remove using item name.");
		System.out.println("2. Press  to remove using the index value ");

		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Plese select the value to be removed from the list: ");
			String value =  sc.next();
			al.remove(value);
		}
		else if(choice == 2){
			System.out.println("Enter the index of the item to be removed: ");
			int in = sc.nextInt();
			al.remove(in);
		}
		else {
			System.out.println("Wrong choice!!");
			ArrayListRemove(al);
			System.out.println("");
		}
		
		System.out.println("Printing the updated list: " + al);
		System.out.println("");
		options(al);
		sc.close();
	}
	
	
	public void ArrayListSearch(ArrayList<String> al) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("List: " + al);
			System.out.println("");
			System.out.println("Select an option : ");
			System.out.println("1. Press 1 to search using item name.");
			System.out.println("2. Press 2 to search using the index value");
	
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("Plese write the item name to find its location: ");
				String value =  sc.next();
				if(al.contains(value)) {
					System.out.println(al.indexOf(value));
				}
				else {
					System.out.println("No item found!!");
				}
			}
			else if(choice == 2){
				System.out.println("Enter the index of the item to search: ");
				int in = sc.nextInt();
				System.out.println(al.get(in)); 
			}
			else {
				ArrayListSearch(al);
			}
			options(al);
			sc.close();

		}
	
	public void ArrayListUpdate(ArrayList<String> al) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("List: " + al);
			System.out.println("");
			System.out.println("Write the index to be changed : ");
			int in = sc.nextInt();
			System.out.println("Write the item name:");
			String value = sc.next();			
			
			al.set(in, value);
			
			System.out.println("Printing the updated list: " + al);
			System.out.println("");
			options(al);
			sc.close();
		
	}
	
	public void ArrayListSort(ArrayList<String> al) {
		
		System.out.println("List before sorting: " + al);
		System.out.println("");
		Collections.sort(al);
	
		System.out.println("After Sorting: ");
		System.out.println(al);
		System.out.println("");
		options(al);
	}
	
}
