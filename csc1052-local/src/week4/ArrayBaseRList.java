package week4;

public class ArrayBaseRList<E> implements RList<E> {

	// attributes
	private int size;  // size of list
	private E[] arr;  // array to represent the group of items.
	private int capacity = 100;
	
	public ArrayBaseRList () {
		size = 0; // start with an empty list
		arr = (E[]) new Object[capacity];
	}
	
	@Override
	public boolean add(E element) {
		// make sure it is not full
		if (size < capacity) {
			arr[size] = element;
			size++;
			return true;
		}
		return false;
	}

	
	/**
	 * @return the removed element, if empty, return null
	 */
	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
