
import java.util.Scanner;
import java.io.*;

/**
 * This program reads from a file and stores integers from the file in Odd,
 * Even and Neg array. It then prints all the three arrays in a formatted
 * manner.
 *
 * @author Ashlesha Bhamare
 * @version 1.0
 */
public class ArrayDistribution
{
    // Declare constants
    final static int SIZE = 30;
    final static String EVEN_ARRAY = "evenNum";
    final static String ODD_ARRAY = "oddNum";
    final static String NEG_ARRAY = "negNum";

    /**
     * This program reads a file and then depending on the conditions those
     * integers are added to odd, even or neg array.
     *
     * @param args A string array containing the command line argument.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
    {
        // Stores one integer at a time from file
        int value = 0;

        // File to read from
        String fileName ;

        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        do
        {
            System.out.print("\nEnter the Filename: ");
            fileName = keyboard.nextLine();

        } while (fileName == null || fileName.length() == 0);

        // Declare arrays with max capacity
        int[] evenNum = new int[SIZE];
        int[] oddNum = new int[SIZE];
        int[] negNum = new int[SIZE];

        // Declare indexes where the next value will be added in each array
        int indexEven = 0;
        int indexOdd = 0;
        int indexNeg = 0;

        // Scanning the file
        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);

        // scan one integer at a time from the file
        while (inputFile.hasNext())
        {
            value = inputFile.nextInt();

            // Handles only the non zero values
            if (value != 0)
            {
                if (value < 0)
                {
                    negNum[indexNeg] = value;
                    indexNeg++;
                }
                else
                {
                    if (value % 2 == 0)
                    {
                        evenNum[indexEven] = value;
                        indexEven++;
                    }
                    else
                    {
                        oddNum[indexOdd] = value;
                        indexOdd++;
                    }
                }
            }
        }

        // Printing contents for Even Array
        printContents(evenNum, indexEven, EVEN_ARRAY);

        // Printing contents for Odd Array
        printContents(oddNum, indexOdd, ODD_ARRAY);

        // Printing contents for Negative Array
        printContents(negNum, indexNeg, NEG_ARRAY);

        System.out.println();

        inputFile.close();
        keyboard.close();                        // Closing Scanner
    }

    /**
     * This function takes in an int array, array name and an index until
     * which the array has been filled.
     *
     * @param array Array Either of even, odd or neg array.
     * @param index Index in an array until which the array is filled.
     * @param arrayName Name of even, odd or neg array.
     *
     */
    public static void printContents(int[] array, int index, 
                                                       String arrayName)
    {
        System.out.println();

        for (int i = 0; i < index; i++)
        {
            System.out.println(arrayName + "[" + i + "]: " + array[i]);
        }
    }

}
