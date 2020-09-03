/**
 * This is a sample program that plays a "Mad Libs"-type game with the user.
 * The program should request several values in different categories,
 * then insert them into a paragraph.
 *
 * @author Ashlesha Bhamare
 * @version 1.0
 */
import java.util.Scanner;

public class MadLibs {
    /**
     * Displays out user's details to standard output.
     *
     * @param args A string array containing the command line arguments.
     */
    public static void main (String[] args)
    {
      // Declaring & initialising variables for this program.
        String name="", place="", college="", profession="", animal="", petName =   "";
        String thankYouMessage="";
        int age = 0;
        String welcomeMessage= "Welcome to the Mad Libs game! " +
                "You will be asked to enter specific input. \n" +
                "Let's begin.\n";

        //Printing Welcome Message to console.
        System.out.println(welcomeMessage);

        //Creating scanner object to read Keyboard input.
        Scanner keyboardInput = new Scanner(System.in);

        //Getting user's name
        System.out.print("Enter a name: ");
        name = keyboardInput.nextLine();

        //Getting user's age
        System.out.print("Enter a number: ");
        age = keyboardInput.nextInt();
        keyboardInput.nextLine();

        //Getting user's place
        System.out.print("Enter a place: ");
        place = keyboardInput.nextLine();

        //Getting user's college name
        System.out.print("Enter a college: ");
        college = keyboardInput.nextLine();

        //Getting user's profession
        System.out.print("Enter a profession: ");
        profession = keyboardInput.nextLine();

        //Getting user's pet details
        System.out.print("Enter an animal: ");
        animal = keyboardInput.nextLine();
        System.out.print("Enter a pet name: ");
        petName = keyboardInput.nextLine();

        System.out.println("  ");

        //Printing user description to console.
        String description =  "There once was a person named " + name + " who lived in " + place +
                ". At the age of "+age+", \n" +
                ""+ name +" went to college at "+college+". "+ name +" graduated and went to work as a \n" +
                profession +". Then, "+ name +" adopted a(n) "+ animal +" named "+ petName +". They both \n" +
                "lived happily ever after!\n";

        System.out.println(description);

        thankYouMessage = "Thanks for playing the Mad Libs game!";
        //This will print ThankYou Message to console.
        System.out.println(thankYouMessage);

        //Closing the scanner input
        keyboardInput.close();
    }
}
