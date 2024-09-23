package p1;

import java.util.ArrayList;
import java.util.List;

public class CountPairsOfSumAndPrintPairs {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int sum = 7;

//		int numberOfPairs = countNumberOfPairs(arr, sum);
//		
//		System.out.println("Numbers Of Pairs are :- " + numberOfPairs);

		List<List<Integer>> printPairs = printPairs(arr, sum);

		System.out.println("All The Pairs are :- " + printPairs);
	}
	
	
	

	public static int countNumberOfPairs(int[] arr, int target) {

		int len = arr.length;
		int count = 0;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] + arr[j] == target) {
					count++;
				}
			}
		}
		return count;
	}

				public static List<List<Integer>> printPairs(int arr[], int target) {
			
					int len = arr.length;
			
					List<List<Integer>> result = new ArrayList();
			
					for (int i = 0; i < len; i++) {
						for (int j = i + 1; j < len; j++) {
							if (arr[i] + arr[j] == target) {
			
								List<Integer> foundPairs = new ArrayList<>();
								foundPairs.add(arr[i]);
								foundPairs.add(arr[j]);
			
								result.add(foundPairs);
							}
						}
					}
					return result;
			
				}

}
