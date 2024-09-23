package p1;

public class CountTheLargetstElements {

	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50,60,70};
		
		int target = 30;
		
		int largestElementsCount = countLargestElements(arr, target);
		
		System.out.println("Total Largets Element is : - " + largestElementsCount);
	}
	
	public static int countLargestElements(int [] arr , int target) {
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > target) {
				count++;
			}
		}
		return count;
	}
}
