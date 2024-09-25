package p1;

public class FindFirstRepeatElements {

	public static void main(String[] args) {
		
		// find First Repeat value if found return value else -1;
		// o/p = 2;
		int arr [] = {1,2,3,4,5,6,3,2};
		
		
		int firstRepeat = findFirstRepeat(arr);
		
		System.out.println("First RepeatElement Of An Array is :- " + firstRepeat);
	}
	
	public static int findFirstRepeat(int [] arr) {
		
		int len = arr.length;
		
		// it will pic first Element.
		for(int i = 0; i < len; i++) {
			for(int j = i+1; j < len; j++) {
				// nOw compare i and j value....
				if(arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
		
	}
}
