package gr11review.part1;

import java.io.*;
import java.text.*;

/**
 * Review 6 asks the user to keep on pricing items. If the user enters 0
 * then the program will stop.
 * 
 * @author: B. Yu
 */
public class Review6 {

    /**
     * Main method to execute the program's logic
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Foramt the numbers
        NumberFormat numberFormat = new DecimalFormat("$#,##0.00"); 

        // Declare and initialize variables
        double dblPrice = 0;
        double dblTax;
        double dblSubtotal = 0;
        double dblTotal = 0;
        boolean blnRun = true;

        // Ask for the price of an item
        while (blnRun) {
            System.out.print("Enter the price for an item: ");
            dblPrice = Double.parseDouble(keyboard.readLine());

            // Update subtotal
            dblSubtotal += dblPrice;

            // Stops when user enters 0
            if (dblPrice == 0) {
                blnRun = false;
            }
        }

        // Output subtotal
        System.out.println("Subtotal: " + numberFormat.format(dblSubtotal));

        // Calculate and output tax
        dblTax = dblSubtotal * 0.13;
        System.out.println("Tax: " + numberFormat.format(dblTax));

        // Calculate and output total
        dblTotal = dblSubtotal + dblTax;
        System.out.println("Total: " + numberFormat.format(dblTotal));
    }
}