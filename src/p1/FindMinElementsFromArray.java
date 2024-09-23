package p1;

import java.util.Scanner;

public class FindMinElementsFromArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Size OPf Array : - ");
		int arraySize = sc.nextInt();

		int[] arr = new int[arraySize];

		for (int i = 0; i < arraySize; i++) {
			System.out.println("Enter The Elements Of array :-");
			arr[i] = sc.nextInt();
		}

		for (int x : arr) {
			System.out.println("Array Elements:- " + x);
		}

		findMin(arr);

	}

	public static void findMin(int[] arr) {

		int min = arr[0];

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minumum Element from an Arrays is:- " + min);
	}
}
