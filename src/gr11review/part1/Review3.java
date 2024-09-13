package gr11review.part1;

import java.io.*;

public class Review3 {
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        
        // Prints the odd numbers from 20 to 100
        for (int i = 21; i <= 100; i+=2) {
            System.out.println(i);
        }

        // Prints the numbers from 29 to 2 in decreasing order
        for (int i = 29; i >= 2; i--) {
            System.out.println(i);
        }
    }
}
