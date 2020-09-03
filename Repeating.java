
import java.util.Scanner;   // Needed for the Scanner class

/**
 * This is a program that asks the user for two integers,
 * then determines if number1 is multiple of number2 and allow
 * the user to repeat the program as many times as desired.
 *
 * @author Ashlesha Bhamare
 * @version 1.0
 */
public class Repeating {
    /**
     * Prompts user for two integers using Scanner and calculate their
     * division, remainder and display output to the console.
     *
     * @param args A string array containing the command line arguments.
     */
    public static void main(String[] args) {

        int number1, number2;    // Two numbers
        int division;            // to hold Factor
        int remainder;           // To hold remainder
        char repeat;             // To hold 'y' or 'n'
        String input = "";       // To hold input

        // Printing Welcome Message
        System.out.println("Welcome to the Repeating program!");
        System.out.println();   // Prints a blank line

        // Create a Scanner object to read input.
        Scanner keyboardInput = new Scanner(System.in);

        do {
            do {
                // Get the number1 and number2 from user separated by space.
                System.out.print("Enter two numbers,"  
                                    + " separated by a space: ");
                number1 = keyboardInput.nextInt();
                number2 = keyboardInput.nextInt();

                // Checking whether number2 is  zero.
                if (number2 == 0) {
                    System.out.print("The second number cannot be zero."
                            + "Please try again.\n");
                    System.out.println();   // Prints a blank line
                }
            } while (number2 == 0);

            // Determining remainder of division.
            remainder = number1 % number2;

            if (remainder != 0) {
                System.out.println(number1 + " is NOT a multiple of "
                        + number2);
            } else {
                // Determining multiplication factor
                division = number1 / number2;
                System.out.println(number1 + " is a multiple of " + number2 +
                        " with a factor of " + division + ".");
            }
            // Does the user want to repeat
            System.out.print("Would you like to repeat (y/n)? ");

            input = keyboardInput.next();  // Read a line.
            repeat = input.charAt(0);     // Get the first char.

            System.out.println();   // Prints a blank line

        } while (repeat == 'Y' || repeat == 'y');

        // Printing ThankYou Message
        System.out.println("Thanks for using the Repeating program!");

        //Closing the scanner input
        keyboardInput.close();
    }
}
