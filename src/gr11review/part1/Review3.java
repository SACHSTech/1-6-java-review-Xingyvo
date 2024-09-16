package gr11review.part1;

import java.io.*;
 
/**
 * Review 3 prints the odd numbers from 20-100 and prints the numbers from 29-2
 * in decreaing order with separate loops.
 */
public class Review3 {

    /**
     * Main method to execute the program's logic
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException {
        
        // Prints the odd numbers from 20 to 100
        for (int i = 21; i <= 100; i+=2) {
            System.out.println(i);
        }

        System.out.println();

        // Prints the numbers from 29 to 2 in decreasing order
        for (int i = 29; i >= 2; i--) {
            System.out.println(i);
        }
    }
}
