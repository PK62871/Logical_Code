package p1;

public class AddArrayElements {

	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50};
		
		int sumOfAllElements = addElements(arr);
		
		System.out.println("Sum Of All Elements Of Array :- " + sumOfAllElements);
	}
	
	public static int  addElements(int [] arr) {
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
}
