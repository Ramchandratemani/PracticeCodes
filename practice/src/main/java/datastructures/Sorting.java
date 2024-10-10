package datastructures;

import java.util.Scanner;

public class Sorting extends Main{
	
	Scanner sc = new Scanner(System.in);
	Main op = new Main();
	
	public void Sorting1(int arr[], int size) {
		
		System.out.println("");
		System.out.println("Please select the options from Sorting menu.");
		System.out.println("");
		System.out.println("1. Bubble Sort");
		System.out.println("2. Selection Sort");
		System.out.println("3. Insertion Sort");
		System.out.println("4. Merge Sort");
		System.out.println("5. Quick Sort");
		System.out.println("6. Previous Menu");

		int choice  = sc.nextInt();
		
		switch (choice) {
			case (1): 
				BubbleSort(arr, size);
				break;
			case (2):
				SelectionSort(arr,size);
				break;
			case (3):
				InsertionSort(arr,size);
				break;
			case (4):
				MergeSort(arr,size);
				break;
			case (5):
				QuickSort(arr,size);
				break;	
			case (6):
				op.Options(arr,size);
				break;
			default: 
				System.out.println("Wrong choice!! Choose from the menu option: ");
				System.out.println(" ");
				Sorting1(arr, size);
				break;
		}
			
	}
	
	
	public void QuickSort(int[] arr, int size) {
		System.out.println("");
		System.out.println("This is a Quick sort algorithm to sort an array with a complexity of (N log (N)). ");
		System.out.println("Unsorted Array: ");
		for (int i: arr) {
            System.out.print(i + " ");
        }
		System.out.println(" ");
		int low= 0;
		int high = size -1;
		
		quickSort(arr,low, high);
		
		System.out.println("");
		System.out.println("");
		System.out.println("After sorting: ");
		for(int n : arr) {
			System.out.print(n + " ");
		}
		
		System.out.println(" ");
		Sorting1(arr,size);
	}
	
	public static void quickSort(int arr[], int low, int high) {
		
		if (low<high) {
			
			int pi = partition(arr, low, high);
			
			quickSort(arr, low, pi - 1 );
			quickSort(arr, pi + 1, high);
		}
		
	}
	
	private static int partition(int arr[], int low, int high) {
		
		int piviot = arr[high];
		int i = low - 1;
		
		for (int j = low; j < high; j++) {
			if(arr[j] < piviot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
	
	
	
	public void MergeSort(int[] arr, int size) {
		System.out.println("");
		System.out.println("This is a Merge	 sort algorithm to sort an array with a complexity of O(n log n). ");
		System.out.println("Unsorted Array: ");
		for (int i: arr) {
            System.out.print(i + " ");
        }
		System.out.println(" ");
		int l=0;
		int r = size -1;
		
		mergeSort(arr,l,r);
		
		System.out.println("");
		System.out.println("");
		System.out.println("After sorting: ");
		for(int n : arr) {
			System.out.print(n + " ");
		}
		
		System.out.println(" ");
		Sorting1(arr,size);
		
		
		
	}

	public void mergeSort(int arr[], int l, int r) {
		
		if (l<r) {
			
			int mid = (l+r)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			
			merge(arr, l, mid, r);
		}
	}
	
	public void merge(int [] arr, int l, int mid, int r) {
		
		int n1 = mid - l + 1;
		int n2 = r - mid ;
		
		int lArr[] = new int[n1];
		int rArr[] = new int[n2];
		
		for (int x =0; x<n1; x++) {
			lArr[x] = arr[l+x];
		}
		for (int x =0; x<n2; x++) {
			rArr[x] = arr[mid + 1 + x];
		}
		
		int i =0, j=0, k=l;
		
		
		while(i<n1 && j<n2) {
			if(lArr[i] <= rArr[j]) {
				arr[k] = lArr[i];
				i++;
			}
			else {
				arr[k] = rArr[j];
				j++;
			}
			k++;	
		}
		
		while(i<n1) {
			arr[k] = lArr[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			arr[k] = rArr[j];
			j++;
			k++;
		}
	}
	
	
	
	public void InsertionSort(int[] arr, int size) {
		System.out.println("");
		System.out.println("This is a Insertion sort algorithm to sort an array with a complexity of O(N). ");
		System.out.println("Unsorted Array: ");
		for (int i: arr) {
            System.out.print(i + " ");
        }
		System.out.println(" ");
		int i,j,temp;
		
		for(i=1; i < size; i++) {
			temp = arr[i];
			j = i-1;
			
			while(j>=0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = temp;
		}
		System.out.println("");
		System.out.println("");
		System.out.println("After sorting: ");
		for(int n : arr) {
			System.out.print(n + " ");
		}
		
		System.out.println(" ");
		Sorting1(arr,size);
		
	}

	
	public void SelectionSort(int[] arr, int size) {
		System.out.println("");
		System.out.println("This is a Selection sort algorithm to sort an array with a complexity of O(N2). ");
		System.out.println("Unsorted Array: ");
		for (int i: arr) {
            System.out.print(i + " ");
        }
		System.out.println(" ");
		int i,j,temp;
		
		for(i=0; i<size-1; i++) {
			int min = i;
			for(j = i + 1; j < size; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;	
		}

		System.out.println("");
		System.out.println("");
		System.out.println("After sorting: ");
		for(int n : arr) {
			System.out.print(n + " ");
		}
		
		System.out.println(" ");
		Sorting1(arr,size);
		
	}

	
	public void BubbleSort(int[] arr, int size) {
		
		System.out.println("");
		System.out.println("This is a Bubble sort algorithm to sort an array with a complexity of O(N2). ");
		System.out.println("Unsorted Array: ");
		for (int i: arr) {
            System.out.print(i + " ");
        }
		System.out.println(" ");
		int i,j,temp;
		
		for(i=0; i<size; i++) {
			for(j=0; j<size-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					temp= arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		System.out.println("");
		System.out.println("");
		System.out.println("After sorting: ");
		for(int n : arr) {
			System.out.print(n + " ");
		}
		
		System.out.println(" ");
		Sorting1(arr,size);
		
	}
}
