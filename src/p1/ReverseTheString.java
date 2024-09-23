package p1;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Something :-");

		String str = sc.nextLine();

		reverse(str);

	}

	public static void reverse(String str) {

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

	}

}
