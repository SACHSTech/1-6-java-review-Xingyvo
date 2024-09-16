package gr11review.part1;

import java.io.*;

/**
 * Review 2 prints out a statement of options and asks the user to select an 
 * option. Then based on the user's choice, the program will print out a joke.
 * 
 * @author: B. Yu
 */
public class Review2 {

    /**
     * Main method to execute the program's logic
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Declare variable
        int intChoice;

        // Print menu 
        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");

        // Receive choice from user
        System.out.print("Choose a menu option: ");
        intChoice = Integer.parseInt(keyboard.readLine());

        // Output result based on choice
        switch (intChoice) {
            case 0: 
            System.out.println("What is the kind of hair that loves going on vacation on different beaches of the country?");
            System.out.println("The wavy hair!");
            break;
            case 1: 
            System.out.println("What sort of snack do feet like?");
            System.out.println("Dori-toes!");
            break;
            case 2: 
            System.out.println("No I am not a superhero...");
            System.out.println("I just like wearing my underwear on the outside!");
            break;
            case 3:
            System.out.println("What kind of meals do math teachers eat?");
            System.out.println("Square meals!");
            break;
            default: 
            System.out.print("Invalid menu option");
        }
    }
}
