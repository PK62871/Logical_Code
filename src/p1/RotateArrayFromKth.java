package p1;

public class RotateArrayFromKth {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5,6,7};
		int k = 80;
		
		int[] rotateArray = rotateArray(arr, k);
		
		for(int i = 0; i < rotateArray.length; i++) {
			System.out.print(rotateArray[i] + " ");
		}
	}
	
	public static int []  rotateArray(int [] arr, int k) {
		
		int len = arr.length;
		k = k%len;
		
		int [] temp = new int [len];
		
		int j = 0;
		
		for(int i = len-k; i < len; i++) {
			 temp[j] = arr[i];
			 j++;
		}
		
		for(int i = 0; i < len-k; i++) {
			temp[j] = arr[i];
			j++;
		}
		
	
		return temp;
	}
	
}
