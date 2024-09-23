package p1;

import java.util.Scanner;

public class StarPrinting3 {

	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row :");
		int row = sc.nextInt();
		
		print(row);
	}
	
	public static void print(int n) {
		
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= n-row+1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
