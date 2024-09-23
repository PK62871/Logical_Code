package p1;

public class FindElementsExistOrNot {

	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50,60,70,80,90};
		
		int target = 900;
		
		boolean existsOrNot = elementsExistsOrNot(arr, target);
		
		if(existsOrNot) {
			System.out.println("This Element is Exists " + target);
		}else {
			System.out.println("This Elements is Not Exists :- " + target);
		}
	}
	
	public static boolean elementsExistsOrNot(int [] arr , int target) {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return true;
			}
		}
		return false;
	}
}
