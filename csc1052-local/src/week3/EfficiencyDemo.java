package week3;

public class EfficiencyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an array with size n contains integer increasingly from 0 to n-1
		int n = 5;
		int [] array = new int[n];
		for (int i =0; i < n; i++) {
			array[i] = i;
		}
		
		// set the target value
		int target = array[array.length -1];
		
		System.out.println("Linear Search: " + LinearSearch(array, target));
		System.out.println("Binary Search: " + binarySearch(array, target));
		
	}
	
	public static int LinearSearch (int[] list, int target) {
		int count = 0;
		
		int index = 0;
		while (index < list.length && list[index] != target) {
		    index++;
		    count++;
		}

		if (index < list.length)
		    System.out.println(target + " was found at index " + index);
		else
		    System.out.println(target + " is not in the array.");		
		return count;
	}
	
    public static int binarySearch(int[] list, int target) {
        int low = 0;
        int high = list.length - 1;
        int mid;
        int count = 0;

        while (high >= low) {
            mid = (low + high) / 2;

            if (target == list[mid])  // target was found
                return count;
            else if (target < list[mid])
                high = mid - 1;
            else
                low = mid + 1;
            
            count++;
        }
        return count;  // target is not in list
    }
	

}
