package p1;

import java.util.Scanner;

public class FindMaxElementFromArray {

	public static void main(String[] args) {

		// Dynamic Array
		// Input.............................................................
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Size Of an Array:- ");
		int sizeOfArray = sc.nextInt();

		int[] arr = new int[sizeOfArray];

		for (int i = 0; i < sizeOfArray; i++) {
			System.out.println("Enter The Array Value:- ");
			arr[i] = sc.nextInt();
		}

		for (int x : arr) {
			System.out.println("Array Elements are " + x);
		}

		findMax(arr);

	}

	public static void findMax(int[] arr) {
		int max = arr[0];

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("MAx Element Of An Array is :- " + max);
	}
}
