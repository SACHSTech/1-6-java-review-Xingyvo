package gr11review.part1;

import java.io.*;

/**
 * Review 5 asks for the yearly amount, annual compound interest, and target 
 * amount, and then outputs the number of years it will take for the 
 * investment to reach the targeted amount.
 * 
 * @author: B. Yu
 */
public class Review5 {

    /**
     * Main method to execute the program's logic
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Declare variables
        int intYear;
        double dblAmount;
        double dblYearlyAmount;
        double dblRate;
        double dblCompoundInterestRate;
        double dblTargetAmount;

        // Ask user for invested amount, compound interest rate, and target amount
        System.out.print("Enter the yearly invested amount: ");
        dblAmount = Double.parseDouble(keyboard.readLine());

        System.out.print("Enter the compound interest rate: ");
        dblCompoundInterestRate = Double.parseDouble(keyboard.readLine());

        System.out.print("Enter the target amount: ");
        dblTargetAmount = Double.parseDouble(keyboard.readLine());

        // Initialize variables
        dblYearlyAmount = dblAmount;
        intYear = 0;

        // Calculate how long it will take to earn target amount
        while (dblAmount <= dblTargetAmount && dblTargetAmount != 0) {
            // Add an additional yearly amount after the first year
            if (intYear > 0) {
                dblAmount += dblYearlyAmount;
            } 
            if (dblCompoundInterestRate == 0 ) {
                dblAmount += dblYearlyAmount;
            }
        
            // Calculate interest rate and total 
            dblRate = (dblCompoundInterestRate/100) * dblAmount;
            dblAmount += dblRate;

            // Update the year and add the yearly invested amount
            intYear++; 
        }

        // Output result
        System.out.println("The target amount will be earned in " + intYear + " years.");
    }
}