package gr11review.part1;

import java.io.*;

public class Review7 {
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Declare and intialize variables
        String strTheSentence; 
        int intCharacters;
        int intSpaces = 0;
        int intLetterA = 0;
        int intDashes = 0;
        String strDashes = "";

        // Ask user for a sentence
        strTheSentence = (keyboard.readLine());

        // Find and output the number of characters
        intCharacters = strTheSentence.length();
        System.out.println("There are " + intCharacters + " characters in the sentence.");

        // Find and output the number of spaces
        for (int i = 0; i < strTheSentence.length(); i++) {
             if (Character.isWhitespace(strTheSentence.charAt(i))) 
             intSpaces++;
        }

        System.out.println("There are " + intSpaces + " spaces in the sentence.");

        // Find and output how many times the letter a occurs
        for (int i = 0; i < strTheSentence.length(); i++) {
            strTheSentence.toLowerCase();
            if (strTheSentence.charAt(i) == 'a') {
                intLetterA++;
            }
        }

        System.out.println("There are " + intLetterA + " letter a in the sentence."); 

        // Take the odd numbered characters in the sentence to produce dashes
        for (int i = 0; i < strTheSentence.length() + 1; i++) {;
            if (i % 2 != 0) {
                intDashes++;
            } 
        }

        for (int i = 0; i < intDashes; i ++) {
            strDashes += "-";
        }

        // Output the dashes
        System.out.println(strDashes);
    }
}