package p1;

public class FindSecondMinElement {

	public static void main(String[] args) {
		
		int [] arr = {0,4,5,6,7,9,1};
		
//		int findMin = findMin(arr);
//		System.out.println(findMin);
		
		
		int secondMin = findSecondMin(arr);
		System.out.println("Second Min Element Of Array :- " +secondMin);
	}
	
	public static int findMin(int [] arr) {
		
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	
	public static int findSecondMin(int [] arr) {
		
		int min = findMin(arr);
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == min) {
				arr[i] = Integer.MAX_VALUE;
			}
		}
		
		int minFound = findMin(arr);
		return minFound;
		
	}
}
