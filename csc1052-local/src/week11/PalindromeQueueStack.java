package week11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeQueueStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isPalindrome(String s) {
		
		// enqueue characters
		Queue<Character> queue = new LinkedList<Character>();
		for (int i = 0; i < s.length(); i++) {
			queue.add(s.charAt(i));
		}
		
		// push all characters
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			stack.push(s.charAt(i));
		}
		
		// compare characters from dequeue and pop.
		
		
		return false;
	}


}
