
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //print prompt to ask for user input
        //convert user input string to integer
            //convert new integer to seconds
        //create a variable to store the converted user input
        //print result

        System.out.println("How many days would you like to convert to seconds? ");

        int seconds = (Integer.valueOf(scanner.nextLine()) * 86400);

        System.out.println(seconds);

    }
}
