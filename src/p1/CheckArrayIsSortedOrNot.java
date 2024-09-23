package p1;

public class CheckArrayIsSortedOrNot {

	public static void main(String[] args) {
		
		int [] arr = {3,56,6};
		
		boolean sortedOrNot = checkArrayIsSortedOrNot(arr);
		
		if(sortedOrNot) {
			System.out.println("Array is Sorted.....");
		}else {
			System.out.println("Array is not Sorted.....");
		}
	}
	
	public static boolean checkArrayIsSortedOrNot(int [] arr) {
		
		boolean isSorted = true;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				isSorted = false;
				break;
			}
		}
		return isSorted;
		

	}
}
