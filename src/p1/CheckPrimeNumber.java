package p1;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number To check Prime : ");
		int num = sc.nextInt();

		checkPrime(num);
		
		boolean primeNumber = checkPrimeNumber(num);
		
		System.out.println(primeNumber ? "Prime" : "Not Prime");
	}

	public static void checkPrime(int n) {
		
		//Brute Force..........in........O(N);
		
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("The Number is Prime Number : " + n);
		}else {
			System.out.println("The Number is Not Prime Number : " + n);
		}	
		
	}
	
	
	
	// Another Way..................................................
	public static boolean checkPrimeNumber(int n) {
		
		if(n <= 1) {
			return false;
		}
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
		
	}
   


}