package week5;

public class LinkedListOpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LLNode<String> node1 = new LLNode<String>("B");
		LLNode<String> node2 = new LLNode<String>("C");
		LLNode<String> node3 = new LLNode<String>("D");
		LLNode<String> node4 = new LLNode<String>("E");
		
		node1.setLink(node2);
		node2.setLink(node3);
		node3.setLink(node4);
		
		LLNode<String> letter = node1;
		
		print(letter);  // B, C, D, E, 
		
		System.out.println();
		letter = insertFront("A", letter);
		print(letter);  // A, B, C, D, E, 
		
		System.out.println();
		letter = insertEnd("A", letter);
		print(letter);  // A, B, C, D, E, A
		
		System.out.println();
		letter = insertAfter("B", "G", letter);
		print(letter);  // A, B, G, C, D, E, A
	}
	
	// traverse print
	public static void print(LLNode<String> head) {
		// start with first node
		LLNode<String> current = head;
		
		// repeatedly print the node and move to next
		while(current != null) {
			
			System.out.print(current.getInfo()+", ");
			current = current.getLink();
			
		}
		
	}
	
	public static LLNode<String> insertFront(String str, LLNode<String> head) {
		// create new node
		LLNode<String> newNode = new LLNode<String>(str);
		
		// link newNode to old head.
		newNode.setLink(head);
		
		// update head to new head
		head = newNode;
		
		return head;
	}

	public static LLNode<String> insertEnd(String str, LLNode<String> head) {
		
		// find the last
		LLNode<String> current = head;
		
		while(current.getLink() != null) {
			current = current.getLink(); // update to next
		}	
		
		// create new node
		LLNode<String> newNode = new LLNode<String>(str);
		
		// link last to new node
		current.setLink(newNode);
		
		return head;
	}
	
	public static LLNode<String> insertAfter(String target, String str, LLNode<String> head) {
		
		// create new node
		LLNode<String> newNode = new LLNode<String>(str);
		
		// find target
		LLNode<String> current = head;
		
		while(current != null) {
			if (current.getInfo().equals(target)) {
				break;
			}
			current = current.getLink(); // update to next
		}
		
		// insertion
		// 1. link newnode to the node after target
		newNode.setLink(current.getLink());
		
		// 2. link target to newnode
		current.setLink(newNode);
		
		return head;
	}
}
