package p1;

public class FindFirstOccurance {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60 };

		int target = 60;

		int targetFound = findFirstOccurance(arr, target);

		System.out.println(targetFound);
	}

	public static int findFirstOccurance(int[] arr, int target) {

		int ocuurance = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				ocuurance = i;
				break;
			}
		}
		return ocuurance;
	}
}
