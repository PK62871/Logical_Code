package p1;

public class SelectionSort {

	public static void main(String[] args) {
		
		int [] arr = {9,8,7,6,5,4,3,2,1};
		selectionSort(arr);
	}
	
	public static void selectionSort(int[] arr) {
	    int n = arr.length;
	    int min;

	    for (int i = 0; i < n; i++) {
	        min = i;
	        for (int j = i + 1; j < n; j++) {
	            if (arr[j] < arr[min]) {
	                min = j;
	            }
	        }

	        // Swap the elements after finding the minimum
	        int temp = arr[i];
	        arr[i] = arr[min];
	        arr[min] = temp;
	    }

	    // Print the sorted array
	    for (int x : arr) {
	        System.out.print(x + " ");
	    }
	}
	
}
