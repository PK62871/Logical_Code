package p1;

public class SortArrayEvenOdd {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8,9,10,11};
		
		// Output Should be..
		// {2,4,6,8,1,3,5,7,9} order dosen't matter
		
		
		sortArrayInEvenOdd(arr);
	}
	
	// swap the value
	public static void swap(int [] arr,int left,int right) {
		
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	public static void printArray(int [] arr) {
		
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void sortArrayInEvenOdd(int arr []) {
		
		int n = arr.length;
		
		int left = 0;
		int right = n - 1;
		
		while(left < right) {
			if(arr[left] % 2 == 1 && arr[right] % 2 == 0) {
//				int temp = arr[left];
//				arr[left] = arr[right];
//				arr[right] = temp;
				
				swap(arr, left, right);
				left++;
				right--;
			}
			if(arr[left] % 2 == 0) {
				left++;
			}
			if(arr[right] % 2 == 1) {
				right--;
			}
			
			
		}
//		for(int i = 0; i < n; i++) {
//			System.out.print(arr[i] + " ");
//		}
		printArray(arr);
	}
}
