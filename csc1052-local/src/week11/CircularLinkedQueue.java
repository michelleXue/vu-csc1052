package week11;


public class CircularLinkedQueue<T> implements Queue<T> {
	
    private Node rear;   // end of the queue (last in line)
    private int count;
    
    public CircularLinkedQueue () {
    	rear = null;
    	count = 0;
    }
    
	@Override
	public void enqueue(T element) {
		
		// create new node
		Node temp = new Node(element);

        if (isEmpty()) {
        	rear = temp;
        	rear.next = rear;
        }
        else {
        	// link temp to front
        	temp.next = rear.next;
        	// link rear to temp.
            rear.next = temp;
            // update rear
            rear = temp;
        }
        count++;
		
	}

	@Override
	public T dequeue() {
		if (isEmpty())
            throw new EmptyQueueException("An attempt was made to access the first " +
                                          "element of an empty queue.");
		Node temp = rear.next;  // store the node we are going to remove.
		
		if (count == 1) { // case 1: only one node
			rear = null;
		} else { // case 2: more than one nodes 
			rear.next = rear.next.next;
		}
		
		count--;
		
		return temp.elem;
	}

	@Override
	public T first() {
		if (isEmpty())
            throw new EmptyQueueException("An attempt was made to access the first " +
                                          "element of an empty queue.");

        return rear.next.elem;
	}

	@Override
	public boolean isEmpty() {
		
		return count == 0;
	}

	@Override
	public int size() {
		
		return count;
	}
	
    // Gets a string representation of the queue, starting at the front.
    public String toString() {
        String description;
        if (isEmpty())
            description = "The queue is empty.\n";
        else {
            description = "Queue size: " + size() + "\n";

            // Traverse the list and add each element to the description.
            Node current = rear.next;
            while (current != rear) {
                description += current.elem + "  ";
                current = current.next;
            }
            
            description += rear.elem + "  ";
            description += "\n";
        }
        return description;
    }
	
    // A private inner class that represents a node in the linked list.
    private class Node {
        private T elem;
        private Node next;

        // Stores the element and sets the next reference to null.
        public Node(T element) {
            this(element, null);
        }

        // Stores the element and sets the next reference to the node specified.
        public Node(T element, Node next) {
            this.elem = element;
            this.next = next;
        }
    }

}
