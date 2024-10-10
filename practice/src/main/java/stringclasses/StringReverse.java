package stringclasses;

public class StringReverse {

	public static void main(String[] args) {
		
		String a = "divya", b="";
		char ch;
		
		System.out.println("Original String : " + a);
				
		for(int i =0; i<a.length(); i++) {
			
			ch = a.charAt(i);
			b = ch+b;
			
		}
		
		System.out.println("Reversed String is : " + b);

	}

}