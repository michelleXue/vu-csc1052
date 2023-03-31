package week11;

public class CircularArrayQueue<T> implements Queue<T> {
	
	private final static int DEFAULT_CAPACITY = 20;
	
    private T[] queue;  // the array that holds the queue elements
    private int front;  // the index of the first element in the queue
    private int rear;   // the index of the next available location to store an element
    private int count;  // the number of elements in the queue
    
    // Sets up an empty queue using the default capacity.
    public CircularArrayQueue() {
        this(DEFAULT_CAPACITY);
    }
    
    // Sets up an empty queue using the specified capacity.
    public CircularArrayQueue(int initialCapacity) {
        front = 0;
        rear = 0;
        count = 0;
        queue = (T[])(new Object[initialCapacity]);
    }
    
    // Adds the specified element to the rear of the queue. The array
    // capacity is expanded if necessary.
    @Override
    public void enqueue(T element) {
    	
    	// step 1. check if the queue is full or not
    	
    	// step 2. if not full, add new element
    	// 2.1 add new element
    	// 2.2 update the rear index with wrap around
    	// 2.3 update count
    	
    	if (count == queue.length)
    		return;
        
    	queue[rear] = element;
    	rear = (rear + 1) % queue.length; 
    	count++;
    }
    
    // Creates an array with twice the capacity as the current queue array.
    // Copies the elements from the current queue into the larger array
    // starting at index 0. Resets the front and rear indexes.
    private void expandCapacity() {

    }

	@Override
	public T dequeue() throws EmptyQueueException {
		// step 1. check if the queue is empty or not
    	
    	// step 2. if not empty, remove front element
    	// 2.1 store the front element to temp
		// 2.2 set front element to null
    	// 2.3 update the front index with wrap around
    	// 2.4 update count
		// 2.5 return temp
		
		if (count == 0) {
			throw new EmptyQueueException("queue is empty");
		}
		
		T temp = queue[front];
		queue[front] = null;
		front = (front + 1) % queue.length;
		count--;
		
		return temp;
	}

    // Returns a reference to the element at the front of the queue, without
    // removing it from the queue.
    public T first() throws EmptyQueueException {
        if (isEmpty())
            throw new EmptyQueueException("An attempt was made to access the first " +
                                          "element of an empty queue.");

        return queue[front];
    }

    // Returns true if the queue is empty and false otherwise.
    public boolean isEmpty() {
        return count == 0;
    }

    // Gets the number of elements in the queue.
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

            // Add each element to the description.
            int i = front;

            for (int num = 1; num <= count; num++) {
                description += queue[i] + "  ";
                i = (i + 1) % queue.length;  // increment and wrap if necessary
            }

            description += "\n";
        }

        return description;
    }

}
