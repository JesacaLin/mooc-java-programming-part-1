
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //initalize a counter
        //initalize a loop
            //ask for input and store in a variable
            //conditional: if input is 0, break out of loop
            //conditional: if input is negative, update the counter
        //print the number of negative numbers
        //close scanner
        int counter = 0;

        while (true) {
            System.out.println("Give a number: ");

            int input = Integer.parseInt(scanner.nextLine());

            if (input == 0) {
                break;
            }

            if (input < 0) {
                counter += 1;
            }
        }
        System.out.println("Number of negative numbers: "+counter);

        scanner.close();
    }
}
