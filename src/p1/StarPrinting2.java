package p1;

import java.util.Scanner;

public class StarPrinting2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row :");
		int row = sc.nextInt();
		
		printrStar(row);
	}
	
	public static void printrStar(int n) {
		
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
