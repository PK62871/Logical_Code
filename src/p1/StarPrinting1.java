package p1;

import java.util.Scanner;

public class StarPrinting1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Row : ...");
		
		int row = sc.nextInt();
		
		printPattern(row);
	}
	
	
	public static void printPattern(int row) {
		
		for(int i = 0; i < row; i++) {
			
			for(int j = 0; j <= row; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
