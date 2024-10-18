package p1;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : - ");
		int num = sc.nextInt();
		
		int digits = countDigits(num);
		System.out.println("Number Of Digits are : - " + digits);
	}
	
	public static int countDigits(int n) {
		
		int count = 0;
		if(n <= 0) {
			return 1;
		}
		
		while(n > 0) {
			n = n/10;
			count++;
		}
		return count;
	}
}
