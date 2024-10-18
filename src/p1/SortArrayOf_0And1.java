package p1;

public class SortArrayOf_0And1 {

	public static void main(String[] args) {
		
		int [] arr = {0,1,0,0,1,1,0,0,0,0,1,1,};
		
		// this is call of 2nd way..................
		sortArray(arr);
		
		// this is call of 1st way....
		//sortArray(arr);
	}
	
	
	public static void swap(int [] arr, int left,int right) {
		
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
	
	
	// 2nd way by 2-pinter..............................................
	
	public static void sortArray(int [] arr) {
		
		// arr = {1,0,1,0,1,0,1,0,1,1,1,0,0,0}
		int n = arr.length;
		int left = 0;
		int right = n-1;
		
		while(left < right) {
			
			if(arr[left] == 1 && arr[right] == 0) {
//				int temp = arr[left];
//				arr[left] = arr[right];
//				arr[right] = temp;
				
				
				swap(arr, left, right);
				left++;
				right--;
			}
			if(arr[left] == 0) {
				left++;
			}
			if(arr[right] == 1) {
				right--;
			}
		}
		
		
//		for(int i = 0; i < n; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		printArray(arr);
		
	}
	//1st Way.............................................................................................
//	public static void sortArray(int [] arr) {
//		
//		int n = arr.length;
//		
//		int count = 0;
//		
//		// count the no of zero
//		
//		for(int i = 0; i < n; i++) {
//			if(arr[i] == 0) {
//				count++;
//			}
//		}
//		
//		System.out.println(count);
//		// now fill the zero till (n-count);
//		for(int i = 0; i < n; i++) {
//			if(i <  count) {
//				arr[i] = 0;
//			}else {
//				arr[i] = 1;
//			}
//		}
//	
//		
//		// finally print the Sorted Array..................
//		for(int i = 0; i < n; i++) {
//			System.out.print(arr[i] + " ");
//		}
//	}
}
