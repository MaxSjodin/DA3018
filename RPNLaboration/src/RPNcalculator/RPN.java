package RPNcalculator;

import java.util.Scanner;
import java.util.Stack;

public class RPN {
	public static void main(String args[]) 
	 { 
		// Creating an empty Stack 
	     Stack<Double> Stack = new Stack<Double>(); 
	     System.out.println("Input integer or operator");
	     while(true) {
		     Scanner sc = new Scanner(System.in);
		     
		     String input = sc.nextLine();
		     if(input.equals("+")) {
		    	 Stack.push(Stack.pop() + Stack.pop());
		     }
		     else if(input.equals("-")) {
		    	 Stack.push((-1)*Stack.pop() + Stack.pop());
		     }
		     else if(input.equals("*")) {
		    	 Stack.push(Stack.pop() * Stack.pop());
		     }
		     else if(input.equals("/")) {
		    	 Stack.push((1/Stack.pop()) * Stack.pop());
		     }
		     else if(input.equals("=")) {
		    	 break;
		     }
		     else {
		    	 Stack.push(Double.valueOf(input));
		     }
		     
	     }
	     double answer;
	     answer = Stack.pop();
    	 System.out.println(answer);
		
	 }
}
