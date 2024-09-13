package gr11review.part1;

import java.io.*;

public class Review2 {
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Declare variable
        int intChoice;

        // Print menu 
        System.out.println("0 - print a joke about your hair\n1 - print a joke about your feet\n2 - print a joke about your clothes\n3 - print a joke about your teacher");

        // Receive choice from user
        System.out.print("Choose a menu option: ");
        intChoice = Integer.parseInt(keyboard.readLine());

        // Output result based on choice
        switch (intChoice) {
            case 0: 
            System.out.println("What is the kind of hair that loves going on vacation on different beaches of the country?\nThe wavy hair!");
            break;
            case 1: 
            System.out.println("What sort of snack do feet like?\nDori-toes!");
            break;
            case 2: 
            System.out.println("No I am not a superhero...\nI just like wearing my underwear on the outside!");
            break;
            case 3:
            System.out.println("What kind of meals do math teachers eat?\nSquare meals!");
            break;
            default: 
            System.out.println("Invalid menu option.");
        }
    }
}
