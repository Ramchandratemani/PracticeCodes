package practiceproject;

import java.util.Stack;

public class SolutionBaseball {
	
	public static int calPoints(String[] ops) {
		
		Stack<Integer> record = new Stack<>();
		
		for(String op : ops) {
			
			switch(op){
				case "+" : 
					int top =record.pop();
					int newTop = top+record.peek();
					record.push(top);
					record.push(newTop);
					break;
				case "D" : 
					record.push(2 * record.peek());
					break;
				case "C" :
					record.pop();
					break;
				default: 
					record.push(Integer.valueOf(op));
					break;
			}
		}
		int sum = 0;
		for(int score : record) {
			sum += score;
		}
		
		return sum;
	}
	
}
