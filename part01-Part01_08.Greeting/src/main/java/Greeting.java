import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //promp user with for name
        System.out.println("What's your name? ");

        //store user input into a variable
        String greeting = scanner.nextLine();

        //print and concat string with variable
        System.out.println("Hi " + greeting);

        scanner.close();
    }
}
