package p1;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8,9,8,5,4,2,1};
		
		Set<Integer> removeDuplicate = removeDuplicate(arr);
		
		System.out.println(removeDuplicate);
	}
	
	public static Set<Integer> removeDuplicate(int [] arr){
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		return set;
	}
}
