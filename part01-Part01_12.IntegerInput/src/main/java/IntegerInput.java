
//import java.util.Scanner;
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write line to ask for user input for an integer;
        System.out.println("Give a number:");

        //convert the user input into an int
        //store it in a integer variable

        int value = Integer.valueOf(scanner.nextLine());

        //print new line with the converted value
        System.out.println("You gave the number "+value);

    }
}
