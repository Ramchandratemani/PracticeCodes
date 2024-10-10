package collectionframeworks;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListClass {

	public void LinkedListMethod(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This is Linked List, It uses a doubly linked list internally to store the elements. It can store the duplicate elements. "
				+ "It maintains the insertion order and is not synchronized. In LinkedList, the manipulation is fast because no shifting is required.");
		System.out.println("");
		System.out.println("Enter the number of items you would include in the list: ");
		int size = sc.nextInt();
		
		System.out.println("Please enter values in the list: ");
		
		LinkedList<String> ll = new LinkedList<String>(); //Creating LinkedList
		
		//Adding Value in the list by user input
		for(int i = 0; i < size; i++) {
			
			String value = sc.next();
			ll.add(value);
		}
		
		System.out.println("");
		System.out.println("The list items are as follows: " + ll);
		System.out.println("");
		
		options(ll);
		
		sc.close();
		
	}

	public void options(LinkedList<String> ll) {
		
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
			LinkedListAdd(ll);
			break;
		case(2):
			LinkedListRemove(ll);
			break;
		case(3):
			LinkedListSearch(ll);
			break;
		case(4):
			LinkedListUpdate(ll);
			break;
		case(5):
			LinkedListSort(ll);
			break;
		case(6):
			System.out.println("");
			System.out.println("Printing the List ");
			for (String str : ll)
				System.out.print(str + " ");
			System.out.println("");
			options(ll);
			break;
		case(7):
			System.out.println("");
			System.out.println("The size of the list is : " + ll.size());
			System.out.println("");
			options(ll);
			break;
		case(8):
			CollectionMain cm = new CollectionMain();
			cm.ListClass();
			break;
		default: 
			System.out.println("Wrong Choice!! Please choose from 1-8: ");
			options(ll);
			break;
		}
	
		sc.close();
		
	}

		
	public void LinkedListAdd(LinkedList <String> ll) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("List: " + ll);
		System.out.println("");
		System.out.println("Please insert the item to be added: ");
		
		String value =  sc.next();
		
		System.out.println("Select the item location: ");
		System.out.println("1. Press 1 to add at the end");
		System.out.println("2. Press 2 to add at a specifc location");
		System.out.println("3. Press 3 to add at the start");

		int choice = sc.nextInt();
		
		if(choice == 1) {
			ll.add(value);
		}
		else if(choice == 2){
			System.out.println("Enter the index of the item to be added: ");
			int in = sc.nextInt();
			ll.add(in,value);
		}
		else if (choice == 3) {
			ll.addFirst(value);
		}
		else {
			System.out.println("Wrong choice!!");
			LinkedListAdd(ll);
		}
		
		System.out.println("Printing the updated list: " + ll);
		System.out.println("");
		options(ll);
		sc.close();
		
	}
	
	public void LinkedListRemove(LinkedList <String> ll) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("List: " + ll);
		System.out.println("");
		System.out.println("Select an option : ");
		System.out.println("1. Press 1 to remove using item name.");
		System.out.println("2. Press  to remove using the index value ");

		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Plese select the value to be removed from the list: ");
			String value =  sc.next();
			ll.remove(value);
		}
		else if(choice == 2){
			System.out.println("Enter the index of the item to be removed: ");
			int in = sc.nextInt();
			ll.remove(in);
		}
		else {
			System.out.println("Wrong choice!!");
			LinkedListRemove(ll);
			System.out.println("");
		}
		
		System.out.println("Printing the updated list: " + ll);
		System.out.println("");
		options(ll);
		sc.close();
	}
	
	public void LinkedListSearch(LinkedList <String> ll) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("List: " + ll);
		System.out.println("");
		System.out.println("Select an option : ");
		System.out.println("1. Press 1 to search using item name.");
		System.out.println("2. Press 2 to search using the index value");

		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Plese write the item name to find its location: ");
			String value =  sc.next();
			if(ll.contains(value)) {
				System.out.println(ll.indexOf(value));
			}
			else {
				System.out.println("No item found!!");
			}
		}
		else if(choice == 2){
			System.out.println("Enter the index of the item to search: ");
			int in = sc.nextInt();
			System.out.println(ll.get(in)); 
		}
		else {
			LinkedListSearch(ll);
		}
		options(ll);
		sc.close();
	}
	
	public void LinkedListUpdate(LinkedList <String> ll) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("List: " + ll);
		System.out.println("");
		System.out.println("Write the index to be changed : ");
		int in = sc.nextInt();
		System.out.println("Write the item name:");
		String value = sc.next();			
		
		ll.set(in, value);
		
		System.out.println("Printing the updated list: " + ll);
		System.out.println("");
		options(ll);
		sc.close();
	}
	
	public void LinkedListSort(LinkedList <String> ll) {
		
		System.out.println("List before sorting: " + ll);
		System.out.println("");
		
		Collections.sort(ll);
	
		System.out.println("After Sorting: ");
		System.out.println(ll);
		System.out.println("");
		options(ll);
	}
}
