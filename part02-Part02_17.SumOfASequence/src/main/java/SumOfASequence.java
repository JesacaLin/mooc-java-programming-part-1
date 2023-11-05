
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //print prompt to ask user for input
        //store input in a variable
        //intialize a sum variable to store ongoing calculations
        //intialize a loop
            //staring at 1, up to user input, adding to sum with each iteration.
        //print result of sum
        //close scanner
        System.out.println("Last number? ");
        int input = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
        scanner.close();
    }
}
