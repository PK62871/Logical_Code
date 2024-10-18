package p1;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter a Number to check Palindrome : ");
		int num = sc.nextInt();
		
		boolean isPalindrome = checkPalindrome(num);
		
		System.out.println(isPalindrome ? "Number is palindrome" : "Number is not palindrome");

	}
	
	public static boolean checkPalindrome(int n) {
		
		
		
		int duplicate = n;
		int reverse = 0;
		
		while(n > 0) {
			int digit = n % 10;
			reverse = (reverse * 10) + digit;
			n = n/10;
		}
		
		if(duplicate == reverse) {
			return true;
		}
		return false;
		
	}
}
