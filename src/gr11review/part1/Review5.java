package gr11review.part1;

import java.io.*;

public class Review5 {
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Declare variables
        double dblYear;
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
        dblYear = 0;

        // Calculate how long it will take to earn target amount
        while (dblAmount <= dblTargetAmount && dblTargetAmount != 0) {
            // Calculate interest rate and total 
            dblRate = dblCompoundInterestRate / dblYearlyAmount * dblAmount;
            dblAmount += dblRate;

            // Update the year and add the yearly invested amount
            dblAmount += dblYearlyAmount;
            dblYear++;
        }

        // Output result
        System.out.println("The target amount will be earned in " + dblYear + " years.");
    }
}