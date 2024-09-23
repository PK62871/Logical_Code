package p1;

import java.util.ArrayList;
import java.util.List;

public class CountAndPrintTripletsOfSum {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5,8,6,4,6};
		int sum = 6;
		
//		int numberOfTriplets = countTheNumberOfTriplets(arr, sum);
//		
//		System.out.println("Total Trplets are :- " + numberOfTriplets);
		
		List<List<Integer>> triplets = printTheTriplets(arr, sum);
		
		System.out.println("Total Triplets are :- " + triplets);
	}
	
	
	//Count The Triplets............................
	
	public static int countTheNumberOfTriplets(int arr [], int target) {
		
		int len = arr.length;
		int count = 0;
		
		//it will find 1st number...
		for(int i = 0; i < len; i++) {
			
			//it will find 2nd Number..
			for(int j = i +1; j < len; j++) {
				
				// it will find 3rd Number
				for(int k = j+1; k < len; k++) {
					if(arr[i] + arr[j] + arr[k] == target) {
						count++;
					}
				}
			}
		}
		return count;
	}
	
	
	
			public static List<List<Integer>> printTheTriplets(int [] arr, int target){
				
				int len = arr.length;
				
				List<List<Integer>> result = new ArrayList<List<Integer>>();
				for(int i = 0; i < len; i++) {
					for(int j = i+1; j < len; j++) {
						for(int k = j+1; k < len; k++) {
							if(arr[i] + arr[j] + arr[k] == target) {
								List<Integer> temp = new ArrayList<>();
								temp.add(arr[i]);
								temp.add(arr[j]);
								temp.add(arr[k]);
								
								result.add(temp);
							}
						}
					}
				}
				return result;
				
			}
}
