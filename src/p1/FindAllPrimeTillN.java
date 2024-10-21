package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAllPrimeTillN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number To find All Prime :- ");
		int num = sc.nextInt();
		
		List<Integer> allPrime = findAllPrime(num);
		System.out.println(allPrime);
		
	}
	
	//Find All prime Number Till N..................
	public static List<Integer> findAllPrime(int n){
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 2; i <= n; i++) {
			if(isPrime(i)) {
				list.add(i);
			}
		}
		return list;
	}
	
	// Method to Check Number is Prime Or Not.............
	
	public static boolean isPrime(int n) {
		
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
