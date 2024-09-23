package p1;

import java.util.Scanner;


public class Pyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            // Print leading spaces
            for (int j = row; j > i; j--) {
                System.out.print(" ");
            }

            // Print numbers in increasing order
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
        
        sc.close(); // Close the scanner
    }
}

