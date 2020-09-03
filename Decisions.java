
import java.util.Scanner;

/**
 * This is a program that asks the user for two integers, then determines
 * if number1 is multiple of number2.
 *
 * @author Ashlesha Bhamare
 * @version 1.0
 */
public class Decisions {
    /**
     * Prompts user for two integers using Scanner and calculate their division,
     * remainder and display output to the console.
     *
     * @param args A string array containing the command line arguments.
     */
    public static void main(String[] args) {

        //Declaring variables for the program.
        int number1 ,number2, division, remainder;

        // Printing Welcome Message
        System.out.println("Welcome to the Decisions program!");

        // Create a Scanner object to read input.
        Scanner keyboardInput = new Scanner(System.in);

        // Get the number1 and number2 from user separated by space.
        System.out.print("Enter two numbers, separated by a space: ");
        number1 = keyboardInput.nextInt();
        number2 = keyboardInput.nextInt();

        // Checking whether number2 is  zero.
        if (number2 == 0) {
            System.out.print("The second number cannot be zero. " +
                    "Please try again.\n");
        } else {

            // Determining remainder of division.
            remainder = number1 % number2;

            if (remainder != 0) {
                System.out.println(number1 + " is NOT a multiple of " + number2);
            } else {
                // Determining multiplication factor
                division = number1 / number2;
                System.out.println(number1 + " is a multiple of " + number2 +
                        " with a factor of " + division + ".");
            }
        }

        // Printing ThankYou Message
        System.out.println("Thanks for using the Decisions program!");

        //Closing the scanner input
        keyboardInput.close();
    }
}
