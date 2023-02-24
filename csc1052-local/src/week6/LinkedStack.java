package week6;

public class LinkedStack<T> implements StackInterface<T> {

	private Node top; // top of stack
    private int count;  // size of stack
  
    // Sets up an initially empty stack.
    public LinkedStack() {
        top = null;
        count = 0;
    }
    
	@Override
	public void push(T element) {
		// create a new node
		Node newNode = new Node(element);
		
		// step1. link the new node to old top.
		newNode.next = top;
		
		// step2. update the top
		top = newNode;
		
		count++;
		
	}

	@Override
	public T pop() throws StackUnderflowException {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new StackUnderflowException();
		}
		
		T element = (T) top.elem; // removed top element
		
		top = top.next;
		count--;
		
		return element;
	}

	@Override
	public T peek() throws StackUnderflowException {
		if (isEmpty())
            throw new StackUnderflowException("An attempt was made to access the top of an empty stack.");

        return (T) top.elem;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}
	
	// Gets a string representation of the stack. 
    public String toString() {
        String description;
        if (isEmpty())
            description = "The stack is empty.\n";
        else {
            if (size() == 1)
                description = "There is 1 element in the stack:\n";
            else
                description = "There are " + size() + " elements in the stack:\n";
            
            // Traverse the list and add each element to the description.
            Node current = top;
            while (current != null) {
                description += current.elem + "\n";
                current = current.next;
            }
        }
        return description;
    }

}
