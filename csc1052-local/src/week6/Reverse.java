package week6;

import java.util.Stack;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "csc1052section002";
		
		System.out.print(reverseString(str));

	}

	/**
	 * return the reversed string variable str
	 * @param str original string
	 * @return reversed string
	 */
	private static String reverseString(String str) {
		
		Stack<String> reverseStack = new Stack<String>();
		
		// step 1. store the string to stack
		for (int i  = 0; i < str.length(); i++) {
			reverseStack.push(str.substring(i, i+1));
		}
		
		String reverse = "";
		
		// step 2: pop all elements out of the stack.
		while (!reverseStack.isEmpty()) {
			reverse = reverse + reverseStack.pop();
		}
		
		return reverse;
		
	}

}
