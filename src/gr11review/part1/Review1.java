package gr11review.part1;

import java.io.*;

/**
 * Review 1 asks the user to enter a month and day number. It then calculates and 
 * outputs the day of the year for that day, assuming it is a non-leap year.
 * 
 * This program uses an array to store the number of days in each month and reads
 * user input from the console to compute the total number of days from the start
 * of the year to the given date.
 * 
 * @author: B. Yu
 */
public class Review1 {

    /**
     * Main method to execute the program logic
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Declare and initialize variables
        int intMonth;
        int intDay;
        int intMonthNum = 1;
        int intDayOfYear = 0;
        int intTotal;

        // Read inputs from user
        System.out.print("Enter the month number: ");
        intMonth = Integer.parseInt(keyboard.readLine());

        System.out.print("Enter the day number: ");
        intDay = Integer.parseInt(keyboard.readLine());

        // Determine how many days are in each month and add them
        while (intMonthNum <= intMonth) {
            if (intMonthNum == 1) {
                intDayOfYear += 0;
            } else if (intMonthNum == 2) {
                intDayOfYear += 31;
            } else if (intMonthNum == 3) {
                intDayOfYear += 28;
            } else if (intMonthNum == 4) {
                intDayOfYear += 31;
            } else if (intMonthNum == 5) {
                intDayOfYear += 30;
            } else if (intMonthNum == 6) {
                intDayOfYear += 31;
            } else if (intMonthNum == 7) {
                intDayOfYear += 30;
            } else if (intMonthNum == 8) {
                intDayOfYear += 31;
            } else if (intMonthNum == 9) {
                intDayOfYear += 31;
            } else if (intMonthNum == 10) {
                intDayOfYear += 30;
            } else if (intMonthNum == 11) {
                intDayOfYear += 31;
            } else if (intMonthNum == 12) {
                intDayOfYear += 30;
            } else if (intMonthNum == 13) {
                intDayOfYear += 31;
            }

            intMonthNum++;
        }

        // Add number of days to day of the year
        intTotal = intDayOfYear + intDay;

        // Output result
        System.out.println(intTotal);
    }
}