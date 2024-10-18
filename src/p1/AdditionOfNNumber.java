package p1;

import java.util.Scanner;

public class AdditionOfNNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		int sumOfNumber = sumOfNumber(n);
		System.out.println(sumOfNumber);
	}

	public static int  sumOfNumber(int n) {
		
		if(n == 1) {
			
			return 1;
		}else {
			return n + sumOfNumber(n-1);
		}

		
	}
}
