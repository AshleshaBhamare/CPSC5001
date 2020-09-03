                                                                                
import java.util.Scanner;                                                       
import java.util.Random;                                                        
                                                                                
/**                                                                             
 * This is a program that plays a "Guessing Game" with the user.                
 *                                                                              
 * @author Ashlesha Bhamare                                                     
 * @version 1.0                                                                 
 */                                                                             
public class GuessGame {                                                        
    /**                                                                         
     * The computer should choose a "random" number within a given              
     * range (chosen by you) and give the user a chance to guess                
     * the number. The user should be given an unlimited number of              
     * guesses and on each guess should be told whether their guess is          
     * too high, too low or correct and display output to console. Also         
     * allows user to repeat program.                                           
     *                                                                          
     * @param args A string array containing the command line arguments.        
     */                                                                         
                                                                                
    public static void main(String[] args) {                                    
                                                                                
        int number = 0;                     // To hold Users guessed num        
        final int LOWER_BOUND = 1;          // To hold LOWER_BOUND              
        final int HIGHER_BOUND = 100;       // To hold HIGHER_BOUND             
        int randomNum = 0;                  // To hold randomNum                
        String input = "";                  // To hold input                    
        char repeat;                        // To hold 'y' or 'n'               
                                                                                
        System.out.println("");             // Prints a blank line              
                                                                                
        // Printing Welcome Message                                             
        System.out.println("The GuessGame program plays a guessing game. " +    
                "The program will choose a \"random\" \n" +                     
                "number between " + LOWER_BOUND + "-" + HIGHER_BOUND + " and " +
                "give the you a " + "chance to guess" +                         
                " the number. You will be \n" + "given an unlimited number " +  
                "of guesses and on each guess, you will be told \n" +           
                "whether your guess is too high, too low, or correct. " +       
                "You will have the chance \n" +                                 
                "to repeat the game as many times you wish.\n" + "\n" +         
                "Let's begin..." + "\n");                                       
                                                                                
        // Create a Random object.                                              
        Random randomNumbers = new Random();                                    
                                                                                
        // Create a Scanner object to read input.                               
        Scanner keyboard = new Scanner(System.in);                              
                                                                                
        do { // Outer loop to repeat this game                                  
            // Generate a random Number and assign it to randomNum.             
            // Adding 1 to avoid 0 as random number                             
            randomNum = 1 + randomNumbers.nextInt(100);                         
            do {  // Inner loop to generate random number and play the game     
                // Get number from user.                                        
                System.out.print("Guess a number between " + LOWER_BOUND +      
                        "-" + HIGHER_BOUND + ": ");                             
                number = keyboard.nextInt();                                    
                                                                                
                // Checking whether number is less than randomNum.              
                if (number < randomNum) {                                       
                    System.out.println("Your guess is too low. Try again. ");   
                } else if (number > randomNum) {                                
                    System.out.println("Your guess is too high. " +             
                            "Try again." + " ");                                
                }                                                               
            } while ((number < randomNum) || number > randomNum);               
                                                                                
            // Checking if user guessed the correct number                      
            if (number == randomNum) {                                          
                System.out.println("Your guess is correct!");                   
            }                                                                   
                                                                                
            System.out.println();   // Prints a blank line                      
                                                                                
            // Checking if user wants to guess another number.                  
            System.out.print("Would you like to guess another number (y/n)? "); 
                                                                                
            input = keyboard.next();  // Read a line.                           
            repeat = input.charAt(0);     // Get the first char.                
            System.out.println();   // Prints a blank line                      
                                                                                
        } while (repeat == 'Y' || repeat == 'y');                               
                                                                                
        // Printing ThankYou Message.                                           
        System.out.println("Thanks for playing the GuessGame!");                
                                                                                
        //Closing the scanner input                                             
        keyboard.close();                                                       
    }                                                                           
}                                                                               
                                                                                
