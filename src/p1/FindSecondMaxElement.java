package p1;

public class FindSecondMaxElement {

	public static void main(String[] args) {

		int[] arr = { 23, 4, 6, 7, 8, 54,9, 55, 34 };

		int secondMax = findSecondMax(arr);

		System.out.println("Second Max Number :- " + secondMax);

	}

	public static int findMax(int[] arr) {

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;

	}

	public static int findSecondMax(int[] arr) {

		int max = findMax(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
				int max2 = findMax(arr);

		return max2;

	}
}
