package p1;

public class CountTheNumberOfOccurance {

	public static void main(String[] args) {

		int [] arr = {10,20,30,40,50,60,70,80,90,10,2,3,4,10};
		
		int target = 10;
		
		int numberOfOccurance = countTheNumberOfOccurance(arr,target);
		
		System.out.println("Number of Occurance of this Element is : - " + numberOfOccurance);
	}

	public static int countTheNumberOfOccurance(int[] arr, int target) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (target == arr[i]) {
				count++;
			}
		}
		return count;

	}
}
