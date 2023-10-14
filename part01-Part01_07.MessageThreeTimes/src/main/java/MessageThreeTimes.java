
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here

        //store the user input into a variable 
        String userInput = scanner.nextLine();

        //print the variable multiple times
        System.out.println(userInput);
        System.out.println(userInput);
        System.out.println(userInput);
    }
}
