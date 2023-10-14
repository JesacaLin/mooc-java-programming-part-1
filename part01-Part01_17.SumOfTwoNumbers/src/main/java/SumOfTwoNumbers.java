
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //print prompt to request user input 1 and 2
        //convert the input strings to integers
        //calculate and store it in a variable
        //print the final result

        System.out.println("Give the first number: ");
        int num1 = Integer.valueOf(scanner.nextLine());
    
        System.out.println("Give the second number: ");
        int num2 = Integer.valueOf(scanner.nextLine());

        int result = (num1 + num2);

        System.out.println("The sum of the numbers is "+result);

        scanner.close();

    }
}
