
import java.util.Scanner;               //Needed for Scanner class

/**
 * This program calculates a depreciated value of an item entered by the
 * user. It asks the user to input description of the item, original value
 * and the annual depreciation. It calculates the accumulated depreciation
 * report and Repeats the program as many times as the user wants.
 *
 * @author Ashlesha Bhamare
 * @version 1.0
 */
public class Depreciation 
{

    /**
     * Prompts user for item description, original value and annual
     * depreciation and then prints item depreciation table.
     *
     * @param args A string array containing the command line arguments.
     */
    public static void main(String[] args) 
    {
        char repeat;                   // To hold 'y' or 'n'
        String input = "";             // To hold input

        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        //Calling the welcome function.
        welcome();

        do {
            String itemName = itemDescription(keyboard);
            double originalValue = getOriginalValue(keyboard);
            double annualDepreciation = getAnnualDepreciation(keyboard);

            //prints the values entered bu user.
            printDescription(itemName, originalValue,
                    annualDepreciation);

            //prints the depreciation table
            printTable(originalValue, annualDepreciation);

            System.out.println("");

            System.out.print("\nDo you want to depreciate another item (y/n)?"
                    + " ");
            input = keyboard.next();
            repeat = input.charAt(0);
            keyboard.nextLine();
            System.out.println("");

        } while (repeat == 'Y' || repeat == 'y');

        keyboard.close();               // Close scanner object

        //Calling goodbye function.
        goodBy();
    }

    /**
     * Displays a welcome message on the screen.
     */
    public static void welcome() 
    {
        System.out.println("\nWelcome to the asset depreciation reporting "
                + "system," + " brought to you by \n"
                + "Slime, Weasel, and Swindle. This program displays" +
                " asset depreciation value \n" + "over the consecutive " +
                "years" + ".\n");
    }

    /**
     * Gets description of the item user wants to calculate depreciated
     * value of.
     *
     * @param keyboard For taking input from command line.
     * @return Returns the itemName from the command line.
     */
    public static String itemDescription(Scanner keyboard) 
    {
        String itemName = null;
        do {
            System.out.print("Enter a description of the Equipment: ");
            itemName = keyboard.nextLine();

        } while (itemName == null || itemName.length() == 0);

        return itemName;
    }

    /**
     * Gets original value of the item form user.
     *
     * @param keyboard For taking input from command line.
     * @return Returns the original value entered by user.
     */
    public static double getOriginalValue(Scanner keyboard) 
    {
        double originalValue = 0.0;

        do {
            System.out.print("What is the original value of the equipment? $");
            originalValue = keyboard.nextDouble();
            keyboard.nextLine();
            if (originalValue <= 0) {
                System.out.println("Enter a value greater than zero");
            }

        } while (originalValue <= 0);

        return originalValue;
    }

    /**
     * Gets annual depreciation value for the item.
     *
     * @param keyboard For taking input from command line.
     * @return Returns annual depreciation value entered by user.
     */
    public static double getAnnualDepreciation(Scanner keyboard) 
    {
        double annualDepreciation = 0.0;
        do {
            System.out.print("What is the annual depreciation? $");
            annualDepreciation = keyboard.nextDouble();
            keyboard.nextLine();
            if (annualDepreciation <= 0) {
                System.out.println("Enter annual depreciation greater " +
                        "than zero");
            }

        } while (annualDepreciation <= 0);

        return annualDepreciation;
    }

    /**
     * Prints equipment description, beginning value and depreciation on the
     * console.
     *
     * @param itemName           The equipment name.
     * @param originalValue      The beginning value of the item.
     * @param annualDepreciation The depreciation value of item annually.
     */
    public static void printDescription(String itemName,
                                        double originalValue,
                                        double annualDepreciation) 
    {
        System.out.println("\nEquipment description: " + itemName);
        System.out.printf("Beginning value: $%.2f%n", originalValue);
        System.out.printf("Depreciation: $%.2f%n", annualDepreciation);
    }

    /**
     * Prints out depreciation table in a formatted way by carrying some
     * operations on the entered data.
     *
     * @param annualDepreciation The depreciation value of item annually.
     * @param originalValue      The beginning value of the item.
     */
    public static void printTable(double originalValue,
                                  double annualDepreciation) 
    {
        System.out.println("\nYear\tDepreciation\tEnd-of-Year Value" +
                "\tAccumulated Depreciation");
        int year = 1;
        double accumulatedDepreciation = annualDepreciation;
        double endOfYearValue = originalValue - annualDepreciation;

        do {
            System.out.println("");
            printDepreciationReport(year, annualDepreciation, endOfYearValue,
                    accumulatedDepreciation);

            year++;
            endOfYearValue -= annualDepreciation;
            accumulatedDepreciation += annualDepreciation;

        } while (endOfYearValue >= 0);


    }

    /**
     * This function prints the calculated values on console with formatted
     * settings.
     *
     * @param year                    Year of depreciation.
     * @param annualDepreciation      Annual depreciation value of item.
     * @param endOfYearValue          Value at the end of year.
     * @param accumulatedDepreciation Value accumulated at the end of year.
     */
    public static void printDepreciationReport(int year, 
                                            double annualDepreciation,
                                            double endOfYearValue,
                                            double accumulatedDepreciation)
    {
 
        System.out.printf("%2d\t", year);
        System.out.print(String.format("$ %1.2f ", annualDepreciation));

        System.out.print("\t" + String.format("$%8.2f", endOfYearValue));
        System.out.print("\t\t" + String.format("$%8.2f",
                accumulatedDepreciation));

    }

    /**
     * This function displays a goodbye message to the user.
     */
    public static void goodBy() 
    {
        System.out.println("Goodbye, and thanks for using the asset "
                + "depreciation reporting system!\n");
    }


}


