package p1;

public class SortArrayOf_0And1 {

	public static void main(String[] args) {
		
		int [] arr = {0,1,0,0,1,1,0,0,0,0,1,1,};
		
		sortArray(arr);
	}
	
	public static void sortArray(int [] arr) {
		
		int n = arr.length;
		
		int count = 0;
		
		// count the no of zero
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == 0) {
				count++;
			}
		}
		
		System.out.println(count);
		// now fill the zero till (n-count);
		for(int i = 0; i < n; i++) {
			if(i <  count) {
				arr[i] = 0;
			}else {
				arr[i] = 1;
			}
		}
	
		
		// finally print the Sorted Array..................
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
