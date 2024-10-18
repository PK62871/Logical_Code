package recursion;

import java.util.Scanner;

public class PrintNnaturalReverse {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		printReverseWay(n);
	}

	public  static void printReverseWay(int n) {
		
		if(n == 1) {
			System.out.println(n);
			return;
		}
		
		System.out.println(n);
		printReverseWay(n-1);
		
	}
	
	
}
