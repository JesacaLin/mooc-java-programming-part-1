
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //prompt user for input
        //store user input into a variable
        //sum variable but it can't be 0
        //initialize loop
            //start at 1 and end at input, multiplying along the way
        //print final statement with sum
        //close scanner
        System.out.println("Give a number: ");
        int input = Integer.valueOf(scanner.nextLine());
        int sum = 1;
        for (int i = 1; i <= input; i++) {
            sum = sum * i;
        }
        System.out.println("Factorial: " + sum);
        scanner.close();
    }
}
