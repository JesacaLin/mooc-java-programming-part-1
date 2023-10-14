
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //print a prompt asking for user input
        //convert the user input from strings to integers
        //perform calculation and store it into a variable
        //print final results

        System.out.println("Give the first number: ");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int num2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number: ");
        int num3 = Integer.valueOf(scanner.nextLine());

        // int result = num1 + num2 + num3;

        System.out.println("The sum of the numbers is "+(num1 + num2 + num3));

        scanner.close();

    }
}
