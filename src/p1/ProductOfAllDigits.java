package p1;

import java.util.Scanner;

public class ProductOfAllDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter a Number : - ");
		int num = sc.nextInt();
		
		int productOfDigits = productOfDigits(num);
		System.out.println("Product Of All The Digits are : - " + productOfDigits);
		
	}
	
	public static int productOfDigits(int n) {
		
		int product = 1;
		
		while(n > 0) {
			int digit = n % 10;
			product  = product * digit;
			n = n/10;
		}
		return product;
	}
}
