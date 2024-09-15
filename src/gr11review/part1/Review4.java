package gr11review.part1;

import java.io.*;
import java.text.*;

public class Review4 {
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Format the numbers
        NumberFormat numberFormat = new DecimalFormat("$#,##0.00"); 
    
        // Declare and intialize variables
        int intNumOfItems; 
        double dblPrice;
        double dblTax;
        double dblSubtotal = 0;
        double dblTotal = 0;

        // Ask for how many items
        System.out.print("How many items do you want to buy? ");
        intNumOfItems = Integer.parseInt(keyboard.readLine());

        // Ask user for price of each item
        for (int i = 1; i <= intNumOfItems; i++) {
            System.out.print("Enter the price for item " + i + ": ");
            dblPrice = Double.parseDouble(keyboard.readLine());

            // Calculate subtotal
            dblSubtotal += dblPrice;
        }

        // Output subtotal
        System.out.println("Subtotal: " + numberFormat.format(dblSubtotal));

        // Calculate tax and output tax
        dblTax = dblSubtotal * 0.13;
        System.out.println("Tax: " + numberFormat.format(dblTax));

        // Calculate and output total
        dblTotal = dblSubtotal + dblTax;
        System.out.println("Total: " + numberFormat.format(dblTotal));
    }
}