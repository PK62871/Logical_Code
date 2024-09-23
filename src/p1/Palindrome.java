package p1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name :-");
		
		String name = sc.nextLine();
		
		  
        String lowercase = name.toLowerCase();

       
        StringBuffer sb = new StringBuffer(lowercase);
        
        String reversedName = sb.reverse().toString();
        
        if (lowercase.equals(reversedName)) {
            System.out.println(name + " is a palindrome.");
        } else {
            System.out.println(name + " is not a palindrome.");
        }
        
	}

	
}
