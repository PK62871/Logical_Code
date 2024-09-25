package p1;

public class ReverseTheArray {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		// o/p = {5,4,3,2,1};
		
//		System.out.println("Before Reverse Array is :-");
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		int[] reverseArray = reverseArray(arr);
//			
//		System.out.println("After Reverse Array is :- ");
//		for(int i = 0; i < reverseArray.length; i++) {
//			System.out.print(reverseArray[i] + " ");
//		}
		
		reverseArray(arr);
		
	}
	
//	public static int [] reverseArray(int [] arr) {
//		
//		int len = arr.length;
//		
//		int temp [] = new int [len];
//		int j = 0;
//		
//		for(int i = len-1; i >=0; i--) {
//			temp[j] = arr[i];
//			j++;
//		}
//		return temp;
//		
//	}
	
	
	public static void reverseArray(int arr[]) {
		
		int left = 0;
		int right = arr.length-1;
		
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
