package week5;

public class LinkedRList<E> implements RList<E> {

	//attributes
	private LLNode<E> head;
	private int size;
	
	//constructor: empty list in the beginning
	public LinkedRList () {
		head = null;
		size = 0;
	}
	
	@Override
	public boolean add(E element) {
		
		// create new node
		LLNode<E> newNode = new LLNode<E>(element);
		
		// case 1: empty list
		if (head == null) {		
			head = newNode;
			size++;
			return true;
		}
		
		// case 2: non-empty list
				
		// 2.1 move current to the last node
		LLNode<E> current = head;
		while(current.getLink() != null) {
			current = current.getLink(); // update to next
		}	
						
		// 2.2 link current to new node
		current.setLink(newNode);
				
		size++;
		return true;
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	// traverse print
	public void print() {
		// start with first node
		LLNode<E> current = head;
		
		// repeatedly print the node and move to next
		while(current != null) {			
			System.out.print(current.getInfo()+", ");
			current = current.getLink();			
		}
		
	}

}
