package practiceproject;

import java.util.Scanner;
import java.util.Stack;

public class Validbrackets {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(isValid(s)) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		sc.close();
	}
	
	public static boolean isValid(String s) {
		
		//Stack to keep track of Opening brackets
		Stack<Character> stack = new Stack<>();
		
		//loop through each character in string
		for(char c : s.toCharArray()) {
			//Push opening brackets onto the stack
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
			}
			
			//for closing brackets, check if it matches the top of the stack
			else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			}
			else if (c == '}' && !stack.isEmpty() && stack.peek()== '{') {
				stack.pop();
			}
			else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			}
			else {
				return false;
			}
		}
		//if stack is empty, all brackets were matched; otherwise, it's invalid
		return stack.isEmpty();
		
	}

}
