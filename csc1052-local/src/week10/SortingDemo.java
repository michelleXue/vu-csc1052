package week10;

public class SortingDemo {

	public static void main(String[] args) {
		
		int[] array = {48, 26, 18, 77, 30, 42, 23, 69, 33};
		
		//int[] sorted = selectionSort(array);
		// quickSort(array);
		insertionSort(array);
		
		System.out.println("after sorting:");
		for (int number : array) {
			System.out.print(number + " ");
		}

	}
	
	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}
	
	public static void quickSort(int[] array, int low, int high) {
		
		if ( low >= 0 && high >= 0 && low < high) {
			// 1. finding the pivot Index
			int pivotIndex = partition(array, low, high);
			
			// 2. recursively sort first half and second half
			quickSort(array, low, pivotIndex - 1); // first half
			quickSort(array, pivotIndex + 1, high);
		}
	}
	
	
	
	// goal 1: put the pivot in correct position, and return the pivot index.
	// goal 2: all elements on left should <= pivot value, all elements on right should > pivot value
	private static int partition(int[] array, int low, int high) {
		
		// set up the pivotIndex
		int pivotIndex = low - 1;
		
		// set up the pivot value, select the last element
		int pivot = array[high];
		
		// scan the unsorted range
		for (int i = low; i <= high; i++) {
			
			if (array[i] <= pivot) {
				
				// 1. update pivot index
				pivotIndex = pivotIndex + 1;
				
				// 2. swap
				int temp = array[pivotIndex];
				array[pivotIndex] = array[i];
				array[i] = temp;
			}
		}
		
		return pivotIndex;
	}

	private static int[] selectionSort(int[] array) {
		
		// sorting is in-place
		
		for (int i = 0; i < array.length; i++) {
			
			// find smallest element in range [i, array.length)
			int minIndex = i;
			
			// step 1. find the smallest element
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			
			// step 2. swap
			// swap the min element with element on position i
			int temp = array[i]; 
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
		
		return array;
	}
	
	private static void insertionSort(int[] array) {
		
		// start from second element
		for (int i = 1; i < array.length; i++) {
			
			// step1. store the current element
			int insertValue = array[i];
			
			// step2. shifting util the number is <= insertValue
			int j = i - 1;
			while (j >= 0 && array[j] > insertValue) {
				array[j+1] = array[j];
				
				j--;
			}
			
			// step3. assign the insert value to the stop location. 
			array[j+1] = insertValue;
		}
		
		
		
		
	}
	
	

}
