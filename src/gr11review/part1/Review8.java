package gr11review.part1;

import java.io.*;
import java.util.Random;

/**
 * Review 8 stimulates 1000 pulls of a slot machine. Three random numbers (between
 * 0 and 8) are generated for each pull. Additionally, the program keeps count 
 * of the number of times a triple (all 3 numbers equal) was pulled.
 * 
 * @author: B. Yu
 */
public class Review8 {

    /**
     * Main method to execute the program's logic
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException {
        
        // Create a random class
        Random rand = new Random();

        // Declare and initialize variables
        int intRandom1;
        int intRandom2;
        int intRandom3;
        int intTriplesCount = 0;

        // Generate random integers between 0 and 8 (inclusive) 1000 times
        for (int i = 1; i <= 1000; i++) {
            intRandom1 = rand.nextInt(9);
            intRandom2 = rand.nextInt(9);
            intRandom3 = rand.nextInt(9);

            System.out.print(intRandom1 + " ");
            System.out.print(intRandom2 + " ");
            System.out.println(intRandom3);

            // If all 3 numbers are equal, update the count for triples
            if (intRandom1 == intRandom2 && intRandom2 == intRandom3) {
                intTriplesCount++;
            }
        }

        // Output the number of times a triples occured
        System.out.print(intTriplesCount);
    }
}