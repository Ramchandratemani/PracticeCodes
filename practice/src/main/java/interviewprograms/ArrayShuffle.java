package interviewprograms;

public class ArrayShuffle {

	public static void main(String[] args) {
		
		int [] a = {10,45,10,10,87,45,96,23,78,10};
		int b =10;
		
		System.out.println("Array before shifting 10 at last: ");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
	
		System.out.println("");
		
		shifter(a,b);
		
		System.out.println("");
		System.out.println("Array after shifting 10 at last: ");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void shifter(int a[], int b) {
		
		int index =0;
		
		for(int i =0; i<a.length; i++) {
			if(a[i] != b) {
				a[index] = a[i];
				index++;
			}
		}
		while(index<a.length) {
			a[index] = b;
			index++;
		}
		
	}

}
