package p1;

public class FindNon_RepeatedElements {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,4,3,2,1};
		
		int nonRepeatNumber = findNonRepeatNumber(arr);
		
		System.out.println("This is the Number whic is non-reapeat in Array :- " + nonRepeatNumber);
	}
	
	public static int findNonRepeatNumber(int [] arr) {
		
		int len = arr.length;
		
		
		// Here , We are checking value is repeat or not if repeat we are markin it as -ve;
		for(int i = 0; i <len; i++) {
			for(int j = i+1; j < len; j++) {
				if(arr[i] == arr[j]) {
					arr[i] = -1;
					arr[j] = -1;
				}
			}
		}
		
		
		// we are checking and iterating..
		int found = 0;
		for(int i = 0; i < len; i++) {
			if(arr[i] > 0) {
				found = arr[i];
			}
		}
		return found;
	}
}
