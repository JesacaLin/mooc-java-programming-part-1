
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //print prompt for user input 2x
        //store input in a variable, converted to int 2x
        //initialize sum variable to track calculations
        //initialize loop - limits are withing the two inputs
        //print result string
        //close the scanner
        System.out.println("First number? ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number? ");
        int last = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
        scanner.close();
    }
}
