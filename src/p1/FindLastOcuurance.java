package p1;

public class FindLastOcuurance {

	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,10,5,6,7,10};
		
		int target = 10;
		
		int findLastOccurance = findLastOccurance(arr, target);
		
		System.out.println("Last Index Found Of That Elements :- " + findLastOccurance);
	}
	
	public static int findLastOccurance(int [] arr , int target) {
		
		int foundLastIndex = -1;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				foundLastIndex = i;
			}
		}
		return foundLastIndex;
	}
}
