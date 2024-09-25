package p1;

public class RotateArrayByKth {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };

		int k = 4;
		
		
		//rotateArray(arr, k);
		rotateArrayByKth(arr, k);

	}

	public static void rotateArray(int arr[],int start, int end) {


		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			
		}
		
		
		
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
	
	public static void rotateArrayByKth(int arr[], int k) {
		
		int n = arr.length;
		k = k % n;
		
		// int [] arr = {1,2,3,4,5,6,7};
		// k = 3;
		
		// 1st rotate...............
		rotateArray(arr,0,n-k-1);
		System.out.println();
		
		//roate 2nd time............
		rotateArray(arr, n-k, n-1);
		System.out.println();
		
		//rotate 3rd times..............................
		rotateArray(arr, 0, n-1);
	}

	
	
//	public static void rotateArray(int[] arr, int k) {
//
//		int n = arr.length;
//		k = k % n;
//
//		// 1st rotation................
//		// (arr,n-k;n-1;)
//
//		int i = n - k;
//		int j = n - 1;
//
//		while (i < j) {
//			int temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//			i++;
//			j--;
//		}
//
//		for (int a = 0; a < n; a++) {
//			System.out.print(arr[a] + " ");
//		}
//		System.out.println();
//
//		// rotate 2nd time...............
//		// int arr[] = { 1, 2, 3, 4, 5, 6 };
//
//		int x = 0;
//		int y = n - k - 1;
//
//		while (x < y) {
//			int temp = arr[x];
//			arr[x] = arr[y];
//			arr[y] = temp;
//			x++;
//			y--;
//
//		}
//		for (int a = 0; a < n; a++) {
//			System.out.print(arr[a] + " ");
//		}
//		System.out.println();
//
//		// 3rd and final rotation.........
//		// int arr[] = { 1, 2, 3, 4, 5, 6 };
//
//		int a = 0;
//		int b = n - 1;
//		while (a < b) {
//			int temp = arr[a];
//			arr[a] = arr[b];
//			arr[b] = temp;
//			a++;
//			b--;
//		}
//
//		for (int f = 0; f < n; f++) {
//			System.out.print(arr[f] + " ");
//		}
//	}
}
