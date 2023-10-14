
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompt to ask for first user input.
        //store the integer in a variable.
        //prompt to ask 2nd user input.
        //store the integer in a variable.
        //create formula to get the average
            //multiple it by 1.0
            //store result in a double variable.
        //print final result
        //close scanner
        System.out.println("Give the first number: ");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int num2 = Integer.valueOf(scanner.nextLine());

        // double result = ((num1 + num2)/2);

        System.out.println("The average is "+((num1 + num2)/2.0));

        scanner.close();

    }
}
