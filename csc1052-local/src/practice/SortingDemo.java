package practice;

public class SortingDemo {

	public static void main(String[] args) {
		int[] list = new int[20];
		int[] list2 = {48,  26,  18,  77,  30,  42,  23,  69,  33};

        for (int i = 0; i < list.length; i++)
            list[i] = (int) (Math.random() * 90) + 10;

        System.out.println("Unsorted list:");
        for (int num : list2)
            System.out.print(num + "  ");

        quickSort(list2);

        System.out.println("\nSorted list:");
        for (int num : list2)
            System.out.print(num + "  ");

	}
	
	public static void quickSort(int[] list) {
	    quickSort(list, 0, list.length - 1);
	}
	
	
	public static void quickSort(int[] list, int low, int high) {
	    // Check index values to see if more sorting is needed.
	    if (low >= 0 && high >= 0 && low < high) {
	        // Partition the elements and get the index of the pivot.
	        int pivotIndex = partition(list, low, high);

	        // Sort the two partitions.
	        quickSort(list, low, pivotIndex - 1);   // left side of pivot
	        quickSort(list, pivotIndex + 1, high);  // right side of pivot
	    }
	}
	
	private static int partition(int[] list, int low, int high) {
	    // Select the last value in the partition as the pivot value.
	    // Note: consider alternative approaches to pivot selection.
	    int pivotValue = list[high];

	    // Start pivotIndex at the low end of the partition.
	    int pivotIndex = low - 1;

	    // Examine all elements in the partition, moving low elements
	    // before the current pivot position.
	    for (int i = low; i <= high; i++) {
	        if (list[i] <= pivotValue) {
	            pivotIndex++;

	            // Swap the low element with the value at the current
	            // pivot index.
	            int temp = list[pivotIndex];
	            list[pivotIndex] = list[i];
	            list[i] = temp;
	        }
	    }

	    return pivotIndex;
	}

}
