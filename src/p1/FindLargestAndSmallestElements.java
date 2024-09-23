package p1;

import java.util.Arrays;

public class FindLargestAndSmallestElements {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,6,8,0,9,5};
		int[] largestAndSmallest = findLargestAndSmallest(arr);
		
		System.out.println("The Smallest Element Of An Array is :- " + largestAndSmallest[0]);
		
		System.out.println("The Largest Element Of An Arrays is :- " + largestAndSmallest[largestAndSmallest.length-1]);
	}
	
	public static int [] findLargestAndSmallest(int [] arr) {
		
		
		Arrays.sort(arr);
		int temp [] = {arr[0],arr[arr.length-1]};
		
		return temp;
	}
}
