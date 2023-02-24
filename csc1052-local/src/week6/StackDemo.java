package week6;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> letterStack = new Stack<String>();
		
		letterStack.push("A");
		letterStack.push("B");
		letterStack.push("C");
		letterStack.push("D");
		
		letterStack.pop();
		letterStack.pop();
		
		letterStack.push("E");
		
		System.out.println(letterStack.toString());
		
	}

}
