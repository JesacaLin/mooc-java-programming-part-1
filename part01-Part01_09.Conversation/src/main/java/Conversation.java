
import java.util.Scanner;
//import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //print a line to ask for user input
        System.out.println("Greetings! How are you doing?");
        //store the user input into a variable
        String answer1 = scanner.nextLine();
        //print a line to ask for user input again
        System.out.println("Oh, how interesting. Tell me more!");
        //store the user input into another variable
        String answer2 = scanner.nextLine();
        //print a line thanking the user.
        System.out.println("Thanks for sharing!");

    }
}
