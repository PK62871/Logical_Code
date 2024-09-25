package p1;

public class FindSecondMaxElements {
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8,9};
		findSecondLargest(arr);
	}
	
	public static void findSecondLargest(int[] arr) {
		
		int firstLargest = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > firstLargest) {
				firstLargest = arr[i];
			}
		}
		
		int secondLargest = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > secondLargest && arr[i] != firstLargest) {
				secondLargest = arr[i];
			}
		}
		
		System.out.println("2nd LargestElemets is :- " + secondLargest);
	}
}
