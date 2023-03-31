package week11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		CircularLinkedQueue <String> queue = new CircularLinkedQueue<String>();
	
		
		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");
		queue.enqueue("D");
		System.out.println(queue.dequeue());
		
		
		System.out.println(queue.toString());
		
	}

}
