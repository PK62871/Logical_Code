package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindAllFactors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number  To Find Factor : ");
		int num = sc.nextInt();
		
		
		findFactors(num);
		
		List<Integer> factor = findFactor(num);
		System.out.println(factor);
	}

	
	//1st Way Brute Force......in..........O(n)...
	
	public static void findFactors(int n) {
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	
	// Another Way....
//	1 * 60
//	2*  30
//	3*  20
//	4 * 15
//	5 * 12
//	6 *  10
//	10 * 6
//	12 * 5
//	15 * 4
//	20 * 3
//	30 * 2
//	60 * 1
	
	
	public static List<Integer> findFactor(int n) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i <= Math.sqrt(n); i++) {
			
			if(n % i == 0) {
				list.add(i);
				
				if((n/i) != i) {
					list.add(n/i);
				}
			}
			
			
		}
		Collections.sort(list);
		return list;
	}
}
