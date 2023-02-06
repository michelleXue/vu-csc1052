package week3;

public class Bucket<E> {
	// attribute: an array that holds five objects with type E.
	private E[] arr;
	private int size; // current number of object in arr
	
	public Bucket () {
		arr = (E[]) new Object[5];
		size = 0; // intial object is empty
	}
	
	public void add (E o) {
		if (size == arr.length) {
			return;
		} else {
			arr[size] = o;
			size++;
		}
	}
	
	public String toString() {
		String temp = "";		
		for (int i = 0; i < size; i++) {
			temp = temp + ((i == size - 1) ? arr[i].toString() : arr[i].toString() + ",");
		}
		return temp;
	}
	
	
	// remove the last object
	public void removeLast() {
		if (size > 0) {
			arr[size-1] = null;
			size--;					
		}
	}
	
	// removing an object from this arr
	public void remove(E o) {
		// 1. search the element -> index 
		int index = search(o);
		
		// 2. remove by index
		E[] tempArr = (E[]) new Object[5];
		
		if (index != -1) { // found element
			// before index
			for (int i = 0; i < index; i++) {
				tempArr[i] = arr[i];
			}			
			// after index
			for (int i = index; i < size; i++) {
				tempArr[i] = arr[i+1];
			}
			
			arr = tempArr;
			size--;
		}
		
		
	}

	private int search(E o) {		
		for (int i = 0; i < size; i++) {
			if (o.equals(arr[i]))
				return i;
		}
		return -1;
	}
	
	
	
}
