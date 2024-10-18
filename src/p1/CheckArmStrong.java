package p1;

import java.util.Scanner;

public class CheckArmStrong {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check armStrong : ");
		int num = sc.nextInt();
		
		boolean isArmStrong = checkArmStrong(num);
		
		System.out.println(isArmStrong ? "Number is ArmStrong" : "Number is Not ArmStrong");
	}
	
	public static boolean checkArmStrong(int n) {
		
		int result = 0;
		int temp = n;
		while(n > 0) {
			
		int digit = n % 10;
		result = result + (digit * digit * digit);
		n = n/10;
		}
		
		if(temp == result) {
			return true;
		}
		return false;
		
	}
}
