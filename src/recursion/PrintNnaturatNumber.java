package recursion;

import java.util.Scanner;

public class PrintNnaturatNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		printNaturalNumber(n);
		
	}
	
	public static void printNaturalNumber(int n) {
		if(n == 1) {
			System.out.println(n);
			return;
		}
		
		printNaturalNumber(n-1);
		System.out.println(n);
	}
}
