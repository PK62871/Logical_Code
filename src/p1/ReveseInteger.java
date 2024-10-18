package p1;

import java.util.Scanner;

public class ReveseInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Integer Number : - ");
		int num = sc.nextInt();
		
		int reverseInteger = reverseInteger(num);
		System.out.println("Output is : - " + reverseInteger);
	}
	
	public static int reverseInteger(int n) {
		
		int reverseNumber = 0;
		
		boolean isNegative = false;
		if(n < 0) {
			isNegative = true;
		}
		
		n = Math.abs(n);
		while(n > 0) {
			int digits = n % 10;
			reverseNumber = reverseNumber * 10 + digits;
			n = n/10;
		}
		return isNegative ? -reverseNumber : reverseNumber;
	}
}
