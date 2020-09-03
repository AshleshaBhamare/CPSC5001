
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

/**
 * This program reads a file, populates the array list. After populating this
 * array list, it sorts the number in non-descending order and prints them on
 * console. After sorting the numbers, user are prompted to input a key value
 * to be found in the array, if the value is spotted, the first index at which
 * the value is present is returned with the value.
 * If the value is not found in the index, value not found message display on
 * the console.
 *
 * @author Ashlesha Bhamare
 * @version 1.0
 *
 */
public class BinarySearch {
    /**
     * This function initially reads a file from source provided by the user,
     * displays that on console, then sorts it in non-descending order and
     * again displays on the console. Binary search is then carried out on
     * the sorted array and users are asked to input a number to be searched
     * in the array
     * list.
     *
     * @param args A string array containing the command line arguments.
     * @throws IOException File open operation can throw an IOException when
     * not found
     */

    // Declaring Maximum capacity of the array list
    final static int MAX_SIZE = 30;

    public static void main(String[] args) throws IOException
    {
        String fileName;                        // To hold fileName
        String input;                           // To hold input
        char repeat;                            // To hold 'y' or 'n'

        // Creating an array list with MAX_SIZE capacity
        ArrayList<Integer> list = new ArrayList<>(MAX_SIZE);

        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        System.out.print("\nEnter the filename: ");
        fileName = keyboard.nextLine();

        System.out.println("\nArray list elements before sort: ");

        // Fills values from file into the arraylist and gets the index up to
        // which the arraylist is filled
        populateArrayList(list, fileName);

        // Printing the unsorted arraylist to the console
        printArrayList(list);

        System.out.println("\nArray list elements after sort: ");

        // Sorting the array in non descending order
        selectionSort(list);

        // Printing the sorted arraylist to the console
        printArrayList(list);

        int number = 0;                       // Initializing number to zero
        int position = -1;                    // Initializing position to -1

        do
        {
            System.out.print("\nEnter a number to search in the list: ");
            number = keyboard.nextInt();
            keyboard.nextLine();

            position = BinarySearch(list, number);

            if(position == -1)
                System.out.println(number+ " not found " );
            else
                System.out.println(number + " found at index " + position);

            System.out.print("Would you like to repeat (y/n)? ");
            input = keyboard.next();
            repeat = input.charAt(0);

        }  while(repeat == 'Y' || repeat == 'y');

        System.out.println();

        keyboard.close();                        // Closing Scanner object

    }
    /**
     * This function populates the array and returns the array size,
     * i.e the index still which the array is populated.
     *
     * @param list arraylist that needs to be filled
     * @param fileName name of the file to read from
     * @throws IOException File open operation can throw an IOException when
     * not found
     */
    public static void populateArrayList(ArrayList<Integer> list,
                                         String fileName) throws IOException
    {
        // Reading from file.
        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);

        while(inputFile.hasNext())
        {
            list.add(inputFile.nextInt());
        }

        inputFile.close();                        // Closing file.
    }

    /**
     * This function prints the arraylist on the console
     *
     * @param list ArrayList to print
     */
    public static void printArrayList(ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println("index:\t" + i + "\tvalue:\t" + list.get(i));
        }
    }

    /**
     * This function sorts the entered array in non-descending order.
     *
     * @param list ArrayList to be sorted
     */
    public static void selectionSort(ArrayList<Integer> list)
    {
        int temp;                                  // To hold temp
        int minIndex;                              // To hold minIndex

        for (int i = 0; i < list.size()-1; i++)
        {
            minIndex = i;
            for (int j = i+1; j < list.size(); j++)
            {
                if(list.get(minIndex) > list.get(j))
                {
                    minIndex = j;
                }
            }

            if ((i != minIndex))
            {
                temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }
    /**
     * This function carries out Binary Search on the inputted arraylist
     * and if the number is found returns the index of that respective number
     * and if not found returns -1 integer.
     *
     * @param list array Inputted arraylist
     * @param key value to be found.
     * @return int index at which the key is found, -1 if not found.
     */

    public static int BinarySearch(ArrayList<Integer> list, int key)
    {
        int first = 0;                            // Initialize first to zero
        int middle;                               // To hold middle
        int last = list.size()-1;                 // To hold last

        while(first <= last)
        {
            middle = (first + last)/2;
            if (list.get(middle) == key)
                return middle;
            else if (list.get(middle) < key)
                first = middle + 1;
            else
                last = middle - 1;
        }
        return -1;
    }
}
