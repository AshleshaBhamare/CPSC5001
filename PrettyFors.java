import java.util.Scanner;
/**
 * This is the program that illustrating basic and nested "for" loops.
 *
 * @author Ashlesha Bhamare
 * @version 1.0
 */
public class PrettyFors {
    /**
     * Prompts user for one positive integer using Scanner
     * (check to make sure it is a positive integer) and uses the
     * integer to display several patterns on the screen
     *
     * @param args A string array containing the command line arguments.
     */
    public static void main(String[] args) {

        int positiveInteger;         // To hold Users positiveInteger.

        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        do {
            // Get positiveInteger from user.
            System.out.print("Enter Positive Integer: ");
            positiveInteger = keyboard.nextInt();

            // Checking whether positiveInteger is greater than zero.
            if (positiveInteger > 0) {

                System.out.println("");      // Prints a blank line
                // Pattern 1.
                System.out.println("1. " + positiveInteger + " copies of "
                        + positiveInteger + " " + "on one line." + "\n");

                for (int col = 0; col < positiveInteger; col++) {
                    System.out.print(positiveInteger);
                }

                System.out.println("\n");    // Prints a blank line
                // Pattern 2.
                System.out.println("2. " + positiveInteger +
                        " lines with " + "single 1 on each line." + "\n");

                for (int row = 0; row < positiveInteger; row++) {
                    System.out.println("1");
                }

                System.out.println("\n");
                // Pattern 3.
                System.out.println("3. Multiplication table to "
                        + positiveInteger + ". " + "\n");


                int counter = 1;

                for (int i = 1; i <= positiveInteger; i++) {
                    // System.out.printf("  " );
                    if (i == 1)
                        System.out.printf("%-2s %2d", " ", i);
                    else if (i == 10)
                        System.out.printf("%-4s %1d", " ", i);
                    else
                        System.out.printf("%-2s %3d", " ", i);
                }

                System.out.println(" ");      // Prints a blank line

                for (int r = 1; r <= positiveInteger; r++) {
                    System.out.print(r);
                    counter = 1;
                    for (int c = 1; c < (positiveInteger + 1); c++) {

                        if (r < 10)
                            System.out.printf("%-2.4s %-3d", " ", counter * r);
                        else
                            System.out.printf("%-1s %-4d", " ", counter * r);
                        counter++;
                    }
                    System.out.println();
                }

                System.out.println("\n");
                // Pattern 4.
                System.out.println("4. " + positiveInteger +
                        " lines with one 1 " + "on the first line, 2"
                        + " twos on the " + "second," + " etc." + "\n\t" +
                        "to " + positiveInteger + " " + positiveInteger +
                        "'s on the last line. " + "\n");
                counter = 1;
                for (int r = 1; r <= positiveInteger; r++) {
                    for (int c = 1; c < (r + 1); c++) {
                        System.out.print(counter + " ");
                    }
                    counter++;
                    System.out.println();
                }

                System.out.println("\n");
                // Pattern 5.
                System.out.println("5. The outline of a diamond, " + "with "
                        + positiveInteger + " at the widest point.\n");

                for (int i = 1; i <= positiveInteger; i++) {
                    for (int r = 1; r < i; r++)
                        System.out.print(" ");
                    System.out.println(i + " ");
                }
                for (int i = positiveInteger - 1; i > 0; i--) {
                    for (int r = 1; r < i; r++)
                        System.out.print(" ");
                    System.out.println(i + " ");
                }
            }
        } while (positiveInteger <= 0);
        //Closing the scanner input
        keyboard.close();
    }

}
