package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindPrimefactors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Numbe rTo finmd Prime Factors : ");
		int num = sc.nextInt();
		
		List<Integer> factors = findPrimeFactors(num);
		
		System.out.println(factors);
	}

	public static List<Integer> findPrimeFactors(int n) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i <= Math.sqrt(n); i++) {
			
			if(n % i == 0) {
				if(prime(i)) {
					list.add(i);
				}
				
				if((n/i) != i) {
					if(prime(n/i)) {
						list.add(n/i);
					}
				}
			}
		}
		return list;
	}

	
	// Find Prime.....................................
	public static boolean prime(int n) {

		if (n <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
