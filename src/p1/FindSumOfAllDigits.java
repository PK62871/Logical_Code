package p1;

import java.util.Scanner;

public class FindSumOfAllDigits{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter a Number : - ");
		int num = sc.nextInt(); 
		
		int sum = SumOfDigits(num);
		System.out.println("Sum Of All The Digits are : - " + sum);
	}
	
	public static int SumOfDigits(int n) {
		
		int sumOfDigits = 0;
		
		while(n > 0) {
	
			sumOfDigits = sumOfDigits + (n % 10);
			n = n / 10;
		}
		return sumOfDigits;
	}
}
